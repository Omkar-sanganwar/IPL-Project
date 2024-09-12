package com.bcci.service;

import com.bcci.dao.PlayerDao;
import com.bcci.entity.Player;

public class IPLService {
	private PlayerDao playerDao;

	public IPLService() {
		this.playerDao = new PlayerDao();
	}

	public void addPlayer(int jerseyNo, String name, String teamName, int runs) {
		Player player = new Player(jerseyNo, name, teamName, runs);
		playerDao.addPlayer(player);
	}

	public void allPlayerDetails() {
		for (Player player : playerDao.getAllPlayers()) {
			System.out.println(player);
		}
	}

	// Method to display only CSK players
	public void cskPlayerDetails() {
		for (Player player : playerDao.getAllPlayers()) {
			if ("Chennai Super Kings".equals(player.getTeamName())) {
				System.out.println(player);
			}
		}
	}

	// Method to display players with more than 5000 runs
	public void playersWithMoreThan5000Runs() {
		for (Player player : playerDao.getAllPlayers()) {
			if (player.getRuns() > 5000) {
				System.out.println(player);
			}
		}

	}
}
