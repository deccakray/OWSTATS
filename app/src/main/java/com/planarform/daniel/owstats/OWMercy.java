package com.planarform.daniel.owstats;

import java.util.Map;

/**
 * Created by Daniel on 4/11/17.
 */

public class OWMercy extends OWHero {
    Double playersResurrectedMostInGame;
    Double playersRessurrected;

    public OWMercy(Map stats) {
        super(stats);
        this.playersResurrectedMostInGame = (Double)stats.get("players_resurrected_most_in_game");
        this.playersRessurrected = (Double)stats.get("players_resurrected");

    }

}
