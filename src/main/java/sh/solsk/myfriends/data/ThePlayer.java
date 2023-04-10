package sh.solsk.myfriends.data;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ThePlayer {

    UUID playerId;
    List<UUID> friendList = new ArrayList<>();
    List<UUID> pendingInvites = new ArrayList<>();
    List<UUID> blocked = new ArrayList<>();

    boolean autoDecline, notify;


    public ThePlayer(UUID playerId) {
        this.autoDecline = false;
        this.notify = true;
        this.playerId = playerId;
    }

    public List<UUID> getFriendList() {
        return friendList;
    }

    public boolean addFriend(UUID playerId) {
        if (!friendList.contains(playerId)) return false;
        this.friendList.add(playerId);
        return true;
    }

    public boolean removeFriend(UUID playerId) {
        if (!friendList.contains(playerId)) return false;
        this.friendList.remove(playerId);
        return true;
    }

    public void clearFriends() {
        friendList.clear();
    }
    public List<UUID> getPendingInvites() {
        return pendingInvites;
    }

    public boolean addPendingInvite(UUID playerId) {
        if (!pendingInvites.contains(playerId)) return false;
        this.pendingInvites.add(playerId);
        return true;
    }

    public boolean ignorePendingInvite(UUID playerId) {
        if (!pendingInvites.contains(playerId)) return false;
        this.pendingInvites.remove(playerId);
        return true;
    }

    public void clearPendingInvites() {
        pendingInvites.clear();
    }

    public List<UUID> getBlocked() {
        return blocked;
    }

    public void addBlocked(UUID playerId) {
        this.blocked.add(playerId);
    }

    public boolean removeBlocked(UUID playerId) {
        if (!blocked.contains(playerId)) return false;
        blocked.remove(playerId);
        return true;
    }

    public void clearBlocked() {
        blocked.clear();
    }

    public boolean isAutoDecline() {
        return autoDecline;
    }

    public void setAutoDecline(boolean autoDecline) {
        this.autoDecline = autoDecline;
    }

    public boolean isNotify() {
        return notify;
    }

    public void setNotify(boolean notify) {
        this.notify = notify;
    }
}
