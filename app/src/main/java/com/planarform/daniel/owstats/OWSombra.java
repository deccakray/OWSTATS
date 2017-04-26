package com.planarform.daniel.owstats;

import java.util.Map;

/**
 * Created by Daniel on 4/11/17.
 */

public class OWSombra extends OWHero {
    Double finalBlows;

    public OWSombra(Map stats) {
        super(stats);
        this.finalBlows = (Double)stats.get("melee_final_blows_most_in_game");
    }

}
