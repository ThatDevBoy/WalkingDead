package com.DevBoy.Infect.Guns;

import org.bukkit.Bukkit;
import org.bukkit.Effect;
import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;
import org.bukkit.entity.Snowball;
import org.bukkit.event.Event;
import org.bukkit.event.EventHandler;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Guns {
	
	
	public void onEnable() {
		Bukkit.getServer().getPluginManager().registerEvents(new Event(), this);
	}
	
	@EventHandler
	public void onPlayerInteract(final PlayerInteractEvent e) {
	if(!(e.getAction() == Action.RIGHT_CLICK_AIR)) return; //if code catches player not clicking air code stops
	if(!(e.getItem().getType() == Material.BLAZE_ROD)) return; //makes sure the player is using a blaze rod and if not it stops them.
	Snowball s = e.getPlayer().launchProjectile(Snowball.class); // snowball launch
	s.getWorld().playEffect(e.getPlayer().getLocation(), Effect.SMOKE, 10); //Will play a smoke effect when player shoots
	
	}
	 
	@SuppressWarnings("deprecation")
	@EventHandler
	public void onProjectileHit(ProjectileHitEvent e) {
	Projectile p = e.getEntity();
	if(!(p instanceof Snowball)) {
	return;
	}
	Snowball s = (Snowball) p;
	s.getWorld().createExplosion(s.getLocation(), 5.0F);
	for(Entity en : s.getNearbyEntities(5, 30, 5)) {
	if(en instanceof Player) {
	Player pl = (Player) en;
	if(!(pl == e.getEntity().getShooter())) pl.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 100, 0));
	}
	}
	}

}
