package me.gallowsdove.foxymachines;

import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.cscorelib2.item.CustomItem;
import org.bukkit.NamespacedKey;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.ItemFlag;
import me.gallowsdove.foxymachines.implementation.machines.ImprovementForge;
import me.gallowsdove.foxymachines.implementation.machines.PotionMixer;
import me.gallowsdove.foxymachines.implementation.machines.ElectricGoldRefinery;


public final class Items{

    public static Category category = new Category(
            new NamespacedKey(FoxyMachines.getInstance(), "foxy_machines"),
            new CustomItem(Material.SHEARS, "&4Foxy機器", "", "&a> 點擊開啟"));

    public static final SlimefunItemStack ELECTRIC_WIND_STAFF = new SlimefunItemStack(
            "ELECTRIC_WIND_STAFF",
            Material.BLAZE_ROD,
            "&b電力風法杖",
            "",
            "&7乘風飛行.",
            "",
            "&c&o&8\u21E8 &e\u26A1 &70 / 100 J"
    );
    static {
        ELECTRIC_WIND_STAFF.addUnsafeEnchantment(Enchantment.DURABILITY, 1);
        ItemMeta meta = ELECTRIC_WIND_STAFF.getItemMeta();
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        ELECTRIC_WIND_STAFF.setItemMeta(meta);
    }

    public static final SlimefunItemStack ELECTRIC_FIRE_STAFF = new SlimefunItemStack(
            "ELECTRIC_FIRE_STAFF",
            Material.BLAZE_ROD,
            "&4電力火法杖",
            "",
            "&7製造火海.",
            "",
            "&c&o&8\u21E8 &e\u26A1 &70 / 100 J"
    );
    static {
        ELECTRIC_FIRE_STAFF.addUnsafeEnchantment(Enchantment.DURABILITY, 1);
        ItemMeta meta = ELECTRIC_FIRE_STAFF.getItemMeta();
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        ELECTRIC_FIRE_STAFF.setItemMeta(meta);
    }

    public static final SlimefunItemStack ELECTRIC_FIRE_STAFF_II = new SlimefunItemStack(
            "ELECTRIC_FIRE_STAFF_II",
            Material.BLAZE_ROD,
            "&4電力火法杖 &7- &eII",
            "",
            "&7火, 火, 更多火!",
            "",
            "&c&o&8\u21E8 &e\u26A1 &70 / 200 J"
    );
    static {
        ELECTRIC_FIRE_STAFF_II.addUnsafeEnchantment(Enchantment.DURABILITY, 1);
        ItemMeta meta = ELECTRIC_FIRE_STAFF_II.getItemMeta();
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        ELECTRIC_FIRE_STAFF_II.setItemMeta(meta);
    }

    public static final SlimefunItemStack HEALING_BOW = new SlimefunItemStack(
            "HEALING_BOW",
            Material.BOW,
            "&4治療弓",
            "&c治療 II",
            "",
            "&8終於有支援武器了."
    );

    public static final SlimefunItemStack REINFORCED_STRING = new SlimefunItemStack(
            "REINFORCED_STRING",
            Material.STRING,
            "&b強化線"
    );

    public static final SlimefunItemStack IMPROVEMENT_FORGE = new SlimefunItemStack(
            "IMPROVEMENT_FORGE",
            Material.SMITHING_TABLE,
            "&b改進鍛造機",
            "",
            "&7用於改善黏液科技的工具,武器與盔甲.",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.powerPerSecond(ImprovementForge.ENERGY_CONSUMPTION)
    );

    public static final SlimefunItemStack IMPROVEMENT_CORE = new SlimefunItemStack(
            "IMPROVEMENT_CORE",
            "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZmFmZjJlYjQ5OGU1YzZhMDQ0ODRmMGM5Zjc4NWI0NDg0NzlhYjIxM2RmOTVlYzkxMTc2YTMwOGExMmFkZDcwIn19fQ==",
            "&a改進核心",
            "",
            "&7將其與工具放置進改進鍛造機,以改進它."
    );

    public static final SlimefunItemStack POTION_MIXER = new SlimefunItemStack(
            "POTION_MIXER",
            Material.BREWING_STAND	,
            "&b藥水混合器",
            "",
            "&7用於混合藥水.",
            "",
            LoreBuilder.machine(MachineTier.GOOD, MachineType.MACHINE),
            LoreBuilder.powerPerSecond(PotionMixer.ENERGY_CONSUMPTION)
    );

    public static final SlimefunItemStack ELECTRIC_GOLD_REFINERY = new SlimefunItemStack(
            "ELECTRIC_GOLD_REFINERY",
            Material.GOLD_BLOCK	,
            "&b電動精煉機",
            "",
            "&7將金粉精煉成金錠.",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.powerPerSecond(ElectricGoldRefinery.ENERGY_CONSUMPTION)
    );

    public static final SlimefunItemStack CHUNK_LOADER = new SlimefunItemStack(
            "CHUNK_LOADER",
            Material.END_ROD,
            "&b區塊加載器",
            "",
            "&7保持區塊加載."
    );

    public static final SlimefunItemStack STABILIZED_BLISTERING_BLOCK = new SlimefunItemStack(
            "STABILIZED_BLISTERING_BLOCK",
            Material.SNOW_BLOCK,
            "&b穩定起泡磚",
            "",
            "&7穩定的材料."
    );

    public static final SlimefunItemStack BOOSTED_RAIL = new SlimefunItemStack(
            "BOOSTED_RAIL",
            Material.RAIL,
            "&f增強鐵軌",
            "",
            "&7支持2.5x速度."
    );

    public static final SlimefunItemStack BOOSTED_ACTIVATOR_RAIL = new SlimefunItemStack(
            "BOOSTED_ACTIVATOR_RAIL",
            Material.ACTIVATOR_RAIL,
            "&f增強觸發鐵軌",
            "",
            "&7支持2.5x速度."
    );

    public static final SlimefunItemStack BOOSTED_DETECTOR_RAIL = new SlimefunItemStack(
            "BOOSTED_DETECTOR_RAIL",
            Material.DETECTOR_RAIL,
            "&f增強感測鐵軌",
            "",
            "&7支持2.5x速度."
    );

    public static final SlimefunItemStack BOOSTED_POWERED_RAIL = new SlimefunItemStack(
            "BOOSTED_POWERED_RAIL",
            Material.POWERED_RAIL,
            "&f增強動力鐵軌",
            "",
            "&7支持2.5x速度."
    );

    public static final SlimefunItemStack BERRY_BUSH_TRIMMER = new SlimefunItemStack(
            "BERRY_BUSH_TRIMMER",
            Material.SHEARS,
            "&e甜莓灌木叢修剪刀",
            "",
            "&7去除甜莓灌木叢中的刺."
    );


}
