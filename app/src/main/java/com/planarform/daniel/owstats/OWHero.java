package com.planarform.daniel.owstats;

import java.util.Map;

/**
 * Created by Daniel on 4/10/17.
 */

public class OWHero {
    Double turretsDestroyed;
    Double environmentalDeaths;
    Double teleporterPadsDestroyed;
    Double shotsHit;

    public OWHero(Map stats) {
        this.turretsDestroyed = (Double)stats.get("turrets_destroyed");
    }
}
