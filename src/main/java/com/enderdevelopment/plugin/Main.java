package com.enderdevelopment.plugin;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("SkillBooks plugin enabled!");
        this.getCommand("skillbook").setExecutor(new SkillBookCommand());
    }

    @Override
    public void onDisable() {
        getLogger().info("SkillBooks plugin disabled!");
    }
}