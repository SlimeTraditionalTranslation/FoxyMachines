package me.gallowsdove.foxymachines;

import me.gallowsdove.foxymachines.listeners.ChunkLoaderPlaceListener;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;
import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import me.mrCookieSlime.Slimefun.cscorelib2.item.CustomItem;

public class FoxyMachines extends JavaPlugin implements SlimefunAddon {
  private static FoxyMachines instance;

  @Override
  public void onEnable() {
    instance = this;

    getServer().getPluginManager().registerEvents(new ChunkLoaderPlaceListener(), this);

    ItemSetup.INSTANCE.init();
    ResearchSetup.INSTANCE.init();
  }

  @Override
  public void onDisable() {
    // Logic for disabling the plugin...
  }

  @Override
  public String getBugTrackerURL() {
    return "https://github.com/xMikux/FoxyMachines/issues";
  }

  @Override
  public JavaPlugin getJavaPlugin() {
    return this;
  }

  public static FoxyMachines getInstance() {
    return instance;
  }

}
