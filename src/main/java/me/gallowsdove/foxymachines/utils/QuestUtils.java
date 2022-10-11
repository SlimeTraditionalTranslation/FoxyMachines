package me.gallowsdove.foxymachines.utils;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import lombok.Getter;
import me.gallowsdove.foxymachines.FoxyMachines;
import me.gallowsdove.foxymachines.Items;
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
            p.sendMessage(ChatColor.RED + line.firstHalf() + toString(id) + line.secondHalf());
        } else if (item == Items.CELESTIAL_SWORD) {
            int i = random.nextInt(CELESTIAL_LINES.size());
            Line line = CELESTIAL_LINES.get(i);
            p.sendMessage(ChatColor.YELLOW + line.firstHalf() + toString(id) + line.secondHalf());
        }
    }

    public static EntityType toEntityType(int id) {
        Validate.isTrue(id <= 51, "Entity ID can't be greater than 61");

        return switch (id) {
            case 0 -> EntityType.BAT;
            case 1 -> EntityType.BEE;
            case 2 -> EntityType.BLAZE;
            case 3 -> EntityType.CAT;
            case 4 -> EntityType.CHICKEN;
            case 5 -> EntityType.CAVE_SPIDER;
            case 6 -> EntityType.COD;
            case 7 -> EntityType.COW;
            case 8 -> EntityType.CREEPER;
            case 9 -> EntityType.DOLPHIN;
            case 10 -> EntityType.DONKEY;
            case 11 -> EntityType.DROWNED;
            case 12 -> EntityType.ENDERMAN;
            case 13 -> EntityType.FOX;
            case 14 -> EntityType.GHAST;
            case 15 -> EntityType.GUARDIAN;
            case 16 -> EntityType.HOGLIN;
            case 17 -> EntityType.HUSK;
            case 18 -> EntityType.HORSE;
            case 19 -> EntityType.IRON_GOLEM;
            case 20 -> EntityType.LLAMA;
            case 21 -> EntityType.MAGMA_CUBE;
            case 22 -> EntityType.MUSHROOM_COW;
            case 23 -> EntityType.OCELOT;
            case 24 -> EntityType.PANDA;
            case 25 -> EntityType.PARROT;
            case 26 -> EntityType.PHANTOM;
            case 27 -> EntityType.PIG;
            case 28 -> EntityType.PIGLIN;
            case 29 -> EntityType.PIGLIN_BRUTE;
            case 30 -> EntityType.PILLAGER;
            case 31 -> EntityType.POLAR_BEAR;
            case 32 -> EntityType.PUFFERFISH;
            case 33 -> EntityType.RABBIT;
            case 34 -> EntityType.SALMON;
            case 35 -> EntityType.SHEEP;
            case 36 -> EntityType.SILVERFISH;
            case 37 -> EntityType.SKELETON;
            case 38 -> EntityType.SLIME;
            case 39 -> EntityType.SNOWMAN;
            case 40 -> EntityType.SPIDER;
            case 41 -> EntityType.SQUID;
            case 42 -> EntityType.STRAY;
            case 43 -> EntityType.STRIDER;
            case 44 -> EntityType.TURTLE;
            case 45 -> EntityType.TROPICAL_FISH;
            case 46 -> EntityType.WITCH;
            case 47 -> EntityType.WITHER_SKELETON;
            case 48 -> EntityType.WOLF;
            case 49 -> EntityType.ZOGLIN;
            case 50 -> EntityType.ZOMBIE;
            case 51 -> EntityType.ZOMBIFIED_PIGLIN;
            default -> EntityType.FOX;
        };
    }

    public static String toString(int id) {
        Validate.isTrue(id <= 51, "Entity ID can't be greater than 61");

        return switch (id) {
            case 0 -> "蝙蝠";
            case 1 -> "蜜蜂";
            case 2 -> "烈焰使者";
            case 3 -> "貓";
            case 4 -> "雞";
            case 5 -> "洞穴蜘蛛";
            case 6 -> "鱈魚";
            case 7 -> "牛";
            case 8 -> "苦力怕";
            case 9 -> "海豚";
            case 10 -> "驢子";
            case 11 -> "沉屍";
            case 12 -> "終界使者";
            case 13 -> "狐狸";
            case 14 -> "地獄幽靈";
            case 15 -> "深海守衛";
            case 16 -> "豬布獸";
            case 17 -> "屍殼";
            case 18 -> "馬";
            case 19 -> "鐵魔像";
            case 20 -> "駱馬";
            case 21 -> "岩漿立方怪";
            case 22 -> "哞菇";
            case 23 -> "山貓";
            case 24 -> "貓熊";
            case 25 -> "鸚鵡";
            case 26 -> "夜魅";
            case 27 -> "豬";
            case 28 -> "豬布林";
            case 29 -> "豬布林蠻兵";
            case 30 -> "掠奪者";
            case 31 -> "北極熊";
            case 32 -> "河豚";
            case 33 -> "兔子";
            case 34 -> "鮭魚";
            case 35 -> "綿羊";
            case 36 -> "蠹魚";
            case 37 -> "骷髏";
            case 38 -> "史萊姆";
            case 39 -> "雪人";
            case 40 -> "蜘蛛";
            case 41 -> "魷魚";
            case 42 -> "流髑";
            case 43 -> "熾足獸";
            case 44 -> "海龜";
            case 45 -> "熱帶魚";
            case 46 -> "女巫";
            case 47 -> "凋零骷髏";
            case 48 -> "狼";
            case 49 -> "豬屍獸";
            case 50 -> "殭屍";
            case 51 -> "殭屍化豬布林";
            default -> "狐狸";
        };
    }
}

record Line(@Getter String firstHalf, @Getter String secondHalf) { }
