package com.ipl.app;

import com.ipl.controller.PlayerController;

public class Main {
    public static void main(String[] args) {
        PlayerController controller = new PlayerController();

        controller.addPlayer(1, "Virat Kohli", "RCB", "Batsman", 500, 0);
        controller.addPlayer(2, "Jasprit Bumrah", "MI", "Bowler", 50, 25);

        controller.updatePlayerStats(1, 50, 0);
        controller.updatePlayerStats(2, 0, 2);

        controller.showAllPlayers();
        controller.topScorer();
        controller.topWicketTaker();
    }
}
