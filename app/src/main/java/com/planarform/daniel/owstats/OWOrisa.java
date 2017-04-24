package com.planarform.daniel.owstats;

import java.util.Map;

/**
 * Created by Daniel on 4/11/17.
 */

public class OWOrisa extends OWHero {
    Integer finalBlows;
    public OWOrisa(Map stats){
        super(stats);
        this.finalBlows = (Integer)stats.get("melee_final_blow_most_in_game");
    }
}

