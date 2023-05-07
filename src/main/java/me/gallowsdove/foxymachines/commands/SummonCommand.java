package me.gallowsdove.foxymachines.commands;

import io.github.mooy1.infinitylib.commands.SubCommand;
import me.gallowsdove.foxymachines.abstracts.CustomMob;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.mini2Dx.gettext.GetText;

import javax.annotation.Nonnull;
import java.util.List;

public final class SummonCommand extends SubCommand {

    public SummonCommand() {
        super("summon", GetText.tr("Summons a custom mob"), "foxymachines.admin");
    }

    @Override
    protected void execute(@Nonnull CommandSender commandSender, @Nonnull String[] args) {
        if (!(commandSender instanceof Player p)) {
            return;
        }

        if (args.length != 1) {
            commandSender.sendMessage(ChatColor.LIGHT_PURPLE + GetText.tr("Usage: /foxy summon <MOB_ID>"));
            return;
        }

        CustomMob mob = CustomMob.getByID(args[0]);

        if (mob != null) {
            mob.spawn(p.getLocation());
        }
    }


    @Override
    protected void complete(@Nonnull CommandSender commandSender, @Nonnull String[] args, @Nonnull List<String> tabs) {
        tabs.addAll(CustomMob.MOBS.keySet());
    }
}