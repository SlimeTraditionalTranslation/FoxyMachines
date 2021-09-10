package me.gallowsdove.foxymachines;

import io.github.mooy1.infinitylib.machines.MachineLore;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import io.github.thebusybiscuit.slimefun4.utils.itemstack.ColoredFireworkStar;
import me.gallowsdove.foxymachines.implementation.machines.ElectricGoldRefinery;
import me.gallowsdove.foxymachines.implementation.machines.ForcefieldDome;
import me.gallowsdove.foxymachines.implementation.machines.ImprovementForge;
import me.gallowsdove.foxymachines.implementation.machines.PotionMixer;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.meta.ItemMeta;


public final class Items{

    public static ItemGroup ITEM_GROUP = new ItemGroup(
            new NamespacedKey(FoxyMachines.getInstance(), "foxy_machines"),
            new CustomItemStack(Material.SHEARS, "&4Foxy機器", "", "&a> 點擊開啟"));

    public static ItemGroup GHOST_BLOCKS_ITEM_GROUP = new ItemGroup(
            new NamespacedKey(FoxyMachines.getInstance(), "ghost_blocks"),
            new CustomItemStack(Material.GLASS, "&5鬼方塊", "", "&a> 點擊開啟"));

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
            "faff2eb498e5c6a04484f0c9f785b448479ab213df95ec91176a308a12add70",
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
            Material.BEACON,
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

    public static final SlimefunItemStack FORCEFIELD_DOME = new SlimefunItemStack(
            "FORCEFIELD_DOME",
            Material.OBSERVER,
            "&4穹頂力場",
            "",
            "&7當通電時, 會形成保護屏障",
            "&7在半徑32格內.",
            "&7斷電或破壞後還原",
            "",
            MachineLore.energyPerSecond(ForcefieldDome.ENERGY_CONSUMPTION)
    );

    public static final SlimefunItemStack REMOTE_CONTROLLER = new SlimefunItemStack(
            "REMOTE_CONTROLLER",
            Material.NAME_TAG,
            "&c遙控裝置",
            "",
            "&7允許你在遠處控制穹頂力場-",
            "&7使用 Shift + 右鍵 來綁定.",
            "",
            "&c&o&8\u21E8 &e\u26A1 &70 / 1000 J"
    );

    public static final SlimefunItemStack FORCEFIELD_ENGINE = new SlimefunItemStack(
            "FORCEFIELD_ENGINE",
            Material.STRUCTURE_BLOCK,
            "&f力場引擎"
    );

    public static final SlimefunItemStack FORCEFIELD_STABILIZER = new SlimefunItemStack(
            "FORCEFIELD_STABILIZER",
            Material.STRUCTURE_VOID,
            "&f力場穩定器"
    );

    public static final SlimefunItemStack WIRELESS_TRANSMITTER = new SlimefunItemStack(
            "WIRELESS_TRANSMITTER",
            Material.REPEATER,
            "&f無線發訊器"
    );

    public static final SlimefunItemStack DEMONIC_INGOT = new SlimefunItemStack(
            "DEMONIC_INGOT",
            Material.GOLD_INGOT,
            "&c惡魔錠"
    );

    public static final SlimefunItemStack DEMONIC_PLATE = new SlimefunItemStack(
            "DEMONIC_PLATE",
            Material.LIGHT_WEIGHTED_PRESSURE_PLATE,
            "&c惡魔板"
    );

    public static final SlimefunItemStack AQUATIC_NETHERITE_INGOT = new SlimefunItemStack(
            "AQUATIC_NETHERITE_INGOT",
            Material.NETHERITE_INGOT,
            "&b水靈獄髓錠"
    );

    public static final SlimefunItemStack DAMIENIUM = new SlimefunItemStack(
            "DAMIENIUM",
            Material.GOLD_INGOT,
            "&a達米安元素"
    );

    public static final SlimefunItemStack SWEET_INGOT = new SlimefunItemStack(
            "SWEET_INGOT",
            Material.GOLD_INGOT,
            "&e甜蜜錠"
    );

    public static final SlimefunItemStack SWEETENED_SWEET_INGOT = new SlimefunItemStack(
            "SWEETENED_SWEET_INGOT",
            Material.GOLD_INGOT,
            "&e加糖的甜蜜錠"
    );

    public static final SlimefunItemStack SACRIFICIAL_ALTAR_BLACKSTONE_BRICKS = new SlimefunItemStack(
            "SACRIFICIAL_ALTAR_BLACKSTONE_BRICKS",
            Material.POLISHED_BLACKSTONE_BRICKS,
            "&f祭品黑石磚",
            "",
            "&7用作獻祭祭壇的一部份."
    );

    public static final SlimefunItemStack SACRIFICIAL_ALTAR_BLACKSTONE_BRICK_WALL = new SlimefunItemStack(
            "SACRIFICIAL_ALTAR_BLACKSTONE_BRICK_WALL",
            Material.POLISHED_BLACKSTONE_BRICK_WALL,
            "&f祭品黑石磚牆",
            "",
            "&7用作獻祭祭壇的一部份."
    );

    public static final SlimefunItemStack SACRIFICIAL_ALTAR_BLACKSTONE_BRICK_STAIRS = new SlimefunItemStack(
            "SACRIFICIAL_ALTAR_BLACKSTONE_BRICK_STAIRS",
            Material.POLISHED_BLACKSTONE_BRICK_STAIRS,
            "&f祭品黑石磚階梯",
            "",
            "&7用作獻祭祭壇的一部份."
    );

    public static final SlimefunItemStack SACRIFICIAL_ALTAR_SOUL_TORCH = new SlimefunItemStack(
            "SACRIFICIAL_ALTAR_SOUL_TORCH",
            Material.SOUL_TORCH,
            "&f祭品靈魂火把",
            "",
            "&7用作獻祭祭壇的一部份."
    );

    public static final SlimefunItemStack SACRIFICIAL_ALTAR_BLACKSTONE_PRESSURE_PLATE = new SlimefunItemStack(
            "SACRIFICIAL_ALTAR_BLACKSTONE_PRESSURE_PLATE",
            Material.POLISHED_BLACKSTONE_PRESSURE_PLATE,
            "&f祭品墊",
            "",
            "&7用作獻祭祭壇的一部份."
    );

    public static final SlimefunItemStack CURSED_RABBIT_PAW = new SlimefunItemStack(
            "CURSED_RABBIT_PAW",
            Material.RABBIT_FOOT,
            "&c詛咒兔爪"
    );

    public static final SlimefunItemStack HUMAN_SKULL = new SlimefunItemStack(
            "HUMAN_SKULL",
            Material.SKELETON_SKULL,
            "&c人類頭骨"
    );

    public static final SlimefunItemStack BLOOD_INFUSED_SKULL = new SlimefunItemStack(
            "BLOOD_INFUSED_SKULL",
            "daa4e2294df370b9a50cb924cdda78f740b0fbaf5a687106178505c80a79addc",
            "&c注入鮮血的頭骨"
    );

    public static final SlimefunItemStack BLOOD = new SlimefunItemStack(
            "BLOOD",
            Material.REDSTONE,
            "&c鮮血"
    );

    public static final SlimefunItemStack UNHOLY_WITHER_SKELETON_BONE = new SlimefunItemStack(
            "UNHOLY_WITHER_SKELETON_BONE",
            Material.BONE,
            "&c邪惡凋零骷髏骨頭"
    );

    public static final SlimefunItemStack PURIFIED_BONE = new SlimefunItemStack(
            "PURIFIED_BONE",
            Material.BONE,
            "&b純淨骨頭"
    );

    public static final SlimefunItemStack PURE_BONE_DUST = new SlimefunItemStack(
            "PURE_BONE_DUST",
            Material.BONE_MEAL,
            "&b純淨骨粉"
    );

    public static final SlimefunItemStack BUCKET_OF_BLOOD = new SlimefunItemStack(
            "BUCKET_OF_BLOOD",
            Material.LAVA_BUCKET,
            "&c鮮血之桶"
    );

    public static final SlimefunItemStack POSEIDONS_FISHING_ROD = new SlimefunItemStack(
            "POSEIDONS_FISHING_ROD",
            Material.FISHING_ROD,
            "&b波塞冬的釣魚竿",
            "&7波塞冬的祝福",
            "",
            "&7可以抓特殊物品."
    );
    static {
        POSEIDONS_FISHING_ROD.addUnsafeEnchantment(Enchantment.LUCK, 5);
        POSEIDONS_FISHING_ROD.addUnsafeEnchantment(Enchantment.LURE, 3);
    }

    public static final SlimefunItemStack POSEIDONS_BLESSING = new SlimefunItemStack(
            "POSEIDONS_BLESSING",
            Material.HEART_OF_THE_SEA,
            "&b波塞冬的祝福"
    );

    public static final SlimefunItemStack CURSED_SWORD = new SlimefunItemStack(
            "CURSED_SWORD",
            Material.NETHERITE_SWORD,
            "&c詛咒之劍",
            "&7生命吸取 I",
            "",
            "&7困惑敵人. 增加傷害.",
            "&7可能對行使者產生負面影響."
    );

    public static final SlimefunItemStack CELESTIAL_SWORD = new SlimefunItemStack(
            "CELESTIAL_SWORD",
            Material.NETHERITE_SWORD,
            "&e天劍",
            "&7神之重擊 II",
            "",
            "&7忽略 20% 的抗性."
    );

    public static final SlimefunItemStack ELUCIDATOR = new SlimefunItemStack(
            "ELUCIDATOR",
            Material.NETHERITE_SWORD,
            "&b闡釋者",
            "&7傷害 III",
            "&7生命吸取 II",
            "&7過度治療"
    );
    static {
        ELUCIDATOR.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 10);
        ELUCIDATOR.addUnsafeEnchantment(Enchantment.LOOT_BONUS_MOBS, 5);
    }

    public static final SlimefunItemStack MAGIC_LUMP_4 = new SlimefunItemStack(
            "MAGIC_LUMP_4",
            Material.GOLD_NUGGET,
            "&6魔法顆粒 &7- &eIV",
            "",
            "&c&o等級: IV");

    public static final SlimefunItemStack MAGIC_LUMP_5 = new SlimefunItemStack(
            "MAGIC_LUMP_5",
            Material.GOLD_NUGGET,
            "&6魔法顆粒 &7- &eV",
            "",
            "&c&o等級: V");

    public static final SlimefunItemStack AQUATIC_HELMET = new SlimefunItemStack(
            "AQUATIC_HELMET",
            Material.NETHERITE_HELMET,
            "&b水靈頭盔",
            "&7水下呼吸",
            "&7黑暗視覺"
    );
    static {
        AQUATIC_HELMET.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 5);
        AQUATIC_HELMET.addUnsafeEnchantment(Enchantment.WATER_WORKER, 1);
        AQUATIC_HELMET.addUnsafeEnchantment(Enchantment.OXYGEN, 5);
        AQUATIC_HELMET.addUnsafeEnchantment(Enchantment.DEPTH_STRIDER, 5);
    }


    public static final SlimefunItemStack RESISTANT_CHESTPLATE = new SlimefunItemStack(
            "RESISTANT_CHESTPLATE",
            Material.NETHERITE_CHESTPLATE,
            "&a抗性胸甲",
            "&7抗性 I",
            "&7回復 II"
    );
    static {
        RESISTANT_CHESTPLATE.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 5);
    }

    public static final SlimefunItemStack FIERY_LEGGINGS = new SlimefunItemStack(
            "FIERY_LEGGINGS",
            Material.NETHERITE_LEGGINGS,
            "&c火焰護腿",
            "&7火之領域 II"
    );
    static {
        FIERY_LEGGINGS.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 5);
        FIERY_LEGGINGS.addUnsafeEnchantment(Enchantment.THORNS, 6);
    }

    public static final SlimefunItemStack LIGHT_BOOTS = new SlimefunItemStack(
            "LIGHT_BOOTS",
            Material.NETHERITE_BOOTS,
            "&e輕便靴子",
            "&7跳躍提升 I",
            "&7速度 I",
            "&7輕量化"
    );
    static {
        LIGHT_BOOTS.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 5);
        LIGHT_BOOTS.addUnsafeEnchantment(Enchantment.PROTECTION_FALL, 5);
        LIGHT_BOOTS.addUnsafeEnchantment(Enchantment.SOUL_SPEED, 5);
    }

    public static final SlimefunItemStack AQUATIC_HELMET_FRAME = new SlimefunItemStack(
            "HELMET_FRAME",
            Material.CHAINMAIL_HELMET,
            "&f水靈頭盔框架",
            "",
            "&7製作材料"
    );

    public static final SlimefunItemStack RESISTANT_CHESTPLATE_FRAME = new SlimefunItemStack(
            "RESISTANT_CHESTPLATE_FRAME",
            Material.CHAINMAIL_CHESTPLATE,
            "&f抗性胸甲框架",
            "",
            "&7製作材料"
    );

    public static final SlimefunItemStack FIERY_LEGGINGS_FRAME = new SlimefunItemStack(
            "FIERY_LEGGINGS_FRAME",
            Material.CHAINMAIL_LEGGINGS,
            "&f火焰護腿框架",
            "",
            "&7製作材料"
    );

    public static final SlimefunItemStack LIGHT_BOOTS_FRAME = new SlimefunItemStack(
            "LIGHT_BOOTS_FRAME",
            Material.CHAINMAIL_BOOTS,
            "&f輕便靴子框架",
            "",
            "&7製作材料"
    );

    public static final SlimefunItemStack CURSED_SHARD = new SlimefunItemStack(
            "CURSED_SHARD",
            Material.NETHERITE_SCRAP,
            "&c詛咒碎片"
    );

    public static final SlimefunItemStack CELESTIAL_SHARD = new SlimefunItemStack(
            "CELESTIAL_SHARD",
            Material.PRISMARINE_SHARD,
            "&e天界碎片"
    );

    public static final SlimefunItemStack EQUANIMOUS_GEM = new SlimefunItemStack(
            "EQUANIMOUS_GEM",
            Material.EMERALD,
            "&a鎮靜寶石"
    );

    public static final SlimefunItemStack POLAR_FOX_HIDE = new SlimefunItemStack(
            "POLAR_FOX_HIDE",
            Material.SNOWBALL,
            "&f北極狐狸皮"
    );

    public static final SlimefunItemStack MAGMA_ESSENCE = new SlimefunItemStack(
            "MAGMA_ESSENCE",
            Material.MAGMA_CREAM,
            "&c岩漿精華"
    );

    public static final SlimefunItemStack TROPICAL_FISH_SCALE = new SlimefunItemStack(
            "TROPICAL_FISH_SCALE",
            Material.TROPICAL_FISH_SPAWN_EGG,
            "&b熱帶魚鱗"
    );

    public static final SlimefunItemStack PARROT_FEATHER = new SlimefunItemStack(
            "PARROT_FEATHER",
            Material.FEATHER,
            "&a鸚鵡羽毛"
    );

    public static final SlimefunItemStack UNBREAKABLE_RUNE = new SlimefunItemStack(
            "UNBREAKABLE_RUNE",
            new ColoredFireworkStar(
                    Color.fromRGB(0, 188, 0),
                    "&7古代魔法符文 &8&l[&2&l牢不可破&8&l]",
                    "",
                    "&e將此符文放在掉落的物品上",
                    "&e使其&2無法破壞"
            ));

    public static final SlimefunItemStack PIXIE_QUEEN_SPAWN_EGG = new SlimefunItemStack(
            "PIXIE_QUEEN_SPAWN_EGG",
            Material.CREEPER_SPAWN_EGG,
            "&a精靈女王 生怪蛋"
    );

    public static final SlimefunItemStack HEADLESS_HORSEMAN_SPAWN_EGG = new SlimefunItemStack(
            "HEADLESS_HORSEMAN_SPAWN_EGG",
            Material.SPIDER_SPAWN_EGG,
            "&c無頭騎士 生怪蛋"
    );

    public static final SlimefunItemStack PIXIE_QUEEN_HEART = new SlimefunItemStack(
            "PIXIE_QUEEN_HEART",
            Material.FERMENTED_SPIDER_EYE,
            "&4精靈女王之心"
    );

    public static final SlimefunItemStack PIXIE_DUST = new SlimefunItemStack(
            "PIXIE_DUST",
            Material.SUGAR,
            "&e精靈之粉",
            "",
            "&7力量 IV"
    );

    public static final SlimefunItemStack VILE_PUMPKIN = new SlimefunItemStack(
            "VILE_PUMPKIN",
            Material.CARVED_PUMPKIN,
            "&c邪惡南瓜"
    );

    public static final SlimefunItemStack VILE_SEEDS = new SlimefunItemStack(
            "VILE_SEEDS",
            Material.MELON_SEEDS,
            "&c邪惡種子",
            "",
            "&7生命值提升 V"
    );

    public static final SlimefunItemStack ACRI_ARCUM = new SlimefunItemStack(
            "ACRI_ARCUM",
            Material.BOW,
            "&e鋒利之弓",
            "",
            "&7傷害 III",
            "&7穿甲彈 II"
    );
    static {
        ACRI_ARCUM.addUnsafeEnchantment(Enchantment.ARROW_DAMAGE, 7);
        ACRI_ARCUM.addUnsafeEnchantment(Enchantment.ARROW_INFINITE, 1);
    }

    public static final SlimefunItemStack GHOST_BLOCK_REMOVER = new SlimefunItemStack(
            "GHOST_BLOCK_REMOVER",
            Material.CLOCK,
            "&e鬼方塊移除器",
            "",
            "&7右鍵點擊來移除鬼方塊."
    );
}
