package com.justinmtech.Upgrades.listeners;

import com.justinmtech.Upgrades.Upgrades;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class PlayerDamageDealtListener implements Listener {
    private Upgrades plugin;
    private double multiplier;

    public PlayerDamageDealtListener(Upgrades plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerDamageDealt(EntityDamageByEntityEvent e) {
        if (e.getEntity() instanceof Player && e.getDamager() instanceof Player) {
        Player attacker = (Player) e.getDamager();
        Player defender = (Player) e.getEntity();
        double damageDealt = e.getDamage();
        double extraDamage = damageDealt / multiplier;
        defender.damage(extraDamage);
        }
    }

    public double getMultiplier() {
        return multiplier;
    }

    public void setMultiplier(double multiplier) {
        this.multiplier = multiplier;
    }
}
