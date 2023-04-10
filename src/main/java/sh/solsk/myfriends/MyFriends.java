package sh.solsk.myfriends;

import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;
import sh.solsk.myfriends.commands.FriendCommand;
import sh.solsk.myfriends.data.ThePlayer;
import sh.solsk.myfriends.listener.FriendListener;

import java.util.Map;
import java.util.logging.Logger;

public final class MyFriends extends JavaPlugin {

    private static MyFriends myFriends;
    public Logger logger;

    public Map<Player, ThePlayer> friendMap;

    @Override
    public void onEnable() {
        // Plugin startup logic

        myFriends = this;

        // Register MyFriends logger.
        this.logger = getLogger();

        // Register MyFreinds command.
        this.getCommand("friend").setExecutor(new FriendCommand());

        // Register MyFriends events
        getServer().getPluginManager().registerEvents(new FriendListener(), this);

    }

    public static MyFriends getMyFriends() {
        return myFriends;
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }



    @NotNull
    @Override
    public Logger getLogger() {
        return logger;
    }
}
