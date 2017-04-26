package com.planarform.daniel.owstats;


import java.util.ArrayList;
import java.util.Map;

/**
 * Created by Daniel on 4/11/17.
 */

public class OWHeroStats {
    OWDva dva;
    OWOrisa orisa;
    OWWidowmaker widowmaker;
    OWMei mei;
    OWTracer tracer;
    OWBastion bastion;
    OWRoadhog roadhog;
    OWJunkrat junkrat;
    OWAna ana;
    OWLucio lucio;
    OWSombra sombra;
    OWReaper reaper;
    OWHanzo hanzo;
    OWWinston winston;
    OWZarya zarya;
    OWMercy mercy;
    OWMccree mccree;
    OWReinhardt reinhardt;
    OWSoldier76 soldier76;
    OWSymmetra symmetra;
    OWZenyatta zenyatta;
    OWPharah pharah;
    OWTorbjorn torbjorn;
    OWGenji genji;

    public OWHeroStats(Map stats) {
//        if(stats.get("dva")!= null){
//            this.dva = new OWDva((Map)stats.get("dva"));
//        }
        this.dva = new OWDva((Map)stats.get("dva"));
        this.orisa = new OWOrisa((Map)stats.get("orisa"));
        this.widowmaker = new OWWidowmaker((Map)stats.get("widowmaker"));
        this.mei = new OWMei((Map)stats.get("mei"));
        this.tracer = new OWTracer((Map)stats.get("tracer"));
        this.bastion = new OWBastion((Map)stats.get("bastion"));
        this.roadhog = new OWRoadhog((Map)stats.get("roadhog"));
        this.junkrat = new OWJunkrat((Map)stats.get("junkrat"));
        this.genji = new OWGenji((Map)stats.get("genji"));
        this.ana = new OWAna((Map)stats.get("ana"));
        this.lucio = new OWLucio((Map)stats.get("lucio"));
        this.sombra = new OWSombra((Map)stats.get("sombra"));
        this.reaper = new OWReaper((Map)stats.get("reaper"));
        this.hanzo = new OWHanzo((Map)stats.get("hanzo"));
        this.winston = new OWWinston((Map)stats.get("winston"));
        this.zarya = new OWZarya((Map)stats.get("zarya"));
        this.mercy = new OWMercy((Map)stats.get("mercy"));
        this.mccree = new OWMccree((Map)stats.get("mccree"));
        this.reinhardt = new OWReinhardt((Map)stats.get("reinhardt"));
        this.soldier76 = new OWSoldier76((Map)stats.get("soldier76"));
        this.zenyatta = new OWZenyatta((Map)stats.get("zenyatta"));
        this.pharah = new OWPharah((Map)stats.get("pharah"));
        this.symmetra = new OWSymmetra((Map)stats.get("symmetra"));
        this.torbjorn = new OWTorbjorn((Map)stats.get("torbjorn"));
    }
}
