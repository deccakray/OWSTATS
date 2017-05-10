package com.planarform.daniel.owstats;

/**
 * Created by Daniel on 5/1/17.
 */
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TabsPagerAdapter extends FragmentPagerAdapter {

    // Tnteger to count number of tabs
    int tabCount;
    Bundle bundle;
    // Constructor to the class
    public TabsPagerAdapter(FragmentManager fm, int tabCount, Bundle bundle) {
        super(fm);
        // Initializing tab count
        this.tabCount= tabCount;
        this.bundle = bundle;
    }

    /**
     * Creates a new Fragment view based on which position (0,1,2)
     * @param position
     * @return
     */
    @Override
    public Fragment getItem(int position) {
        // Returning the current tabs
        switch (position) {
            case 0:
                PlayerStatsFragment playerStatsTab = new PlayerStatsFragment();
                playerStatsTab.setArguments(bundle);
                return playerStatsTab;
            case 1:
                TopHeroesFragment topHeroesTab = new TopHeroesFragment();
                topHeroesTab.setArguments(bundle);
                return topHeroesTab;
            case 2:
                AchievementsFragment achievementsTab = new AchievementsFragment();
                achievementsTab.setArguments(bundle);
                return achievementsTab;
            default:
                return null;
        }
    }
    @Override
    public int getCount() {
        return tabCount;
    }
}