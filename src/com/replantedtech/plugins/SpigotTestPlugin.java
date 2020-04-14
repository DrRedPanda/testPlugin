package com.replantedtech.plugins;

import org.bukkit.plugin.java.JavaPlugin;

public class SpigotTestPlugin extends JavaPlugin {
	@Override
	public void onEnable() {
		this.getCommand("kit").setExecutor(new CommandKit());
	}
	
	@Override
	public void onDisable() {
		
	}
}
