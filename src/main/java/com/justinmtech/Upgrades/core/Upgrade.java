package com.justinmtech.Upgrades.core;

import org.bukkit.configuration.serialization.ConfigurationSerializable;
import org.bukkit.inventory.ItemStack;

import java.util.Map;

public class Upgrade implements ConfigurationSerializable {
    private String displayName;
    private String lore;
    private String type;
    private int level;
    private int maxLevel;
    private ItemStack item;
    private String permission;

    public Upgrade(String displayName, String lore, String type, int level, int maxLevel, ItemStack item, String permission) {
        this.displayName = displayName;
        this.lore = lore;
        this.type = type;
        this.level = level;
        this.maxLevel = maxLevel;
        this.item = item;
        this.permission = permission;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getLore() {
        return lore;
    }

    public void setLore(String lore) {
        this.lore = lore;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getMaxLevel() {
        return maxLevel;
    }

    public void setMaxLevel(int maxLevel) {
        this.maxLevel = maxLevel;
    }

    public ItemStack getItem() {
        return item;
    }

    public void setItem(ItemStack item) {
        this.item = item;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    @Override
    public Map<String, Object> serialize() {
        return null;
    }
}
