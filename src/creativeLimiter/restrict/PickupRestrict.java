package creativeLimiter.restrict;

import org.bukkit.GameMode;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerPickupItemEvent;

public class PickupRestrict implements Listener {

	@EventHandler(priority = EventPriority.HIGH, ignoreCancelled = true)
	public void onDrop(PlayerPickupItemEvent event) {
		if (event.getPlayer().getGameMode() == GameMode.CREATIVE) {
			if (!event.getPlayer().hasPermission("CreativeLimiter.bypass")) {
				event.setCancelled(true);
			}
		}
	}

}
