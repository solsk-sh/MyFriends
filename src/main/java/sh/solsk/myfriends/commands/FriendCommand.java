package sh.solsk.myfriends.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.jetbrains.annotations.NotNull;

public class FriendCommand implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

        Player player;

        // Check for console command sending.
        if (!(commandSender instanceof Player)) {
            commandSender.sendPlainMessage("");
            return true;
        }

        // Set the player to the commandSender
        player = ((Player) commandSender).getPlayer();

        if (args.length == 0) {
            if(!player.hasPermission("myfriends.base") || !player.hasPermission("myfriends.*") || !player.isOp()) {
                // TODO: You do not have permission!
                return true;
            }

        } else if (args.length > 0 && args[0].equalsIgnoreCase("list")) {
            if(!player.hasPermission("myfriends.base") || !player.hasPermission("myfriends.*") || !player.isOp()) {
                // TODO: You do not have permission!
                return true;
            }


        } else if (args.length > 0 && args[0].equalsIgnoreCase("add")) {

        }


        return false;
    }
}
