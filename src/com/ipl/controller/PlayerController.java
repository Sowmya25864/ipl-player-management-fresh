package com.ipl.controller;

import com.ipl.model.Player;
import com.ipl.view.PlayerView;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PlayerController {
    private final List<Player> players = new ArrayList<>();

    public void addPlayer(int id, String name, String team, String role, int runs, int wickets) {
        Player p = new Player(id, name, team, role, runs, wickets);
        players.add(p);
        PlayerView.displayMessage("Added: " + name);
    }

    public void updatePlayerStats(int id, int runs, int wickets) {
        for (Player p : players) {
            if (p.getId() == id) {
                p.addRuns(runs);
                p.addWickets(wickets);
                PlayerView.displayMessage("Updated stats for " + p.getName());
                return;
            }
        }
        PlayerView.displayMessage("Player not found");
    }

    public void showAllPlayers() {
        PlayerView.displayAllPlayers(players);
    }

    public void topScorer() {
        players.stream().max(Comparator.comparingInt(Player::getRuns))
               .ifPresentOrElse(
                   p -> PlayerView.displayMessage("Top Scorer: " + p.getName() + " (" + p.getRuns() + ")"),
                   () -> PlayerView.displayMessage("No players")
               );
    }

    public void topWicketTaker() {
        players.stream().max(Comparator.comparingInt(Player::getWickets))
               .ifPresentOrElse(
                   p -> PlayerView.displayMessage("Top Wicket-Taker: " + p.getName() + " (" + p.getWickets() + ")"),
                   () -> PlayerView.displayMessage("No players")
               );
    }
}
