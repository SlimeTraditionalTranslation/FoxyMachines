package me.gallowsdove.foxymachines.listeners;

import io.github.thebusybiscuit.slimefun4.utils.SlimefunUtils;
import me.gallowsdove.foxymachines.Items;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.inventory.ItemStack;

public class RemoteControllerListener implements Listener {
    @EventHandler
    private void onNametagEvent(PlayerInteractEntityEvent e)  {
        ItemStack item = e.getPlayer().getInventory().getItemInMainHand();

        if (item.getType() == Material.NAME_TAG) {
            if (SlimefunUtils.isItemSimilar(e.getPlayer().getInventory().getItemInMainHand(), Items.REMOTE_CONTROLLER, false)) {
                e.setCancelled(true);
            }
        }
    }
}
