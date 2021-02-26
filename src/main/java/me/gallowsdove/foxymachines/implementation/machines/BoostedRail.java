package me.gallowsdove.foxymachines.implementation.machines;

import io.github.thebusybiscuit.slimefun4.core.attributes.Placeable;
import io.github.thebusybiscuit.slimefun4.core.handlers.BlockBreakHandler;
import io.github.thebusybiscuit.slimefun4.core.handlers.BlockPlaceHandler;
import me.gallowsdove.foxymachines.Items;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.api.BlockStorage;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.inventory.ItemStack;

import java.util.List;

public class BoostedRail extends SlimefunItem implements Placeable {
    public BoostedRail(SlimefunItemStack item, ItemStack[] recipe, int amount) {
        super(Items.category, item, RecipeType.ENHANCED_CRAFTING_TABLE, recipe, new SlimefunItemStack(item, amount));
    }

    @Override
    public void preRegister() {
        addItemHandler(onBreak(), onPlace());
    }

    private BlockBreakHandler onBreak() {
        return new BlockBreakHandler(false, false) {
            @Override
            public void onPlayerBreak(BlockBreakEvent e, ItemStack item, List<ItemStack> drops) {
                BlockStorage.clearBlockInfo(e.getBlock());
            }
        };
    }

    private BlockPlaceHandler onPlace() {
        return new BlockPlaceHandler(false) {
            @Override
            public void onPlayerPlace(BlockPlaceEvent e) {
                BlockStorage.addBlockInfo(e.getBlock(), "boosted", "true");
            }
        };
    }
}