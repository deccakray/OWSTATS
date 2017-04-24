package com.planarform.daniel.owstats;

import java.util.Map;

/**
 * Created by Daniel on 4/11/17.
 */

public class OWHanzo extends OWHero {
    Integer scatterArrowKills;
    Integer dragonStrikeKills;
    Integer dragonStrikeKillsMostInGame;
    Integer scatterArrowKillsMostInGame;
    Integer reconAssistsMostInGame;

    public OWHanzo(Map stats) {
        super(stats);
        this.scatterArrowKills = (Integer)stats.get("scatter_arrow_kills");
        this.dragonStrikeKills = (Integer)stats.get("dragonstrike_kills");
        this.dragonStrikeKillsMostInGame = (Integer)stats.get("dragonstrike_kills_most_in_game");
        this.scatterArrowKillsMostInGame = (Integer)stats.get("scatter_arrow_kills_most_in_game");
        this.reconAssistsMostInGame = (Integer)stats.get("recon_assists_most_in_game");
    }
}
