package me.zombierush;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	public void onEnable() {
		Bukkit.getServer().getPluginManager().registerEvents(new FastZombies(), this);
	}
	
	public void onDisable() {
		
	}
}

