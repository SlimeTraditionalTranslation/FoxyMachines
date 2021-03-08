package me.gallowsdove.foxymachines.types;

import me.gallowsdove.foxymachines.FoxyMachines;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.cscorelib2.item.CustomItem;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.meta.ItemMeta;

public class FoxyRecipeType {
    private static final CustomItem QUEST_ITEM = new CustomItem(new CustomItem(Material.MOJANG_BANNER_PATTERN, "&6任務獎勵", "", "&e&o通過劍來完成此任務.",
            "&e&o使用 &c/foxy quest &e&o來查看你當前的任務."));
    static {
        ItemMeta meta = QUEST_ITEM.getItemMeta();
        meta.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
        QUEST_ITEM.setItemMeta(meta);
    }

    public static RecipeType SACRIFICIAL_ALTAR = new RecipeType(new NamespacedKey(FoxyMachines.getInstance(), "sacrificial_altar"),
            new CustomItem(Material.POLISHED_BLACKSTONE_BRICKS, "&c獻祭祭壇", "", "&e&o獻祭怪物在獻祭祭壇中",
                    "&e&o使用 &c/foxy altar &e&o來查看多重方塊的蓋法."));
    public static RecipeType FISHING = new RecipeType(new NamespacedKey(FoxyMachines.getInstance(), "fishing"),
            new CustomItem(Material.FISHING_ROD, "&b釣魚", "", "&e&o通過釣魚獲得此."));
    public static RecipeType QUEST = new RecipeType(new NamespacedKey(FoxyMachines.getInstance(), "quest"), QUEST_ITEM);
}
