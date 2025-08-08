package com.ipl.view;

import com.ipl.model.Player;
import java.util.List;

public class PlayerView {
    public static void displayPlayer(Player p) {
        System.out.println(p);
    }

    public static void displayAllPlayers(List<Player> players) {
        if (players.isEmpty()) {
            System.out.println("No players.");
            return;
        }
        for (Player p : players) System.out.println(p);
    }

    public static void displayMessage(String msg) {
        System.out.println(msg);
    }
}
