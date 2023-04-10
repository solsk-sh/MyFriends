package sh.solsk.myfriends.listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerKickEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.entity.Player;
import sh.solsk.myfriends.MyFriends;

public class FriendListener implements Listener {

    private final MyFriends myFriends = MyFriends.getMyFriends();

    @EventHandler(priority = EventPriority.LOW)
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player joinedPlayer = event.getPlayer();

        // TODO: Notify player of pending invites.
        // TODO: Notify players' friends of them joining.
        // TODO: Load players friends.
        // TODO: Load players blocked players.
        // TODO: Load players pending invites.



    }

    @EventHandler(priority = EventPriority.LOW)
    public void onPlayerQuit(PlayerQuitEvent event) {
        Player quitPlayer = event.getPlayer();

        // TODO: Notify friends of friend quitting.
    }

    @EventHandler(priority = EventPriority.LOW)
    public void onPlayerKick(PlayerKickEvent event) {
        Player kickedPlayer = event.getPlayer();
        // TODO: Check if kickEvent notification is true.
        // TODO: Notify players' friends of friend getting kicked.
    }



}
