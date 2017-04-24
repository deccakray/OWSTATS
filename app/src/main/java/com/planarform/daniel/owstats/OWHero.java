package com.planarform.daniel.owstats;

import java.util.Map;

/**
 * Created by Daniel on 4/10/17.
 */

public class OWHero {
    Integer turretsDestroyed;
    Integer environmentalDeaths;
    Integer teleporterPadsDestroyed;
    Integer shotsHit;

    public OWHero(Map stats) {
        this.turretsDestroyed = (Integer)stats.get("turrets_destroyed");
    }
}
