package com.bcci.dao;

import com.bcci.entity.Player;
import java.util.HashSet;
import java.util.Set;

public class PlayerDao {
    private Set<Player> players = new HashSet<>();

    public void addPlayer(Player player) {
        players.add(player);
    }

    public Set<Player> getAllPlayers() {
        return players;
    }
}
