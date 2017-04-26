package com.planarform.daniel.owstats;

import java.util.Map;

/**
 * Created by Daniel on 4/11/17.
 */

public class OWGameStats {
   Double turretsDestroyed;
    Double killStreakBest;
    Double objectiveTimeMostInGame;
    Double environmentalKills;
    Double timePlayed;
    Double kpd;
    Double gamesTied;
    Double medalsSilver;
    Double healingDone;
    Double cards;
    Double eliminations;
    Double reconAssists;
    Double multikills;
    Double finalBlows;
    Double damageDone;
    Double defensiveAssists;
    Double soloKills;
    Double medalsBronze;
    Double multikillBest;
    Double soloKillsMostInGame;
    Double finalBlowsMostInGame;
    Double eliminationsMostInGame;
    Double damageDoneMostInGame;
    Double offensiveAssists;
    Double environmentalDeaths;
    Double objectiveKills;
    Double gamesLost;
    Double environmentalKillsMostInGame;
    Double medals;
    Double gamesWon;
    Double medalsGold;
    Double deaths;
    Double objectiveTime;

    public OWGameStats(Map stats) {
        this.turretsDestroyed = (Double)stats.get("turrets_destroyed");
        this.killStreakBest = (Double)stats.get("kill_streak_best");
        this.objectiveTimeMostInGame = (Double)stats.get("objective_time_most_in_game");
        this.environmentalKills = (Double)stats.get("environmental_kills");
        this.timePlayed = (Double)stats.get("time_played");
        this.kpd = (Double)stats.get("kpd");
        this.gamesTied = (Double)stats.get("games_tied");
        this.medalsSilver = (Double)stats.get("medals_silver");
        this.healingDone = (Double)stats.get("healing_done");
        this.cards = (Double)stats.get("cards");
        this.eliminations = (Double)stats.get("eliminations");
        this.reconAssists = (Double)stats.get("recon_assists");
        this.multikills = (Double)stats.get("multikills");
        this.finalBlows = (Double)stats.get("final_blows");
        this.damageDone = (Double)stats.get("damage_done");
        this.defensiveAssists = (Double)stats.get("defensive_assists");
        this.soloKills = (Double)stats.get("solo_kills");
        this.medalsBronze = (Double)stats.get("medals_bronze");
        this.multikillBest = (Double)stats.get("multikill_best");
        this.soloKillsMostInGame = (Double)stats.get("solo_kills_most_in_game");
        this.finalBlowsMostInGame = (Double)stats.get("final_blows_most_in_game");
        this.eliminationsMostInGame = (Double)stats.get("eliminations_most_in_game");
        this.damageDoneMostInGame = (Double)stats.get("damage_done_most_in_game");
        this.offensiveAssists = (Double)stats.get("offensive_assists");
        this.environmentalDeaths = (Double)stats.get("environmental_deaths");
        this.objectiveKills = (Double)stats.get("objective_kills");
        this.gamesLost = (Double)stats.get("games_lost");
        this.environmentalKillsMostInGame = (Double)stats.get("environmental_kills_most_in_game");
        this.medals = (Double)stats.get("medals");
        this.gamesWon = (Double)stats.get("games_won");
        this.medalsGold = (Double)stats.get("medals_gold");
        this.deaths = (Double)stats.get("deaths");
        this.objectiveTime = (Double)stats.get("objective_time");


    }

}
