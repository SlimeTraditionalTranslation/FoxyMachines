package me.gallowsdove.foxymachines.types;

import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import me.gallowsdove.foxymachines.FoxyMachines;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.meta.ItemMeta;
import org.mini2Dx.gettext.GetText;

public class FoxyRecipeType {
    private static final CustomItemStack QUEST_ITEM = new CustomItemStack(new CustomItemStack(Material.MOJANG_BANNER_PATTERN, GetText.tr("&6Quest Reward"), "", GetText.tr("&e&oGet this by completing the quest with the sword."),
            GetText.tr("&e&oUse &c/foxy quest &e&oto view your current quest.")));
    static {
        ItemMeta meta = QUEST_ITEM.getItemMeta();
        meta.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
        QUEST_ITEM.setItemMeta(meta);
    }

    public static RecipeType SACRIFICIAL_ALTAR = new RecipeType(new NamespacedKey(FoxyMachines.getInstance(), "sacrificial_altar"),
            new CustomItemStack(Material.POLISHED_BLACKSTONE_BRICKS, GetText.tr("&cSacrificial Altar"), "", GetText.tr("&e&oSacrifice the mob in the Sacrificial Altar"),
                    GetText.tr("&e&oUse &c/foxy altar &e&oto view the multiblock.")));
    public static RecipeType FISHING = new RecipeType(new NamespacedKey(FoxyMachines.getInstance(), "fishing"),
            new CustomItemStack(Material.FISHING_ROD, GetText.tr("&bFishing"), "", GetText.tr("&e&oGet this as a fishing loot.")));
    public static RecipeType QUEST = new RecipeType(new NamespacedKey(FoxyMachines.getInstance(), "quest"), QUEST_ITEM);
    public static RecipeType CUSTOM_MOB_DROP = new RecipeType(new NamespacedKey(FoxyMachines.getInstance(), "mob_drop"),
            new CustomItemStack(Material.DIAMOND_SWORD, GetText.tr("&aUnique Mob Drop"), "", GetText.tr("&e&oObtained by killing the specified mob.")));
}
