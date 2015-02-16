package com.DevBoy.Infect;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	
	// Main class is still a WIP
	
	public void onEnable() {
		System.out.println("TheInfection is now enabled!");
			
		}
		
	public void onDisable() {
		System.out.println("TheInfection is now disabled!");
		}
		
	public boolean onCommand(CommandSender p, Command cmd, String label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("infect")) {
			if(p.hasPermission("infect.help")) {
				p.sendMessage(ChatColor.RED + "   -= Infect Help Menu -=    ");
			}else {
				p.sendMessage(ChatColor.RED + "You don't have the required permission! You must have the permission infect.help!");
			}
		}
			return false;

}
}
