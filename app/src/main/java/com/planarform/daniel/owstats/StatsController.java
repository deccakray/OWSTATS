package com.planarform.daniel.owstats;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.volley.VolleyError;
import java.util.HashMap;
import java.util.Map;

import static com.planarform.daniel.owstats.SearchController.context;

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
    Button backButton;
    // Tab titles
    private String[] tabs = { "Player Stats", "Top Heroes", "Achievements" };

    protected void onCreate(Bundle savedInstanceStates) {
        super.onCreate(savedInstanceStates);
        setContentView(R.layout.stats_layout);
        // Font used from Assets/Fonts
        Typeface OWFONT = Typeface.createFromAsset(context.getAssets(),  "fonts/big_noodle_titling_oblique.ttf");

        viewPager = (ViewPager) findViewById(R.id.pager);
        profileIcon = (ImageView)findViewById(R.id.profile_icon);
        backButton = (Button)findViewById(R.id.back_button);
        backButton.setBackgroundResource(R.drawable.back_3x);

        //Adding toolbar to the activity
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        TextView player_name = (TextView)findViewById(R.id.player_name);
        player_name.setTypeface(OWFONT);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


        //Initializing the tablayout
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);

        Intent intent = getIntent();
        Map playerMap = (HashMap<String, Object>) intent.getSerializableExtra("player_map");
        OWPlayer player = new OWPlayer(playerMap, (String) playerMap.get("battle_tag"), (String)playerMap.get("region_selection"));
        Bundle bundle = new Bundle();
        bundle.putSerializable("player", player);
        intent.putExtras(bundle);

        //Adding Avatar to Toolbar at top of screen
        avatarURL = player.usStats.quickplay.overall.avatar;
        this.setImageIconToolBar(avatarURL);
        playerNameView = (TextView)findViewById(R.id.player_name);
        String battleTag= (String) playerMap.get("battle_tag");
        String[] playerName = battleTag.split("-");
        playerNameView.setText(playerName[0].toUpperCase());

        //Adding the tabs using addTab() method
        // Player Stats, Top Heroes, Achievements
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
    }
    @Override
    public void onBackPressed() {
        return;
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

    /**
     * Function used for setting avatar at toolbar from URL given by JSON response from OWAPI endpoint
     * @param URL
     */
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
