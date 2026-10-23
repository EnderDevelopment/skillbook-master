package com.enderdevelopment.plugin;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BookMeta;

public class SkillBookCommand implements CommandExecutor {
    private final List<Skill> skills = new ArrayList<>();

    public SkillBookCommand() {
        skills.add(new BeezlebubSkill());
    }
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("This command can only be used by players.");
            return true;
        }

        Player player = (Player) sender;
        ItemStack book = new ItemStack(Material.WRITTEN_BOOK);
        BookMeta meta = (BookMeta) book.getItemMeta();
        meta.setTitle("Skill Book");
        meta.setAuthor("Server");
        meta.addPage("This is a skill book.\n\nUse it to learn new skills!");
        book.setItemMeta(meta);
        player.getInventory().addItem(book);
        player.sendMessage("You have been given a skill book!");
        return true;
    }
}