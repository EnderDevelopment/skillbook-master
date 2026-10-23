package com.enderdevelopment.plugin;

import org.bukkit.entity.Player;

public abstract class Skill {
    private final String name;
    
    public Skill(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public abstract void apply(Player player);
}