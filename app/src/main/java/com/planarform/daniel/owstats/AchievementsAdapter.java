package com.planarform.daniel.owstats;

import android.content.ClipData;
import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import static com.planarform.daniel.owstats.SearchController.context;

/**
 * Created by Daniel on 5/7/17.
 */


public class AchievementsAdapter extends BaseAdapter {
    private ArrayList<OWAchievement> achievementObject;
    private static LayoutInflater inflater=null;
    Context context;

    public AchievementsAdapter(AchievementsFragment achievementsFragment, ArrayList<OWAchievement> achievementObject) {
        this.achievementObject = achievementObject;
        this.context = achievementsFragment.getActivity();
       // inflater = ( LayoutInflater )context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount() {
        return achievementObject.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    public class Holder
    {

        TextView achievementNameView;
        ImageView achievementIconView;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // TODO Auto-generated method stub
//
        View grid;
        AchievementsAdapter.Holder holder = new AchievementsAdapter.Holder();
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        Typeface OWFONT = Typeface.createFromAsset(context.getAssets(),  "fonts/big_noodle_titling_oblique.ttf");


        if (convertView == null) {

            grid = new View(context);
            grid = inflater.inflate(R.layout.achievement_item, null);
            holder.achievementNameView = (TextView) grid.findViewById(R.id.achievement_name);
            holder.achievementIconView = (ImageView)grid.findViewById(R.id.achievement_icon);
            holder.achievementNameView.setText(achievementObject.get(position).name);
            holder.achievementNameView.setTypeface(OWFONT);
            Picasso.with(context).load(achievementObject.get(position).url).into(holder.achievementIconView);
            if(achievementObject.get(position).isFinished!=true){
                holder.achievementIconView.setAlpha((float) 0.1);
                holder.achievementNameView.setAlpha((float)0.1);
            }
        } else {
            grid = convertView;
        }

        return grid;
    }
}
