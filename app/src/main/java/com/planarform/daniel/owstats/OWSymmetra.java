package com.planarform.daniel.owstats;

import java.util.Map;

/**
 * Created by Daniel on 4/17/17.
 */

public class OWSymmetra extends OWHero {
    Integer sentryTurretKills;
    Integer sentryTurretKillsMostInGame;

    public OWSymmetra(Map stats) {
        super(stats);
        this.sentryTurretKills = (Integer)stats.get("sentry_turret_kills");
        this.sentryTurretKillsMostInGame = (Integer)stats.get("sentry_turret_kills_most_in_game");
    }
}
