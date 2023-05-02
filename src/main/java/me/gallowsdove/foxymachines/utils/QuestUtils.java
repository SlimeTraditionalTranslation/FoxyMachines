package me.gallowsdove.foxymachines.utils;

import de.unpixelt.locale.Locale;
import de.unpixelt.locale.Translate;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.utils.ChatUtils;
import lombok.Getter;
import me.gallowsdove.foxymachines.FoxyMachines;
import me.gallowsdove.foxymachines.Items;
import org.bukkit.ChatColor;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.logging.Level;

public class QuestUtils {
    private QuestUtils() {}

    public static final NamespacedKey KEY = new NamespacedKey(FoxyMachines.getInstance(), "quest");

    private static final List<EntityType> QUEST_MOBS = new ArrayList<>();
    private static final List<Line> CURSED_LINES = List.of(
            new Line("我很想殺死一隻「", "」，它多麼的好吃！"),
            new Line("給我一隻「", "」，現在！"),
            new Line("你當然可以幫我殺一隻「", "」。"),
            new Line("我想要鮮血....「", "」的鮮血。"),
            new Line("我要一隻「", "」的肝臟。"),
            new Line("我有聽說過「", "」的鮮血多麼的美味..."),
            new Line("「", "」心臟，hmmm..."),
            new Line("我會殺死上帝自己的「", "」肉。"),
            new Line("我可能會吞食「", "」一整天。"),
            new Line("我已經等待太久。太久時間或一天來殺死一隻「", "」。"),
            new Line("「", "」的鮮血將要噴灑"),
            new Line("我的詛咒將會吞噬「", "」的靈魂"));
    private static final List<Line> CELESTIAL_LINES = List.of(
            new Line("我愛所有人... 除了「", "」，我憎恨那些."),
            new Line("眾生必須平等，這就是為什麼我需要殺死一隻「", "」。"),
            new Line("我是天上，但我也是一把劍。現在給我一隻「", "」。"),
            new Line("我很抱歉，但請給我一些「", "」。不許問任何問題。"),
            new Line("天劍需要天祭。一隻「", "」。"),
            new Line("我下一個受害者應該是「", "」，就像是神所打算的。"),
            new Line("接下來是 ...「", "」！"),
            new Line("上帝要「", "」死亡。"),
            new Line("為了上帝和榮譽，請殺死「", "」。"),
            new Line("去，拿到那隻「", "」！為了正義！"),
            new Line("星星已對齊。我可以清楚的看到「", "」會被我的刀刃殺死"));


    public static void init() {
        if (!QUEST_MOBS.isEmpty()) {
            FoxyMachines.log(Level.WARNING, "Attempted to initialize QuestUtils after already initialized!");
        }

        for (String questMob : FoxyMachines.getInstance().getConfig().getStringList("quest-mobs")) {
            try {
                QuestUtils.QUEST_MOBS.add(EntityType.valueOf(questMob));
            } catch (IllegalArgumentException ignored) {
                FoxyMachines.log(Level.WARNING, "在「quest-mobs」中有無效的實體累行：" + questMob);
            }
        }
    }

    @ParametersAreNonnullByDefault
    public static boolean hasActiveQuest(Player p) {
        return p.getPersistentDataContainer().has(KEY, PersistentDataType.INTEGER);
    }

    @ParametersAreNonnullByDefault
    public static boolean isQuestEntity(Player p, LivingEntity e) {
        return hasActiveQuest(p) && toEntityType(p, getQuestLine(p)) == e.getType();
    }

    @ParametersAreNonnullByDefault
    public static int getQuestLine(Player p) {
        PersistentDataContainer container = p.getPersistentDataContainer();
        int id;

        if (container.has(KEY, PersistentDataType.INTEGER)) {
            id = container.get(KEY, PersistentDataType.INTEGER);
        } else {
            id = nextQuestLine(p);
        }

        return id;
    }

    @ParametersAreNonnullByDefault
    public static int nextQuestLine(Player p) {
        int id = ThreadLocalRandom.current().nextInt(QUEST_MOBS.size());
        p.getPersistentDataContainer().set(KEY, PersistentDataType.INTEGER, id);
        return id;
    }

    @ParametersAreNonnullByDefault
    public static void sendQuestLine(Player p, SlimefunItemStack item) {
        ThreadLocalRandom random = ThreadLocalRandom.current();
        int id = getQuestLine(p);

        if (item == Items.CURSED_SWORD) {
            int i = random.nextInt(CURSED_LINES.size());
            Line line = CURSED_LINES.get(i);
            p.sendMessage(ChatColor.RED + line.firstHalf() + toString(p, id) + line.secondHalf());
        } else if (item == Items.CELESTIAL_SWORD) {
            int i = random.nextInt(CELESTIAL_LINES.size());
            Line line = CELESTIAL_LINES.get(i);
            p.sendMessage(ChatColor.YELLOW + line.firstHalf() + toString(p, id) + line.secondHalf());
        }
    }

    @ParametersAreNonnullByDefault
    public static void resetQuestLine(Player p) {
        PersistentDataContainer container = p.getPersistentDataContainer();

        if (container.has(KEY, PersistentDataType.INTEGER)) {
            container.remove(KEY);
        }
    }

    public static EntityType toEntityType(Player p, int id) {
        if (id >= QUEST_MOBS.size()) {
            id = nextQuestLine(p);
        }

        return QUEST_MOBS.get(id);
    }

    public static String toString(Player p, int id) {
        if (id >= QUEST_MOBS.size()) {
            id = nextQuestLine(p);
        }

        return Translate.getEntity(p, QUEST_MOBS.get(id));
    }
}

record Line(@Getter String firstHalf, @Getter String secondHalf) { }
