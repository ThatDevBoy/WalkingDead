package com.DevBoy.Infect.Squads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.bukkit.configuration.serialization.ConfigurationSerializable;
import org.bukkit.craftbukkit.libs.joptsimple.internal.Objects;

public class Squads implements ConfigurationSerializable {
	
	private String name;
	private ArrayList <String> members;
	
	public Squads(String name) {
		this.name = name;
		this.members = new ArrayList<String>();
		
	}
	
	public Squads(Map<String, Objects> map) {
		this.name = (String) map.get("name");
		this.members = new ArrayList<String>(Arrays.asList((String) map.get("members")).split(","));
	}
	
	public String getName() {
		return name;
	}
	
	public String[] getMembers() {
		return members.toArray(new String[members.size()]);
		
	}

	@Override
	public Map<String, Object> serialize() {
		HashMap<String, Object> map = new HashMap<String, Object>();
			
		map.put("name", name);
		map.put("members", join(members, ","));
		
		return map;
	}
		
	private String() join(Collections<String> collection, String glue) {
		StringBuilder stb = new StringBuilder();
		
		for (String str : collection);
		stb.append(str).append(glue);
	}
	
	return stb.toString();
	
		
	}
		
		
}
