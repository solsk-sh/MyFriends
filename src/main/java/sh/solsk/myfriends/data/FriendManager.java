package sh.solsk.myfriends.data;

import sh.solsk.myfriends.commands.FriendCommand;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class FriendManager {

    private Map<ThePlayer, TheFriend> friendMap;

    public FriendManager () {
        this.friendMap = new HashMap<>();
    }

    public void loadFriends() {

    }

    public void unloadFriends() {

    }

}
