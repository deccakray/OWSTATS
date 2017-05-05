package com.planarform.daniel.owstats;

/**
 * Created by Daniel on 5/1/17.
 */
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.StrictMode;
import android.support.v4.app.Fragment;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import com.github.lzyzsd.circleprogress.DonutProgress;

import org.w3c.dom.Text;

import java.io.IOException;
import java.net.URL;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PlayerStatsFragment extends Fragment {
    TextView rankProgress;
    TextView levelProgress;
    TextView eliminationsView;
    TextView deathsView;
    TextView kpdView;
    TextView finalBlowsView;
    TextView healingView;
    TextView objKillsView;
    TextView objTimeView;
    TextView soloKillsView;
    TextView damageDoneView;
    ImageView rankIcon;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_player_stats, container, false);
        rankProgress = (TextView)rootView.findViewById(R.id.rank_progress);
        levelProgress = (TextView)rootView.findViewById(R.id.level_progress);
        CircleProgressBar levelProgressBar = (CircleProgressBar) rootView.findViewById(R.id.level_progressBar);
        CircleProgressBar rankProgressBar = (CircleProgressBar) rootView.findViewById(R.id.rank_progressBar);
        rankIcon = (ImageView)rootView.findViewById(R.id.rank_icon);

        eliminationsView = (TextView)rootView.findViewById(R.id.eliminations);
        deathsView = (TextView)rootView.findViewById(R.id.deaths);
        kpdView = (TextView)rootView.findViewById((R.id.kpd));
        finalBlowsView = (TextView)rootView.findViewById((R.id.final_blows));
        healingView = (TextView)rootView.findViewById((R.id.healing));
        objKillsView = (TextView)rootView.findViewById((R.id.obj_kills));
        objTimeView = (TextView)rootView.findViewById((R.id.obj_time));
        soloKillsView = (TextView)rootView.findViewById((R.id.solo_kills));
        damageDoneView = (TextView)rootView.findViewById((R.id.damage_done));

        Bundle bundle = getArguments();
        final OWPlayer player = (OWPlayer) bundle.getSerializable("player");
        String regionselection = player.regionSelection;


        // color of progress bars
        levelProgressBar.setColor(Color.rgb(61, 183, 255));
        rankProgressBar.setColor(Color.rgb(50, 255, 50));

        // All stats that are being displayed on this layout
        Double level = 0.0;
        Double prestige = 0.0;
        Double rank = 0.0;
        Double eliminations = 0.0;
        Double deaths = 0.0;
        Double kpd = 0.0;
        Double finalBlows = 0.0;
        Double healing = 0.0; // Healing Average, not correct value?
        Double objKills = 0.0;
        Double objTime = 0.0; // Need to format into 24-Hour Time Format
        Double soloKills = 0.0;
        Double damageDone = 0.0;

        // Initialize all values for usStats
        if(regionselection.equals("usStats")){
            level = player.usStats.quickplay.overall.level;
            prestige = player.usStats.quickplay.overall.prestige;
            rank = player.usStats.competitive.overall.compRank;
            eliminations = player.usStats.quickplay.average.eliminationsAverage;
            deaths = player.usStats.quickplay.average.deathsAverage;
            kpd = player.usStats.quickplay.game.kpd;
            finalBlows = player.usStats.quickplay.average.finalBlows;
            healing = player.usStats.quickplay.average.healingDoneAverage;
            objKills = player.usStats.quickplay.average.objectiveKillsAverage;
            objTime = player.usStats.quickplay.average.objectiveTimeAverage;
            soloKills = player.usStats.quickplay.average.soloKillsAverage;
            damageDone = player.usStats.quickplay.average.damageDoneAverage;
        }
        // Initialize all value for euStats
        else if(regionselection.equals("euStats")) {
            level = player.euStats.quickplay.overall.level;
            prestige = player.euStats.quickplay.overall.prestige;
            rank = player.euStats.competitive.overall.compRank;
            eliminations = player.euStats.quickplay.average.eliminationsAverage;
            deaths = player.euStats.quickplay.average.deathsAverage;
            kpd = player.euStats.quickplay.game.kpd;
            finalBlows = player.euStats.quickplay.average.finalBlows;
            healing = player.euStats.quickplay.average.healingDoneAverage;
            objKills = player.euStats.quickplay.average.objectiveKillsAverage;
            objTime = player.euStats.quickplay.average.objectiveTimeAverage;
            soloKills = player.euStats.quickplay.average.soloKillsAverage;
            damageDone = player.euStats.quickplay.average.damageDoneAverage;
        }
        // Initialize all values for krStats
        else if(regionselection.equals("krStats")) {
            level = player.krStats.quickplay.overall.level;
            prestige = player.krStats.quickplay.overall.prestige;
            rank = player.krStats.competitive.overall.compRank;
            eliminations = player.krStats.quickplay.average.eliminationsAverage;
            deaths = player.krStats.quickplay.average.deathsAverage;
            kpd = player.krStats.quickplay.game.kpd;
            finalBlows = player.krStats.quickplay.average.finalBlows;
            healing = player.krStats.quickplay.average.healingDoneAverage;
            objKills = player.krStats.quickplay.average.objectiveKillsAverage;
            objTime = player.krStats.quickplay.average.objectiveTimeAverage;
            soloKills = player.krStats.quickplay.average.soloKillsAverage;
            damageDone = player.krStats.quickplay.average.damageDoneAverage;
        }

        // set rank icon from SR
        Drawable bronze = getResources().getDrawable(R.drawable.rank_1);
        Drawable silver = getResources().getDrawable(R.drawable.rank_2);
        Drawable gold = getResources().getDrawable(R.drawable.rank_3);
        Drawable platinum = getResources().getDrawable(R.drawable.rank_4);
        Drawable diamond = getResources().getDrawable(R.drawable.rank_5);
        Drawable master = getResources().getDrawable(R.drawable.rank_6);
        Drawable grandmaster = getResources().getDrawable(R.drawable.rank_7);
        if(rank <= 1499 && rank >= 1){
            rankIcon.setImageDrawable(bronze);
        }
        else if (rank <= 1999 && rank >= 1500) {
            rankIcon.setImageDrawable(silver);
        }
        else if (rank <= 2499 && rank >= 2000) {
            rankIcon.setImageDrawable(gold);
        }
        else if (rank <= 2999 && rank >= 2500) {
            rankIcon.setImageDrawable(platinum);
        }
        else if (rank <= 3499 && rank >= 3000) {
            rankIcon.setImageDrawable(diamond);
        }
        else if (rank <= 3999 && rank >= 3500) {
            rankIcon.setImageDrawable(master);
        }
        else if (rank >= 4000) {
            rankIcon.setImageDrawable(grandmaster);
        }
        //set value for level progress
        Integer level_ = level.intValue() + prestige.intValue() * 100;
        levelProgress.setText(Integer.toString(level_));

        // set value for level progress bar
        float levelProgressValue = Float.valueOf(String.valueOf(level));
        levelProgressBar.setProgress(levelProgressValue);

        // rank value
        Integer rank_ = rank.intValue();
        rankProgress.setText(Integer.toString(rank_));

        // set value for rank progress bar
        float rankProgressValue = Float.valueOf(String.valueOf(rank));
        rankProgressBar.setProgress(rankProgressValue);



        DecimalFormat dformat = new DecimalFormat("#,###,###");
        // setting FEATURE stats
        /* Eliminations Stat */
        Spannable value = new SpannableString(Double.toString(eliminations));
        Spannable label = new SpannableString("ELIMINATIONS");
        value.setSpan(new ForegroundColorSpan(Color.WHITE), 0, value.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        label.setSpan(new ForegroundColorSpan(Color.BLACK), 0, label.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        eliminationsView.setText(value);
        eliminationsView.append("\n"+label);

        /* Death Stat */
        value = new SpannableString(Double.toString(deaths));
        label = new SpannableString("DEATHS");
        value.setSpan(new ForegroundColorSpan(Color.WHITE), 0, value.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        label.setSpan(new ForegroundColorSpan(Color.BLACK), 0, label.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        deathsView.setText(value);
        deathsView.append("\n"+label);

        /* KPD Stat */
        value = new SpannableString(Double.toString(kpd));
        label = new SpannableString("KPD");
        value.setSpan(new ForegroundColorSpan(Color.WHITE), 0, value.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        label.setSpan(new ForegroundColorSpan(Color.BLACK), 0, label.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        kpdView.setText(value);
        kpdView.append("\n"+label);

        /* Final Blows Stat */
        value = new SpannableString(Double.toString(finalBlows));
        label = new SpannableString("FINAL BLOWS");
        value.setSpan(new ForegroundColorSpan(Color.WHITE), 0, value.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        label.setSpan(new ForegroundColorSpan(Color.BLACK), 0, label.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        finalBlowsView.setText(value);
        finalBlowsView.append("\n"+label);

        /* Need More Healing Stat */
        value = new SpannableString(Double.toString(healing));
        label = new SpannableString("HEALING");
        value.setSpan(new ForegroundColorSpan(Color.WHITE), 0, value.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        label.setSpan(new ForegroundColorSpan(Color.BLACK), 0, label.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        healingView.setText(value);
        healingView.append("\n"+label);

        /* Objective Kills Stat */
        value = new SpannableString(Double.toString(objKills));

        label = new SpannableString("OBJ. KILLS");

        value.setSpan(new ForegroundColorSpan(Color.WHITE), 0, value.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        label.setSpan(new ForegroundColorSpan(Color.BLACK), 0, label.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        objKillsView.setText(value);
        objKillsView.append("\n"+label);

        /* Objective Time Stat */

        // This minutes/seconds part is pure aids (and isn't correct yet)
        Double objTimeMinutes = objTime * 60;
        Double objTimeSeconds = objTimeMinutes%360;
        Double objTimeMinutes_ = (objTimeMinutes *60);
        int objTimeMinutes__= objTimeMinutes_.intValue();
        Double objTimeSeconds_ = objTimeSeconds* 60;
        int objTimeSeconds__ = objTimeSeconds_.intValue();
        String objTimeFormat = Integer.toString(objTimeMinutes__)+":"+Integer.toString(objTimeSeconds__);

        value = new SpannableString(objTimeFormat);
        label = new SpannableString("OBJ. TIME");
        value.setSpan(new ForegroundColorSpan(Color.WHITE), 0, value.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        label.setSpan(new ForegroundColorSpan(Color.BLACK), 0, label.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);


        objTimeView.setText(value);
        objTimeView.append("\n"+label);

        /* Solo Kills Stat */
        value = new SpannableString(Double.toString(soloKills));
        label = new SpannableString("SOLO KILLS");
        value.setSpan(new ForegroundColorSpan(Color.WHITE), 0, value.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        label.setSpan(new ForegroundColorSpan(Color.BLACK), 0, label.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        soloKillsView.setText(value);
        soloKillsView.append("\n"+label);

        /* Damage Done Stat */

        // change damage into ###,### format
        int damageDone_ = damageDone.intValue();
        String damageDone_str = dformat.format(damageDone_);
        value = new SpannableString(damageDone_str);
        label = new SpannableString("DMG DONE");

        value.setSpan(new ForegroundColorSpan(Color.WHITE), 0, value.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        label.setSpan(new ForegroundColorSpan(Color.BLACK), 0, label.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        damageDoneView.setText(value);
        damageDoneView.append("\n"+label);

        // I cant get the fucking scroll to work with this shitty layout for fucks sake

//
//
//
// String[] testArray = {"nig, nia, nasdf, lkj, klsdfjds"};
//        ListView gameListView = (ListView)rootView.findViewById(R.id.game_listView);
//        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.activity_listview, testArray);
//        gameListView.setAdapter(adapter);

        // for rank image icon
//        Thread thread = new Thread(new Runnable() {
//
//            @Override
//            public void run() {
//                try  {
//
//                    String rankImageURL = player.usStats.competitive.overall.rankImage;
//                    try {
//                        URL url = new URL(rankImageURL);
//                        image = BitmapFactory.decodeStream(url.openConnection().getInputStream());
//                    } catch(IOException e) {
//                        System.out.println(e);
//                    }
//                    rankImage.setImageBitmap(image);
//
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            }
//        });
//
//        thread.start();




        return rootView;
    }
}