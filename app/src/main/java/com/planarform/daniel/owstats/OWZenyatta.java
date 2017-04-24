package com.planarform.daniel.owstats;

import java.util.Map;

/**
 * Created by Daniel on 4/11/17.
 */

public class OWZenyatta extends OWHero {
    Integer transcendenceHealingBest;

    public OWZenyatta(Map stats) {
        super(stats);
        this.transcendenceHealingBest = (Integer)stats.get("transcendence_healing_best");
    }
}
