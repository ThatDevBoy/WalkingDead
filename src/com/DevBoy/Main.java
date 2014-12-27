package com.DevBoy.Infect;

import java.util.Map;

import org.bukkit.plugin.java.JavaPlugin;

import com.DevBoy.Infect.Squads.Squads;

public class Main extends JavaPlugin {
	//un-finished more to add to this class in the future	
	
	public void onEnable() {
		System.out.println("TheInfection is now enabled!");
		SettingsManager.getInstance().setup(this);
		
		SettingsManager().getInstance().set("sampleteam", new Squads("SquadDev"));
		Squads squad = new Squads (SettingsManager.getInstance().<Map<String, Object>> get("sampleteam");
		System.out.println(Squads.getName());
	}
	
	public void onDisable() {
		System.out.println("TheInfection is now disabled!");
	}
	
	

}
