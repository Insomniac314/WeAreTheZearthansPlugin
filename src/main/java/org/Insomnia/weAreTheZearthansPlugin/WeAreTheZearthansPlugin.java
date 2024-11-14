package org.Insomnia.weAreTheZearthansPlugin;

import org.Insomnia.weAreTheZearthansPlugin.database.SQLiteLoader;
import org.bukkit.plugin.java.JavaPlugin;

public final class WeAreTheZearthansPlugin extends JavaPlugin {

    private static WeAreTheZearthansPlugin instance;
    private static SQLiteLoader db;

    @Override
    public void onEnable() {
        // Plugin startup logic
        instance = this;
        this.saveDefaultConfig(); //generates config directory
        db = new SQLiteLoader(this); //creates and loads SQLite db
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
