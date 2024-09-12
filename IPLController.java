package com.bcci.controller;

import com.bcci.service.IPLService;

public class IPLController {
    private IPLService iplService;

    public IPLController() {
        this.iplService = new IPLService();
    }

    public void addPlayer(int jerseyNo, String name, String teamName, int runs) {
        iplService.addPlayer(jerseyNo, name, teamName, runs);
    }

    public void displayAllPlayers() {
        iplService.allPlayerDetails();
    }
 
    
    // Method to display only CSK players
    public void displayCskPlayers() {
        iplService.cskPlayerDetails();
    }
    
    public void displayPlayersWithMoreThan5000Runs() {
        iplService.playersWithMoreThan5000Runs();
    }
}
