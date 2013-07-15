package me.zombierush;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class FastZombies extends JavaPlugin implements Listener {
	@EventHandler
	public void onZombieSpawn(CreatureSpawnEvent event) {
		/**
		 * Sets the Zombie's Speed quite high.
		 * @TODO: Make a Mob API to do this, makes much more sense.
		 */
		if(event.getEntityType() == EntityType.ZOMBIE) {
			event.getEntity().addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 900, 4));
		}
	}
}
