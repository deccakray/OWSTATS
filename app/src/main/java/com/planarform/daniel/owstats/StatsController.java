package com.planarform.daniel.owstats;

import android.app.ActionBar;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.provider.ContactsContract;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.volley.VolleyError;

import org.w3c.dom.Text;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Daniel on 3/22/17.
 * This class will display stats that the user searches.
 */

public class StatsController extends AppCompatActivity implements TabLayout.OnTabSelectedListener{

    private TabLayout tabLayout;
    private ViewPager  viewPager;
    private ImageView profileIcon;
    private TextView playerNameView;
    NetworkingManager networkManager;
    String avatarURL;
    // Tab titles
    private String[] tabs = { "Player Stats", "Top Heroes", "Achievements" };

    protected void onCreate(Bundle savedInstanceStates) {
        super.onCreate(savedInstanceStates);
        setContentView(R.layout.stats_layout);

        viewPager = (ViewPager) findViewById(R.id.pager);
        profileIcon = (ImageView)findViewById(R.id.profile_icon);

        //Adding toolbar to the activity
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        //Initializing the tablayout
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);

        Intent intent = getIntent();
        Map playerMap = (HashMap<String, Object>) intent.getSerializableExtra("player_map");
        OWPlayer player = new OWPlayer(playerMap, (String) playerMap.get("battle_tag"), (String)playerMap.get("region_selection"));
        Bundle bundle = new Bundle();
        bundle.putSerializable("player", player);
        intent.putExtras(bundle);

        avatarURL = player.usStats.quickplay.overall.avatar;
        this.setImageIconToolBar(avatarURL);
        playerNameView = (TextView)findViewById(R.id.player_name);
        String battleTag= (String) playerMap.get("battle_tag");
        String[] playerName = battleTag.split("-");
        playerNameView.setText(playerName[0].toUpperCase());

        //Adding the tabs using addTab() method
        tabLayout.addTab(tabLayout.newTab().setText(tabs[0]));
        tabLayout.addTab(tabLayout.newTab().setText(tabs[1]));
        tabLayout.addTab(tabLayout.newTab().setText(tabs[2]));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        //Initializing viewPager
        viewPager = (ViewPager) findViewById(R.id.pager);

        //Creating our pager adapter
        TabsPagerAdapter adapter = new TabsPagerAdapter(getSupportFragmentManager(), tabLayout.getTabCount(), getIntent().getExtras());

        //Adding adapter to pager
        viewPager.setAdapter(adapter);

        //Adding onTabSelectedListener to swipe views
        tabLayout.setOnTabSelectedListener(this);


        // Getting data back from SearchController via Intents



//        Double deaths = player.usStats.quickplay.game.turretsDestroyed;
//        test.setText(Double.toString(deaths));
    }


    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        viewPager.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }

    public void setImageIconToolBar(String URL) {
        networkManager = NetworkingManager.getInstance();
        networkManager.sendImageRequest(URL, new NetworkingListener<String, VolleyError>() {
            @Override
            public void onResponse(String response) {
            }

            @Override
            public void onError(VolleyError error) {
                error.printStackTrace();
            }

            @Override
            public void onImageDownloaded(Bitmap bitmap) {
                profileIcon.setImageBitmap(bitmap);
            }
        });
    }

}
