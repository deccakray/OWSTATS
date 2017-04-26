package com.planarform.daniel.owstats;

import java.util.Map;

/**
 * Created by Daniel on 4/11/17.
 */

public class OWSoldier76 extends OWHero {
    Double helixRocketsKillsMostInGame;
    Double tacticalVisorKills;
    Double helixRocketsKills;
    Double meleeFinalBlowsMostInGame;
    Double tacticalVisorKillsMostInGame;
    Double bioticFieldsDeployed;
    Double bioticFieldHealingDone;

    public OWSoldier76 (Map stats) {
        super(stats);
        this.helixRocketsKillsMostInGame = (Double)stats.get("helix_rockets_kills_most_in_game");
        this.tacticalVisorKills = (Double)stats.get("tactical_visor_kills");
        this.helixRocketsKills = (Double)stats.get("helix_rockets_kills");
        this.meleeFinalBlowsMostInGame = (Double)stats.get("melee_final_blows_most_in_game");
        this.tacticalVisorKillsMostInGame = (Double)stats.get("tactical_visor_kills_most_in_game");
        this.bioticFieldHealingDone = (Double)stats.get("biotic_field_healing_done");
        this.bioticFieldsDeployed = (Double)stats.get("biotic_fields_deployed");
    }

}
