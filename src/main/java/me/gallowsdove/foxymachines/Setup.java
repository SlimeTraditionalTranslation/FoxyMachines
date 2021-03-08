package me.gallowsdove.foxymachines;

import io.github.thebusybiscuit.slimefun4.core.researching.Research;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.implementation.items.armor.LongFallBoots;
import io.github.thebusybiscuit.slimefun4.implementation.items.armor.SlimefunArmorPiece;
import me.gallowsdove.foxymachines.implementation.machines.*;
import me.gallowsdove.foxymachines.implementation.materials.SimpleMaterial;
import me.gallowsdove.foxymachines.implementation.multiblock.SacrificialAltarPiece;
import me.gallowsdove.foxymachines.implementation.multiblock.SacrificialAltarPressurePlate;
import me.gallowsdove.foxymachines.implementation.tools.*;
import me.gallowsdove.foxymachines.implementation.weapons.HealingBow;
import me.gallowsdove.foxymachines.types.FoxyRecipeType;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import me.mrCookieSlime.Slimefun.cscorelib2.item.CustomItem;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;


final class ItemSetup {
    static final ItemSetup INSTANCE = new ItemSetup();
    private boolean initialised;

    private ItemSetup() {}

    public void init() {
        if (initialised) return;

        initialised = true;

        new SimpleMaterial(Items.MAGIC_LUMP_4, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                SlimefunItems.MAGIC_LUMP_3, SlimefunItems.MAGIC_LUMP_3, null,
                SlimefunItems.MAGIC_LUMP_3, SlimefunItems.MAGIC_LUMP_3, null,
                null, null, null
        }, 1).register(FoxyMachines.getInstance());
        new SimpleMaterial(Items.MAGIC_LUMP_5, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                Items.MAGIC_LUMP_4, Items.MAGIC_LUMP_4, null,
                Items.MAGIC_LUMP_4, Items.MAGIC_LUMP_4, null,
                null, null, null
        }, 1).register(FoxyMachines.getInstance());
        new SimpleMaterial(Items.REINFORCED_STRING, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                new ItemStack(Material.STRING), SlimefunItems.REINFORCED_ALLOY_INGOT, new ItemStack(Material.STRING),
                SlimefunItems.REINFORCED_ALLOY_INGOT, new ItemStack(Material.STRING), SlimefunItems.REINFORCED_ALLOY_INGOT,
                new ItemStack(Material.STRING), SlimefunItems.REINFORCED_ALLOY_INGOT, new ItemStack(Material.STRING)
                }, 1).register(FoxyMachines.getInstance());
        new SimpleMaterial(Items.IMPROVEMENT_CORE, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                SlimefunItems.DAMASCUS_STEEL_INGOT, Items.REINFORCED_STRING, SlimefunItems.DAMASCUS_STEEL_INGOT,
                Items.REINFORCED_STRING, SlimefunItems.DAMASCUS_STEEL_INGOT, Items.REINFORCED_STRING,
                SlimefunItems.DAMASCUS_STEEL_INGOT, Items.REINFORCED_STRING, SlimefunItems.DAMASCUS_STEEL_INGOT
                }, 1).register(FoxyMachines.getInstance());
        new SimpleMaterial(Items.STABILIZED_BLISTERING_BLOCK, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                SlimefunItems.HARDENED_METAL_INGOT, SlimefunItems.REINFORCED_ALLOY_INGOT,SlimefunItems.HARDENED_METAL_INGOT,
                SlimefunItems.REINFORCED_ALLOY_INGOT, SlimefunItems.BLISTERING_INGOT_3, SlimefunItems.REINFORCED_ALLOY_INGOT,
                SlimefunItems.HARDENED_METAL_INGOT, SlimefunItems.REINFORCED_ALLOY_INGOT, SlimefunItems.HARDENED_METAL_INGOT
                }, 1).register(FoxyMachines.getInstance());
        new SimpleMaterial(Items.FORCEFIELD_ENGINE, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                Items.AQUATIC_NETHERITE_INGOT, SlimefunItems.ELECTRIC_MOTOR, Items.AQUATIC_NETHERITE_INGOT,
                Items.DEMONIC_PLATE, Items.STABILIZED_BLISTERING_BLOCK, Items.DEMONIC_PLATE,
                Items.AQUATIC_NETHERITE_INGOT, SlimefunItems.ELECTRIC_MOTOR, Items.AQUATIC_NETHERITE_INGOT
                }, 1).register(FoxyMachines.getInstance());
        new SimpleMaterial(Items.FORCEFIELD_STABILIZER, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                Items.SWEET_INGOT, Items.DAMIENIUM, Items.SWEET_INGOT,
                Items.DAMIENIUM, Items.STABILIZED_BLISTERING_BLOCK, Items.DAMIENIUM,
                Items.STABILIZED_BLISTERING_BLOCK, Items.STABILIZED_BLISTERING_BLOCK, Items.STABILIZED_BLISTERING_BLOCK
                }, 1).register(FoxyMachines.getInstance());
        new SimpleMaterial(Items.WIRELESS_TRANSMITTER, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                SlimefunItems.REDSTONE_ALLOY, Items.DAMIENIUM, SlimefunItems.REDSTONE_ALLOY,
                Items.DAMIENIUM, SlimefunItems.ELECTRIC_MOTOR, Items.DAMIENIUM,
                Items.DAMIENIUM, SlimefunItems.BATTERY, Items.DAMIENIUM
                }, 1).register(FoxyMachines.getInstance());
        new SimpleMaterial(Items.DEMONIC_INGOT, RecipeType.SMELTERY, new ItemStack[]{
                SlimefunItems.LAVA_CRYSTAL, SlimefunItems.BLISTERING_INGOT_3, new ItemStack(Material.GHAST_TEAR),
                SlimefunItems.REINFORCED_ALLOY_INGOT, SlimefunItems.NECROTIC_SKULL, SlimefunItems.STRANGE_NETHER_GOO,
                null, null, null
                }, 1).register(FoxyMachines.getInstance());
        new SimpleMaterial(Items.AQUATIC_NETHERITE_INGOT, RecipeType.SMELTERY, new ItemStack[]{
                SlimefunItems.DAMASCUS_STEEL_INGOT, new ItemStack(Material.NETHERITE_INGOT), new ItemStack(Material.PRISMARINE_SHARD),
                new ItemStack(Material.PRISMARINE_CRYSTALS), new ItemStack(Material.NAUTILUS_SHELL), null,
                null, null, null
                }, 1).register(FoxyMachines.getInstance());
        new SimpleMaterial(Items.DAMIENIUM, RecipeType.SMELTERY, new ItemStack[]{
                SlimefunItems.DAMASCUS_STEEL_INGOT, SlimefunItems.GOLD_24K, new ItemStack(Material.GOLD_INGOT),
                SlimefunItems.HARDENED_METAL_INGOT, SlimefunItems.CORINTHIAN_BRONZE_INGOT, null,
                null, null, null
                }, 1).register(FoxyMachines.getInstance());
        new SimpleMaterial(Items.SWEET_INGOT, RecipeType.SMELTERY, new ItemStack[] {
                SlimefunItems.DAMASCUS_STEEL_INGOT, SlimefunItems.COBALT_INGOT, SlimefunItems.BILLON_INGOT,
                new ItemStack(Material.HONEYCOMB_BLOCK), new ItemStack(Material.SWEET_BERRIES), new ItemStack(Material.HONEY_BLOCK),
                null, null, null
                }, 1).register(FoxyMachines.getInstance());
        new SimpleMaterial(Items.SWEETENED_SWEET_INGOT, RecipeType.SMELTERY, new ItemStack[]{
                Items.SWEET_INGOT, SlimefunItems.DAMASCUS_STEEL_INGOT , SlimefunItems.COBALT_INGOT,
                new ItemStack(Material.SWEET_BERRIES), new ItemStack(Material.SUGAR), new ItemStack(Material.HONEY_BLOCK),
                null, null, null
                }, 1).register(FoxyMachines.getInstance());
        new SimpleMaterial(Items.DEMONIC_PLATE, RecipeType.COMPRESSOR, new ItemStack[]{
                new SlimefunItemStack(Items.DEMONIC_INGOT, 8), null, null,
                null, null, null,
                null, null, null
               }, 1).register(FoxyMachines.getInstance());
        new SimpleMaterial(Items.AQUATIC_HELMET_FRAME, RecipeType.ARMOR_FORGE, new ItemStack[]{
                Items.AQUATIC_NETHERITE_INGOT, Items.AQUATIC_NETHERITE_INGOT, Items.AQUATIC_NETHERITE_INGOT,
                Items.AQUATIC_NETHERITE_INGOT, null, Items.AQUATIC_NETHERITE_INGOT,
                null, null, null
                }, 1).register(FoxyMachines.getInstance());
        new SimpleMaterial(Items.RESISTANT_CHESTPLATE_FRAME, RecipeType.ARMOR_FORGE, new ItemStack[]{
                Items.DAMIENIUM, null, Items.DAMIENIUM,
                Items.DEMONIC_INGOT, Items.DEMONIC_INGOT, Items.DEMONIC_INGOT,
                Items.DEMONIC_INGOT, Items.DEMONIC_INGOT, Items.DEMONIC_INGOT
                }, 1).register(FoxyMachines.getInstance());
        new SimpleMaterial(Items.FIERY_LEGGINGS_FRAME, RecipeType.ARMOR_FORGE, new ItemStack[]{
                Items.DEMONIC_INGOT, Items.DAMIENIUM, Items.DEMONIC_INGOT,
                Items.DEMONIC_INGOT, null, Items.DEMONIC_INGOT,
                Items.DAMIENIUM, null, Items.DAMIENIUM
                }, 1).register(FoxyMachines.getInstance());
        new SimpleMaterial(Items.LIGHT_BOOTS_FRAME, RecipeType.ARMOR_FORGE, new ItemStack[]{
                null, null, null,
                Items.SWEETENED_SWEET_INGOT, null, Items.SWEETENED_SWEET_INGOT,
                Items.DAMIENIUM, null, Items.DAMIENIUM
        }, 1).register(FoxyMachines.getInstance());
        new SimpleMaterial(Items.POSEIDONS_BLESSING, FoxyRecipeType.FISHING, new ItemStack[] {
                null, null, null,
                null, Items.POSEIDONS_FISHING_ROD, null,
                null, null, null
                }, 1).register(FoxyMachines.getInstance());
        new SimpleMaterial(Items.BLOOD, FoxyRecipeType.SACRIFICIAL_ALTAR, new ItemStack[] {
                null, null, null,
                null, new CustomItem(Material.NETHERITE_SWORD, "&e怪物掉落"), null,
                null, null, null
                }, 1).register(FoxyMachines.getInstance());
        new SimpleMaterial(Items.CURSED_RABBIT_PAW, FoxyRecipeType.SACRIFICIAL_ALTAR, new ItemStack[] {
                null, null, null,
                null, new CustomItem(Material.RABBIT_SPAWN_EGG, "&e兔子掉落"), null,
                null, null, null
                }, 1).register(FoxyMachines.getInstance());
        new SimpleMaterial(Items.HUMAN_SKULL, FoxyRecipeType.SACRIFICIAL_ALTAR, new ItemStack[] {
                null, null, null,
                null, new CustomItem(Material.PLAYER_HEAD, "&e玩家掉落"), null,
                null, null, null
                }, 1).register(FoxyMachines.getInstance());
        new SimpleMaterial(Items.TROPICAL_FISH_SCALE, FoxyRecipeType.SACRIFICIAL_ALTAR, new ItemStack[] {
                null, null, null,
                null, new CustomItem(Material.TROPICAL_FISH, "&e熱帶魚掉落"), null,
                null, null, null
                }, 1).register(FoxyMachines.getInstance());
        new SimpleMaterial(Items.POLAR_FOX_HIDE, FoxyRecipeType.SACRIFICIAL_ALTAR, new ItemStack[] {
                null, null, null,
                null, new CustomItem(Material.POLAR_BEAR_SPAWN_EGG, "&e北極狐狸掉落"), null,
                null, null, null
                }, 1).register(FoxyMachines.getInstance());
        new SimpleMaterial(Items.MAGMA_ESSENCE, FoxyRecipeType.SACRIFICIAL_ALTAR, new ItemStack[] {
                null, null, null,
                null, new CustomItem(Material.MAGMA_CUBE_SPAWN_EGG, "&e岩漿立方怪掉落"), null,
                null, null, null
                }, 1).register(FoxyMachines.getInstance());
        new SimpleMaterial(Items.PARROT_FEATHER, FoxyRecipeType.SACRIFICIAL_ALTAR, new ItemStack[] {
                null, null, null,
                null, new CustomItem(Material.PARROT_SPAWN_EGG, "&e鸚鵡掉落"), null,
                null, null, null
                }, 1).register(FoxyMachines.getInstance());
        new SimpleMaterial(Items.UNHOLY_WITHER_SKELETON_BONE, FoxyRecipeType.SACRIFICIAL_ALTAR, new ItemStack[] {
                null, null, null,
                null, new CustomItem(Material.WITHER_SKELETON_SPAWN_EGG, "&e凋零骷髏掉落"), null,
                null, null, null
                }, 1).register(FoxyMachines.getInstance());
        new SimpleMaterial(Items.BLOOD_INFUSED_SKULL, RecipeType.ANCIENT_ALTAR, new ItemStack[] {
                Items.MAGIC_LUMP_4, Items.BLOOD, Items.MAGIC_LUMP_4,
                Items.BLOOD, Items.HUMAN_SKULL, Items.BLOOD,
                Items.MAGIC_LUMP_4, Items.BLOOD, Items.MAGIC_LUMP_4
                }, 1).register(FoxyMachines.getInstance());
        new SimpleMaterial(Items.PURIFIED_BONE, RecipeType.ANCIENT_ALTAR, new ItemStack[] {
                new ItemStack(Material.BLUE_ORCHID), new ItemStack(Material.ALLIUM), new ItemStack(Material.OXEYE_DAISY),
                new ItemStack(Material.POPPY), Items.UNHOLY_WITHER_SKELETON_BONE, new ItemStack(Material.RED_TULIP),
                new ItemStack(Material.LILY_OF_THE_VALLEY), new ItemStack(Material.PINK_TULIP), new ItemStack(Material.CORNFLOWER)
                }, 1).register(FoxyMachines.getInstance());
        new SimpleMaterial(Items.PURE_BONE_DUST, RecipeType.GRIND_STONE, new ItemStack[] {
                new SlimefunItemStack(Items.PURIFIED_BONE, 6), null, null,
                null, null, null,
                null, null, null
                }, 1).register(FoxyMachines.getInstance());
        new SimpleMaterial(Items.BUCKET_OF_BLOOD, RecipeType.MAGIC_WORKBENCH, new ItemStack[] {
                Items.BLOOD, Items.BLOOD, Items.BLOOD,
                Items.BLOOD, new ItemStack(Material.BUCKET), Items.BLOOD,
                Items.BLOOD, Items.BLOOD, Items.BLOOD
                }, 1).register(FoxyMachines.getInstance());
        new SlimefunItem(Items.category, Items.CURSED_SHARD, FoxyRecipeType.QUEST, new ItemStack[] {
                null, null, null,
                null, Items.CURSED_SWORD, null,
                null, null, null
                }).register(FoxyMachines.getInstance());
        new SlimefunItem(Items.category, Items.CELESTIAL_SHARD, FoxyRecipeType.QUEST, new ItemStack[] {
                null, null, null,
                null, Items.CELESTIAL_SWORD, null,
                null, null, null
                }).register(FoxyMachines.getInstance());
        new SlimefunItem(Items.category, Items.EQUANIMOUS_GEM, RecipeType.ANCIENT_ALTAR, new ItemStack[] {
                Items.CURSED_SHARD, Items.CELESTIAL_SHARD, Items.CURSED_SHARD,
                Items.CELESTIAL_SHARD, new ItemStack(Material.EMERALD), Items.CELESTIAL_SHARD,
                Items.CURSED_SHARD, Items.CELESTIAL_SHARD, Items.CURSED_SHARD
                }).register(FoxyMachines.getInstance());
        new SacrificialAltarPiece(Items.SACRIFICIAL_ALTAR_BLACKSTONE_BRICKS, new ItemStack[]{
                new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS), new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS), new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS),
                new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS), SlimefunItems.REINFORCED_PLATE, new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS),
                new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS), new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS), new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS)
                }, 8).register(FoxyMachines.getInstance());
        new SacrificialAltarPiece(Items.SACRIFICIAL_ALTAR_BLACKSTONE_BRICK_STAIRS, new ItemStack[] {
                Items.SACRIFICIAL_ALTAR_BLACKSTONE_BRICKS, null, null,
                Items.SACRIFICIAL_ALTAR_BLACKSTONE_BRICKS, Items.SACRIFICIAL_ALTAR_BLACKSTONE_BRICKS, null,
                Items.SACRIFICIAL_ALTAR_BLACKSTONE_BRICKS, Items.SACRIFICIAL_ALTAR_BLACKSTONE_BRICKS, Items.SACRIFICIAL_ALTAR_BLACKSTONE_BRICKS
                }, 4).register(FoxyMachines.getInstance());
        new SacrificialAltarPiece(Items.SACRIFICIAL_ALTAR_BLACKSTONE_BRICK_WALL, new ItemStack[] {
                null, null, null,
                Items.SACRIFICIAL_ALTAR_BLACKSTONE_BRICKS, Items.SACRIFICIAL_ALTAR_BLACKSTONE_BRICKS, Items.SACRIFICIAL_ALTAR_BLACKSTONE_BRICKS,
                Items.SACRIFICIAL_ALTAR_BLACKSTONE_BRICKS, Items.SACRIFICIAL_ALTAR_BLACKSTONE_BRICKS, Items.SACRIFICIAL_ALTAR_BLACKSTONE_BRICKS
                }, 4).register(FoxyMachines.getInstance());
        new SacrificialAltarPiece(Items.SACRIFICIAL_ALTAR_SOUL_TORCH, new ItemStack[] {
                null, Items.MAGIC_LUMP_4, null,
                Items.MAGIC_LUMP_4, SlimefunItems.STRANGE_NETHER_GOO, Items.MAGIC_LUMP_4,
                null, new ItemStack(Material.BLAZE_ROD), null
                }, 1).register(FoxyMachines.getInstance());
        new SacrificialAltarPressurePlate().register(FoxyMachines.getInstance());
        new SlimefunItem(Items.category, Items.POSEIDONS_FISHING_ROD, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                null, null, Items.AQUATIC_NETHERITE_INGOT,
                null, Items.AQUATIC_NETHERITE_INGOT, Items.REINFORCED_STRING,
                Items.AQUATIC_NETHERITE_INGOT, null, new ItemStack(Material.HEART_OF_THE_SEA)
                }).register(FoxyMachines.getInstance());
        new ElectricWindStaff().register(FoxyMachines.getInstance());
        new ElectricFireStaff().register(FoxyMachines.getInstance());
        new ElectricFireStaffII().register(FoxyMachines.getInstance());
        new HealingBow().register(FoxyMachines.getInstance());
        new SlimefunItem(Items.category, Items.CURSED_SWORD, RecipeType.ANCIENT_ALTAR, new ItemStack[] {
                Items.BLOOD, Items.CURSED_RABBIT_PAW, Items.BLOOD,
                Items.MAGIC_LUMP_5, new ItemStack(Material.NETHERITE_SWORD), Items.MAGIC_LUMP_5,
                Items.BLOOD, Items.BLOOD_INFUSED_SKULL, Items.BLOOD
                }).register(FoxyMachines.getInstance());
        new SlimefunItem(Items.category, Items.CELESTIAL_SWORD, RecipeType.ANCIENT_ALTAR, new ItemStack[] {
                Items.MAGIC_LUMP_5, Items.POSEIDONS_BLESSING, Items.MAGIC_LUMP_5,
                Items.PURE_BONE_DUST, new ItemStack(Material.NETHERITE_SWORD), Items.PURE_BONE_DUST,
                Items.MAGIC_LUMP_5, Items.POSEIDONS_BLESSING, Items.MAGIC_LUMP_5
                }).register(FoxyMachines.getInstance());
        new SlimefunItem(Items.category, Items.ELUCIDATOR, RecipeType.ANCIENT_ALTAR, new ItemStack[] {
                Items.EQUANIMOUS_GEM, Items.CURSED_SWORD, Items.EQUANIMOUS_GEM,
                Items.BUCKET_OF_BLOOD, Items.DEMONIC_PLATE, Items.BUCKET_OF_BLOOD,
                Items.EQUANIMOUS_GEM, Items.CELESTIAL_SWORD, Items.EQUANIMOUS_GEM
        }).register(FoxyMachines.getInstance());
        new SlimefunArmorPiece(Items.category, Items.AQUATIC_HELMET, RecipeType.ANCIENT_ALTAR, new ItemStack[]{
                Items.EQUANIMOUS_GEM, Items.MAGIC_LUMP_5, Items.EQUANIMOUS_GEM,
                Items.TROPICAL_FISH_SCALE, Items.AQUATIC_HELMET_FRAME, Items.TROPICAL_FISH_SCALE,
                Items.EQUANIMOUS_GEM, Items.MAGIC_LUMP_5, Items.EQUANIMOUS_GEM},
                new PotionEffect[] { new PotionEffect(PotionEffectType.WATER_BREATHING, 300, 0, false, false, false),
                new PotionEffect(PotionEffectType.NIGHT_VISION, 500, 0, false, false, false)})
                .register(FoxyMachines.getInstance());
        new SlimefunArmorPiece(Items.category, Items.RESISTANT_CHESTPLATE, RecipeType.ANCIENT_ALTAR, new ItemStack[]{
                Items.EQUANIMOUS_GEM, Items.MAGIC_LUMP_5, Items.EQUANIMOUS_GEM,
                Items.POLAR_FOX_HIDE, Items.RESISTANT_CHESTPLATE_FRAME, Items.POLAR_FOX_HIDE,
                Items.EQUANIMOUS_GEM, Items.MAGIC_LUMP_5, Items.EQUANIMOUS_GEM},
                new PotionEffect[] { new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 300, 0, false, false, false),
                        new PotionEffect(PotionEffectType.REGENERATION, 300, 0, false, false, false)})
                .register(FoxyMachines.getInstance());
        new SlimefunArmorPiece(Items.category, Items.FIERY_LEGGINGS, RecipeType.ANCIENT_ALTAR, new ItemStack[]{
                Items.EQUANIMOUS_GEM, Items.MAGIC_LUMP_5, Items.EQUANIMOUS_GEM,
                Items.MAGMA_ESSENCE, Items.FIERY_LEGGINGS_FRAME, Items.MAGMA_ESSENCE,
                Items.EQUANIMOUS_GEM, Items.MAGIC_LUMP_5, Items.EQUANIMOUS_GEM},
                new PotionEffect[] { new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 300, 0, false, false, false)})
                .register(FoxyMachines.getInstance());
        new LongFallBoots(Items.category, Items.LIGHT_BOOTS, RecipeType.ANCIENT_ALTAR, new ItemStack[]{
                Items.EQUANIMOUS_GEM, Items.MAGIC_LUMP_5, Items.EQUANIMOUS_GEM,
                Items.PARROT_FEATHER, Items.LIGHT_BOOTS_FRAME, Items.PARROT_FEATHER,
                Items.EQUANIMOUS_GEM, Items.MAGIC_LUMP_5, Items.EQUANIMOUS_GEM},
                new PotionEffect[] { new PotionEffect(PotionEffectType.SPEED, 300, 0, false, false, false),
                        new PotionEffect(PotionEffectType.JUMP, 300, 1, false, false, false)})
                .register(FoxyMachines.getInstance());
        new ImprovementForge().register(FoxyMachines.getInstance());
        new PotionMixer().register(FoxyMachines.getInstance());
        new ElectricGoldRefinery().register(FoxyMachines.getInstance());
        new ChunkLoader().register(FoxyMachines.getInstance());
        new BoostedRail(Items.BOOSTED_RAIL, new ItemStack[] {
                SlimefunItems.LEAD_INGOT, SlimefunItems.COPPER_WIRE, SlimefunItems.LEAD_INGOT,
                SlimefunItems.LEAD_INGOT, new ItemStack(Material.STICK), SlimefunItems.LEAD_INGOT,
                SlimefunItems.LEAD_INGOT, SlimefunItems.COPPER_WIRE, SlimefunItems.LEAD_INGOT}, 4)
                .register(FoxyMachines.getInstance());
        new BoostedRail(Items.BOOSTED_ACTIVATOR_RAIL, new ItemStack[] {
                SlimefunItems.BRASS_INGOT, SlimefunItems.COPPER_WIRE, SlimefunItems.BRASS_INGOT,
                SlimefunItems.BRASS_INGOT, new ItemStack(Material.REPEATER), SlimefunItems.BRASS_INGOT,
                SlimefunItems.BRASS_INGOT, SlimefunItems.COPPER_WIRE, SlimefunItems.BRASS_INGOT}, 4)
                .register(FoxyMachines.getInstance());
        new BoostedRail(Items.BOOSTED_DETECTOR_RAIL, new ItemStack[] {
                SlimefunItems.BRASS_INGOT, SlimefunItems.COPPER_WIRE, SlimefunItems.BRASS_INGOT,
                SlimefunItems.BRASS_INGOT, new ItemStack(Material.HEAVY_WEIGHTED_PRESSURE_PLATE), SlimefunItems.BRASS_INGOT,
                SlimefunItems.BRASS_INGOT, SlimefunItems.COPPER_WIRE, SlimefunItems.BRASS_INGOT}, 4)
                .register(FoxyMachines.getInstance());
        new BoostedRail(Items.BOOSTED_POWERED_RAIL, new ItemStack[] {
                SlimefunItems.GOLD_24K, SlimefunItems.COPPER_WIRE, SlimefunItems.GOLD_24K,
                SlimefunItems.GOLD_24K, SlimefunItems.ELECTRO_MAGNET, SlimefunItems.GOLD_24K,
                SlimefunItems.GOLD_24K, SlimefunItems.COPPER_WIRE, SlimefunItems.GOLD_24K}, 4)
                .register(FoxyMachines.getInstance());
        new BerryBushTrimmer().register(FoxyMachines.getInstance());
        ForcefieldDome.INSTANCE.register(FoxyMachines.getInstance());
        new RemoteController().register(FoxyMachines.getInstance());
    }
}

final class ResearchSetup {
    static final ResearchSetup INSTANCE = new ResearchSetup();
    private boolean initialised;

    private ResearchSetup() {}

    public void init() {
        if (initialised) return;

        initialised = true;

        new Research(new NamespacedKey(FoxyMachines.getInstance(), "electric_wind_staff"),
                6669666, "在風中使用電力", 22)
                .addItems(Items.ELECTRIC_WIND_STAFF)
                .register();
        new Research(new NamespacedKey(FoxyMachines.getInstance(), "electric_fire_staffs"),
                6669667, "製造火海", 34)
                .addItems(Items.ELECTRIC_FIRE_STAFF, Items.ELECTRIC_FIRE_STAFF_II)
                .register();
        new Research(new NamespacedKey(FoxyMachines.getInstance(), "healing_bow"),
                6669668, "支援", 30)
                .addItems(Items.HEALING_BOW)
                .register();
        new Research(new NamespacedKey(FoxyMachines.getInstance(), "reinforced_string"),
                6669669, "更堅硬, 更好, 更強", 18)
                .addItems(Items.REINFORCED_STRING)
                .register();
        new Research(new NamespacedKey(FoxyMachines.getInstance(), "improvement_forge"),
                6669670, "超越想像", 48)
                .addItems(Items.IMPROVEMENT_FORGE)
                .register();
        new Research(new NamespacedKey(FoxyMachines.getInstance(), "improvement_core"),
                6669671, "向上1", 28)
                .addItems(Items.IMPROVEMENT_CORE)
                .register();
        new Research(new NamespacedKey(FoxyMachines.getInstance(), "potion_mixer"),
                6669672, "前所未有的釀造", 28)
                .addItems(Items.POTION_MIXER)
                .register();
        new Research(new NamespacedKey(FoxyMachines.getInstance(), "electric_gold_refinery"),
                6669673, "擺脫治煉爐", 28)
                .addItems(Items.ELECTRIC_GOLD_REFINERY)
                .register();
        new Research(new NamespacedKey(FoxyMachines.getInstance(), "chunk_loader"),
                6669674, "相當有用的工具", 52)
                .addItems(Items.CHUNK_LOADER)
                .register();
        new Research(new NamespacedKey(FoxyMachines.getInstance(), "stabilized_blistering_block"),
                6669675, "什麼材料", 26)
                .addItems(Items.STABILIZED_BLISTERING_BLOCK)
                .register();
        new Research(new NamespacedKey(FoxyMachines.getInstance(), "boosted_rail"),
                6669676, "更快, 更好, 更強", 16)
                .addItems(Items.BOOSTED_RAIL, Items.BOOSTED_ACTIVATOR_RAIL, Items.BOOSTED_DETECTOR_RAIL, Items.BOOSTED_POWERED_RAIL)
                .register();
        new Research(new NamespacedKey(FoxyMachines.getInstance(), "berry_bush_trimmer"),
                6669677, "注意安全!", 20)
                .addItems(Items.BERRY_BUSH_TRIMMER)
                .register();
        new Research(new NamespacedKey(FoxyMachines.getInstance(), "forcefield_dome"),
                6669678, "一個安全的空間", 66)
                .addItems(Items.FORCEFIELD_DOME)
                .register();
        new Research(new NamespacedKey(FoxyMachines.getInstance(), "remote_controller"),
                6669679, "從遙遠的地方", 32)
                .addItems(Items.REMOTE_CONTROLLER)
                .register();
        new Research(new NamespacedKey(FoxyMachines.getInstance(), "ingots"),
                6669680, "更多錠", 24)
                .addItems(Items.DEMONIC_INGOT, Items.AQUATIC_NETHERITE_INGOT, Items.DAMIENIUM, Items.SWEET_INGOT, Items.SWEETENED_SWEET_INGOT)
                .register();
        new Research(new NamespacedKey(FoxyMachines.getInstance(), "sacrificial_altar"),
                6669681, "獻祭", 40)
                .addItems(Items.SACRIFICIAL_ALTAR_BLACKSTONE_BRICK_STAIRS, Items.SACRIFICIAL_ALTAR_BLACKSTONE_BRICK_WALL,
                        Items.SACRIFICIAL_ALTAR_BLACKSTONE_BRICKS, Items.SACRIFICIAL_ALTAR_BLACKSTONE_PRESSURE_PLATE,
                        Items.SACRIFICIAL_ALTAR_SOUL_TORCH)
                .register();
        new Research(new NamespacedKey(FoxyMachines.getInstance(), "sacrificial_altar_drops"),
                6669682, "盈利", 28)
                .addItems(Items.CURSED_RABBIT_PAW, Items.HUMAN_SKULL, Items.BLOOD, Items.UNHOLY_WITHER_SKELETON_BONE,
                        Items.POLAR_FOX_HIDE, Items.MAGMA_ESSENCE, Items.TROPICAL_FISH_SCALE, Items.PARROT_FEATHER)
                .register();
        new Research(new NamespacedKey(FoxyMachines.getInstance(), "demonic_plate"),
                6669683, "惡魔板", 16)
                .addItems(Items.DEMONIC_PLATE)
                .register();
        new Research(new NamespacedKey(FoxyMachines.getInstance(), "forcefield_materials"),
                6669684, "在前往穹頂的途中", 36)
                .addItems(Items.FORCEFIELD_ENGINE, Items.FORCEFIELD_STABILIZER)
                .register();
        new Research(new NamespacedKey(FoxyMachines.getInstance(), "wireless_transmitter"),
                6669685, "沒有更多的電線", 26)
                .addItems(Items.WIRELESS_TRANSMITTER)
                .register();
        new Research(new NamespacedKey(FoxyMachines.getInstance(), "poseidons_fishing_rod"),
                6669686, "借助波塞冬的力量", 32)
                .addItems(Items.POSEIDONS_FISHING_ROD)
                .register();
        new Research(new NamespacedKey(FoxyMachines.getInstance(), "fishing_materials"),
                6669687, "更好的釣魚", 26)
                .addItems(Items.POSEIDONS_BLESSING)
                .register();
        new Research(new NamespacedKey(FoxyMachines.getInstance(), "swords"),
                6669688, "更好的劍", 44)
                .addItems(Items.CURSED_SWORD, Items.CELESTIAL_SWORD)
                .register();
        new Research(new NamespacedKey(FoxyMachines.getInstance(), "magic_lumps"),
                6669689, "更多的顆粒, 更多的魔法", 12)
                .addItems(Items.MAGIC_LUMP_4, Items.MAGIC_LUMP_5)
                .register();
        new Research(new NamespacedKey(FoxyMachines.getInstance(), "purified_bone"),
                6669690, "更多的顆粒, 更多的魔法", 22)
                .addItems(Items.PURIFIED_BONE, Items.PURE_BONE_DUST)
                .register();
        new Research(new NamespacedKey(FoxyMachines.getInstance(), "blood_infused_skull"),
                6669691, "血腥", 16)
                .addItems(Items.BLOOD_INFUSED_SKULL)
                .register();
        new Research(new NamespacedKey(FoxyMachines.getInstance(), "armor"),
                6669692, "更好的裝備", 42)
                .addItems(Items.AQUATIC_HELMET, Items.RESISTANT_CHESTPLATE, Items.FIERY_LEGGINGS, Items.LIGHT_BOOTS)
                .register();
        new Research(new NamespacedKey(FoxyMachines.getInstance(), "bloody_bucket"),
                6669693, "血腥之桶", 20)
                .addItems(Items.BUCKET_OF_BLOOD)
                .register();
        new Research(new NamespacedKey(FoxyMachines.getInstance(), "equanimous_gem"),
                6669694, "平衡, 應有的事物", 36)
                .addItems(Items.EQUANIMOUS_GEM)
                .register();
        new Research(new NamespacedKey(FoxyMachines.getInstance(), "ultimate_sword"),
                6669695, "終極劍", 52)
                .addItems(Items.ELUCIDATOR)
                .register();
        new Research(new NamespacedKey(FoxyMachines.getInstance(), "armor_frame"),
                6669696, "裝備框架", 24)
                .addItems(Items.AQUATIC_HELMET_FRAME, Items.RESISTANT_CHESTPLATE_FRAME, Items.FIERY_LEGGINGS_FRAME, Items.LIGHT_BOOTS_FRAME)
                .register();
    }
}
