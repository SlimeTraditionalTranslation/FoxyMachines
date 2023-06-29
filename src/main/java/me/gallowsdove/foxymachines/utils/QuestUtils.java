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
import org.mini2Dx.gettext.GetText;

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
            new Line(GetText.tr("I would love to kill a "), GetText.tr(", so tasty!")),
            new Line(GetText.tr("Give me a "), GetText.tr(", now!")),
            new Line(GetText.tr("Surely you can help me slay a "), GetText.tr(".")),
            new Line(GetText.tr("I want blood....  "), GetText.tr(" blood.")),
            new Line(GetText.tr("I need a "), GetText.tr(" liver.")),
            new Line(GetText.tr("I've heard that "), GetText.tr(" blood is tasty...")),
            new Line("", GetText.tr(" heart, hmmm...")),
            new Line(GetText.tr("I would slay God himself for some "), GetText.tr(" flesh.")),
            new Line(GetText.tr("I could be devouring a "), GetText.tr(" whole day.")),
            new Line(GetText.tr("I've been waiting for too long. Too long or a day to kill a "), GetText.tr(".")),
            new Line("", GetText.tr("'s blood shall be spilled")),
            new Line(GetText.tr("My curse shall devour "), GetText.tr("'s soul")));
    private static final List<Line> CELESTIAL_LINES = List.of(
            new Line(GetText.tr("I love all beings... except "), GetText.tr(", I hate those.")),
            new Line(GetText.tr("All life must be in balance, what's why I need to kill a "), GetText.tr(".")),
            new Line(GetText.tr("I am celestial, but I am also a sword. Now get me a "), GetText.tr(".")),
            new Line(GetText.tr("I'm sorry, but please get me some "), GetText.tr(". No questions.")),
            new Line(GetText.tr("Celestial sword requires a celestial sacrifice. A "), GetText.tr(".")),
            new Line(GetText.tr("My next victim should be "), GetText.tr(", just as God intended.")),
            new Line(GetText.tr("And the next in line is ... "), GetText.tr("!")),
            new Line(GetText.tr("The God wants a "), GetText.tr(" dead.")),
            new Line(GetText.tr("For God and honour, go slay a "), GetText.tr(".")),
            new Line(GetText.tr("Go, get that "), GetText.tr("! For justice!")),
            new Line(GetText.tr("The stars have aligned. I can clearly see the "), GetText.tr(" that shall die by my blade")));


    public static void init() {
        if (!QUEST_MOBS.isEmpty()) {
            FoxyMachines.log(Level.WARNING, "Attempted to initialize QuestUtils after already initialized!");
            return;
        }

        for (String questMob : FoxyMachines.getInstance().getConfig().getStringList("quest-mobs")) {
            try {
                QuestUtils.QUEST_MOBS.add(EntityType.valueOf(questMob));
            } catch (IllegalArgumentException ignored) {
                FoxyMachines.log(Level.WARNING, GetText.tr("Invalid Entity Type in \"quest-mobs\": ") + questMob);
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
            p.sendMessage(ChatColor.RED + line.firstHalf() + "「" + toString(p, id) + "」" + line.secondHalf());
        } else if (item == Items.CELESTIAL_SWORD) {
            int i = random.nextInt(CELESTIAL_LINES.size());
            Line line = CELESTIAL_LINES.get(i);
            p.sendMessage(ChatColor.YELLOW + line.firstHalf() + "「" + toString(p, id) + "」" + line.secondHalf());
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

        return Translate.getEntity(Locale.zh_tw, QUEST_MOBS.get(id));
    }
}

record Line(@Getter String firstHalf, @Getter String secondHalf) { }
