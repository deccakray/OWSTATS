package com.planarform.daniel.owstats;

import java.util.Map;

/**
 * Created by Daniel on 4/11/17.
 */

public class OWReinhardt extends OWHero {
    Double damageBlockedMostInGame;
    Double damageBlocked;
    Double fireStrikeKillsMostInGame;
    Double chargeKillsMostInGame;
    Double earthshatterKillsMostInGame;
    Double chargeKills;
    Double earthshatterKills;
    Double fireStrikeKills;

    public OWReinhardt (Map stats) {
        super(stats);
        this.damageBlockedMostInGame = (Double)stats.get("damage_blocked_most_in_game");
        this.damageBlocked = (Double)stats.get("damage_blocked");
        this.fireStrikeKills = (Double)stats.get("fire_strike_kills");
        this.fireStrikeKillsMostInGame = (Double)stats.get("fire_strike_kills_most_in_game");
        this.chargeKillsMostInGame = (Double)stats.get("charge_kills_most_in_game");
        this.earthshatterKills = (Double)stats.get("earthshatter_kills");
        this.earthshatterKillsMostInGame = (Double)stats.get("earthshatter_kills_most_in_game");
        this.chargeKills = (Double)stats.get("charge_kills");
    }
}
