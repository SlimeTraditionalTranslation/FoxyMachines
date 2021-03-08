package me.gallowsdove.foxymachines.utils;

import lombok.AllArgsConstructor;
import lombok.Getter;
import me.gallowsdove.foxymachines.FoxyMachines;
import me.gallowsdove.foxymachines.Items;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.apache.commons.lang.Validate;
import org.bukkit.ChatColor;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class QuestUtils {
    public static NamespacedKey KEY = new NamespacedKey(FoxyMachines.getInstance(), "quest");

    private static final List<Line> CURSED_LINES = List.of(
            new Line("我很想殺死一隻 ", ", 多麼的好吃!"),
            new Line("給我一隻 ", ", 現在!"),
            new Line("你當然可以幫我殺一隻 ", "."),
            new Line("我想要鮮血....  ", " 的鮮血."),
            new Line("我要一隻 ", " 的肝臟."),
            new Line("我有聽說過 ", " 的鮮血多麼的美味..."),
            new Line("", " 心臟, hmmm..."),
            new Line("我會殺死上帝自己的 ", " 肉."),
            new Line("我可能會吞食 ", " 一整天."),
            new Line("我已經等待太久. 太久時間或一天來殺死一隻 ", "."),
            new Line("", "的鮮血將要噴灑"),
            new Line("我的詛咒將會吞噬 ", "的靈魂"));
    private static final List<Line> CELESTIAL_LINES = List.of(
            new Line("我愛所有人... 除了 ", ", 我憎恨那些."),
            new Line("眾生必須平等, 這就是為甚麼我需要殺死一隻 ", "."),
            new Line("我是天上, 但我也是一把劍. 現在給我一隻 ", "."),
            new Line("我很抱歉, 但請給我一些 ", ". 不許問任何問題."),
            new Line("天劍需要天祭. 一隻 ", "."),
            new Line("我下一個受害者應該是 ", ", 就像是神所打算的."),
            new Line("接下來是 ... ", "!"),
            new Line("上帝要 ", " 死亡."),
            new Line("為了上帝和榮譽, 請殺死 ", "."),
            new Line("去, 拿到那隻 ", "! 為了正義!"),
            new Line("星星已對齊. 我可以清楚的看到 ", " 會被我的刀刃殺死"));

    @ParametersAreNonnullByDefault
    public static void sendQuestLine(Player p, SlimefunItemStack item) {
        PersistentDataContainer container = p.getPersistentDataContainer();
        ThreadLocalRandom random = ThreadLocalRandom.current();
        int id;

        if (container.has(KEY, PersistentDataType.INTEGER)) {
            id = container.get(KEY, PersistentDataType.INTEGER);
        } else {
            id = random.nextInt(52);
            container.set(KEY, PersistentDataType.INTEGER, id);
        }

        if (item == Items.CURSED_SWORD) {
            int i = random.nextInt(CURSED_LINES.size());
            Line line = CURSED_LINES.get(i);
            p.sendMessage(ChatColor.RED + line.getFirstHalf() + toString(id) + line.getSecondHalf());
        } else if (item == Items.CELESTIAL_SWORD) {
            int i = random.nextInt(CELESTIAL_LINES.size());
            Line line = CELESTIAL_LINES.get(i);
            p.sendMessage(ChatColor.YELLOW + line.getFirstHalf() + toString(id) + line.getSecondHalf());
        }
    }

    public static EntityType toEntityType(int id) {
        Validate.isTrue(id <= 61, "Entity ID can't be greater than 61");

        switch (id) {
            case 0:
                return EntityType.BAT;
            case 1:
                return EntityType.BEE;
            case 2:
                return EntityType.BLAZE;
            case 3:
                return EntityType.CAT;
            case 4:
                return EntityType.CHICKEN;
            case 5:
                return EntityType.CAVE_SPIDER;
            case 6:
                return EntityType.COD;
            case 7:
                return EntityType.COW;
            case 8:
                return EntityType.CREEPER;
            case 9:
                return EntityType.DOLPHIN;
            case 10:
                return EntityType.DONKEY;
            case 11:
                return EntityType.DROWNED;
            case 12:
                return EntityType.ENDERMAN;
            case 13:
                return EntityType.FOX;
            case 14:
                return EntityType.GHAST;
            case 15:
                return EntityType.GUARDIAN;
            case 16:
                return EntityType.HOGLIN;
            case 17:
                return EntityType.HUSK;
            case 18:
                return EntityType.HORSE;
            case 19:
                return EntityType.IRON_GOLEM;
            case 20:
                return EntityType.LLAMA;
            case 21:
                return EntityType.MAGMA_CUBE;
            case 22:
                return EntityType.MUSHROOM_COW;
            case 23:
                return EntityType.OCELOT;
            case 24:
                return EntityType.PANDA;
            case 25:
                return EntityType.PARROT;
            case 26:
                return EntityType.PHANTOM;
            case 27:
                return EntityType.PIG;
            case 28:
                return EntityType.PIGLIN;
            case 29:
                return EntityType.PIGLIN_BRUTE;
            case 30:
                return EntityType.PILLAGER;
            case 31:
                return EntityType.POLAR_BEAR;
            case 32:
                return EntityType.PUFFERFISH;
            case 33:
                return EntityType.RABBIT;
            case 34:
                return EntityType.SALMON;
            case 35:
                return EntityType.SHEEP;
            case 36:
                return EntityType.SILVERFISH;
            case 37:
                return EntityType.SKELETON;
            case 38:
                return EntityType.SLIME;
            case 39:
                return EntityType.SNOWMAN;
            case 40:
                return EntityType.SPIDER;
            case 41:
                return EntityType.SQUID;
            case 42:
                return EntityType.STRAY;
            case 43:
                return EntityType.STRIDER;
            case 44:
                return EntityType.TURTLE;
            case 45:
                return EntityType.TROPICAL_FISH;
            case 46:
                return EntityType.WITCH;
            case 47:
                return EntityType.WITHER_SKELETON;
            case 48:
                return EntityType.WOLF;
            case 49:
                return EntityType.ZOGLIN;
            case 50:
                return EntityType.ZOMBIE;
            case 51:
                return EntityType.ZOMBIFIED_PIGLIN;
        }
        return EntityType.FOX;
    }

    public static String toString(int id) {
        Validate.isTrue(id <= 61, "Entity ID can't be greater than 61");

        switch (id) {
            case 0:
                return "蝙蝠";
            case 1:
                return "蜜蜂";
            case 2:
                return "烈焰使者";
            case 3:
                return "貓";
            case 4:
                return "雞";
            case 5:
                return "洞穴蜘蛛";
            case 6:
                return "鱈魚";
            case 7:
                return "牛";
            case 8:
                return "苦力怕";
            case 9:
                return "海豚";
            case 10:
                return "驢子";
            case 11:
                return "沉屍";
            case 12:
                return "終界使者";
            case 13:
                return "狐狸";
            case 14:
                return "地獄幽靈";
            case 15:
                return "深海守衛";
            case 16:
                return "豬布獸";
            case 17:
                return "屍殼";
            case 18:
                return "馬";
            case 19:
                return "鐵魔像";
            case 20:
                return "駱馬";
            case 21:
                return "岩漿立方怪";
            case 22:
                return "哞菇";
            case 23:
                return "山貓";
            case 24:
                return "貓熊";
            case 25:
                return "鸚鵡";
            case 26:
                return "夜魅";
            case 27:
                return "豬";
            case 28:
                return "豬布林";
            case 29:
                return "豬布林蠻兵";
            case 30:
                return "掠奪者";
            case 31:
                return "北極熊";
            case 32:
                return "河豚";
            case 33:
                return "兔子";
            case 34:
                return "鮭魚";
            case 35:
                return "綿羊";
            case 36:
                return "蠹魚";
            case 37:
                return "骷髏";
            case 38:
                return "史萊姆";
            case 39:
                return "雪人";
            case 40:
                return "蜘蛛";
            case 41:
                return "魷魚";
            case 42:
                return "流髑";
            case 43:
                return "熾足獸";
            case 44:
                return "海龜";
            case 45:
                return "熱帶魚";
            case 46:
                return "女巫";
            case 47:
                return "凋零骷髏";
            case 48:
                return "狼";
            case 49:
                return "豬屍獸";
            case 50:
                return "殭屍";
            case 51:
                return "殭屍化豬布林";
        }
        return "狐狸";
    }
}

@AllArgsConstructor
class Line {
    @Getter
    private final String firstHalf;
    @Getter
    private final String secondHalf;
}
