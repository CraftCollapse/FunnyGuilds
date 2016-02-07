package net.dzikoysk.funnyguilds.listener.region;

import net.dzikoysk.funnyguilds.system.protection.ProtectionSystem;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockIgniteEvent;

public class BlockIgniteListener implements Listener {

    @EventHandler
    public void onIgnite(BlockIgniteEvent e) {
        if (ProtectionSystem.build(e.getPlayer(), e.getBlock().getLocation())) e.setCancelled(true);
    }

}

