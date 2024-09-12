package com.bcci.client;

import com.bcci.controller.IPLController;

public class MainClient {
	public static void main(String[] args) {
		IPLController iplController = new IPLController();

		// Adding players to the IPL system
		iplController.addPlayer(7, "Thala", "Chennai Super Kings", 4500);
		iplController.addPlayer(3, "Chinaa Thala", "Chennai Super Kings", 6000);
		iplController.addPlayer(45, "Rohit Sharma", "Mumbai Indians", 5000);
		iplController.addPlayer(18, "Virat Kohli","Royal Challengers Bangalore ", 7000);
        iplController.addPlayer(33, "David Warner", "Sunrisers Hyderabad", 5500);

		// Displaying all player details
		System.out.println("Displaying all players in the IPL:  \n");
		iplController.displayAllPlayers();

		System.out.println("______________________________________________________________________");

		// Displaying only CSK players
		System.out.println("Displaying Chennai Super Kings players: \n");
		iplController.displayCskPlayers();

		System.out.println("______________________________________________________________________");

		// Displaying players with more than 5000 runs
		System.out.println("Displaying players with more than 5000 runs: \n");
		iplController.displayPlayersWithMoreThan5000Runs();
	}
}
