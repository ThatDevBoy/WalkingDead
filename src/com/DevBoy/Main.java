package com.DevBoy.Infect;

import java.util.Map;

import org.bukkit.plugin.java.JavaPlugin;

import com.DevBoy.Infect.Squads.Squads;

public class Main extends JavaPlugin {
	// Main class is still a WIP
	
	public void onEnable() {
		System.out.println("TheInfection is now enabled!");
		SettingsManager.getInstance().setup(this);
		
	}
	
	public void onDisable() {
		System.out.println("TheInfection is now disabled!");
	}
	
	public boolean onCommand(CommandSender p, Command cmd, String label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("infect")) {
			if(p.hasPermission("infect.help")) {
				sender.sendMessage(ChatColor.RED + "   -= Infect Help Menu -=    ");
			}else {
				p.sendMessage(ChatColor.RED + "You don't have the required permission! You must have the permission infect.help!);
			}
	}
	

}

