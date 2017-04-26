package com.planarform.daniel.owstats;

import java.util.Map;

/**
 * Created by Daniel on 4/11/17.
 */

public class OWZenyatta extends OWHero {
    Double transcendenceHealingBest;

    public OWZenyatta(Map stats) {
        super(stats);
        this.transcendenceHealingBest = (Double)stats.get("transcendence_healing_best");
    }
}
