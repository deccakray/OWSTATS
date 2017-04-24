package com.planarform.daniel.owstats;

import java.util.Map;

/**
 * Created by Daniel on 4/11/17.
 */

public class OWGameStats {
    Integer turretsDestroyed;
    Integer killStreakBest;
    Double objectiveTimeMostInGame;
    Integer environmentalKills;
    Integer timePlayed;
    Double kpd;
    Integer gamesTied;
    Integer medalsSilver;
    Integer healingDone;
    Integer cards;
    Integer eliminations;
    Integer reconAssists;
    Integer multikills;
    Integer finalBlows;
    Integer damageDone;
    Integer defensiveAssists;
    Integer soloKills;
    Integer medalsBronze;
    Integer multikillBest;
    Integer soloKillsMostInGame;
    Integer finalBlowsMostInGame;
    Integer eliminationsMostInGame;
    Integer damageDoneMostInGame;
    Integer offensiveAssists;
    Integer environmentalDeaths;
    Integer objectiveKills;
    Integer gamesLost;
    Integer environmentalKillsMostInGame;
    Integer medals;
    Integer gamesWon;
    Integer medalsGold;
    Integer deaths;
    Integer objectiveTime;

    public OWGameStats(Map stats) {
        this.turretsDestroyed = (Integer)stats.get("turrets_destroyed");
        this.killStreakBest = (Integer)stats.get("kill_streak_best");
        this.objectiveTimeMostInGame = (Double)stats.get("objective_time_most_in_game");
        this.environmentalKills = (Integer)stats.get("environmental_kills");
        this.timePlayed = (Integer)stats.get("time_played");
        this.kpd = (Double)stats.get("kpd");
        this.gamesTied = (Integer)stats.get("games_tied");
        this.medalsSilver = (Integer)stats.get("medals_silver");
        this.healingDone = (Integer)stats.get("healing_done");
        this.cards = (Integer)stats.get("cards");
        this.eliminations = (Integer)stats.get("eliminations");
        this.reconAssists = (Integer)stats.get("recon_assists");
        this.multikills = (Integer)stats.get("multikills");
        this.finalBlows = (Integer)stats.get("final_blows");
        this.damageDone = (Integer)stats.get("damage_done");
        this.defensiveAssists = (Integer)stats.get("defensive_assists");
        this.soloKills = (Integer)stats.get("solo_kills");
        this.medalsBronze = (Integer)stats.get("medals_bronze");
        this.multikillBest = (Integer)stats.get("multikill_best");
        this.soloKillsMostInGame = (Integer)stats.get("solo_kills_most_in_game");
        this.finalBlowsMostInGame = (Integer)stats.get("final_blows_most_in_game");
        this.eliminationsMostInGame = (Integer)stats.get("eliminations_most_in_game");
        this.damageDoneMostInGame = (Integer)stats.get("damage_done_most_in_game");
        this.offensiveAssists = (Integer)stats.get("offensive_assists");
        this.environmentalDeaths = (Integer)stats.get("environmental_deaths");
        this.objectiveKills = (Integer)stats.get("objective_kills");
        this.gamesLost = (Integer)stats.get("games_lost");
        this.environmentalKillsMostInGame = (Integer)stats.get("environmental_kills_most_in_game");
        this.medals = (Integer)stats.get("medals");
        this.gamesWon = (Integer)stats.get("games_won");
        this.medalsGold = (Integer)stats.get("medals_gold");
        this.deaths = (Integer)stats.get("deaths");
        this.objectiveTime = (Integer)stats.get("objective_time");


    }

}
