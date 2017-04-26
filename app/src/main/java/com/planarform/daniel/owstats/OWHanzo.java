package com.planarform.daniel.owstats;

import java.util.Map;

/**
 * Created by Daniel on 4/11/17.
 */

public class OWHanzo extends OWHero {
    Double scatterArrowKills;
    Double dragonStrikeKills;
    Double dragonStrikeKillsMostInGame;
    Double scatterArrowKillsMostInGame;
    Double reconAssistsMostInGame;

    public OWHanzo(Map stats) {
        super(stats);
        this.scatterArrowKills = (Double)stats.get("scatter_arrow_kills");
        this.dragonStrikeKills = (Double)stats.get("dragonstrike_kills");
        this.dragonStrikeKillsMostInGame = (Double)stats.get("dragonstrike_kills_most_in_game");
        this.scatterArrowKillsMostInGame = (Double)stats.get("scatter_arrow_kills_most_in_game");
        this.reconAssistsMostInGame = (Double)stats.get("recon_assists_most_in_game");
    }
}
