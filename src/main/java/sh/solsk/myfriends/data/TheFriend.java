package sh.solsk.myfriends.data;

import org.bukkit.Bukkit;

import java.util.UUID;

public class TheFriend {

    private String playerName;
    private UUID playerId;

    private boolean isFriend, isBlocked, isPending;

    public TheFriend(UUID playerId) {
        this.playerId = playerId;
        this.playerName = Bukkit.getOfflinePlayer(playerId).getName();
    }

    public String getPlayerName() {
        return playerName;
    }

    public UUID getPlayerId() {
        return playerId;
    }

    public boolean isFriend() {
        return isFriend;
    }

    public void setFriend(boolean friend) {
        isFriend = friend;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public void setBlocked(boolean blocked) {
        isBlocked = blocked;
    }

    public boolean isPending() {
        return isPending;
    }

    public void setPending(boolean pending) {
        isPending = pending;
    }
}
