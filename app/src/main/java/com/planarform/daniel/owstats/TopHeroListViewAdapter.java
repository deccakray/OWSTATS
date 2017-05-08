package com.planarform.daniel.owstats;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/**
 * Created by Daniel on 5/4/17.
 */

import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

import static com.planarform.daniel.owstats.SearchController.context;

public class TopHeroListViewAdapter extends BaseAdapter{
    ArrayList<String> heroNames;
    Context context;
    int [] heroIcons;
    ArrayList<String> heroValues;
    ArrayList<Integer> maxValue;
    private static LayoutInflater inflater=null;
    public TopHeroListViewAdapter(TopHeroesFragment topHeroesFragment, ArrayList<String> heroNames,
                                  int [] heroIcons, ArrayList<String> heroValues, ArrayList<Integer> maxValue) {
        // TODO Auto-generated constructor stub
        this.heroNames = heroNames;
        this.context=topHeroesFragment.getActivity();
        this.heroIcons = heroIcons;
        this.heroValues = heroValues;
        this.maxValue = maxValue;
        inflater = ( LayoutInflater )context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        // TODO Auto-generated method stub
       return 24;
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    public class Holder
    {
        TextView heroNameView;
        TextView heroValueView;
        ImageView heroIconView;
        ProgressBar progressBar;
    }
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        Holder holder=new Holder();
        View rowView;
        Typeface OWFONT = Typeface.createFromAsset(context.getAssets(),  "fonts/big_noodle_titling_oblique.ttf");

        rowView = inflater.inflate(R.layout.activity_listview, null);
        holder.heroNameView=(TextView) rowView.findViewById(R.id.hero_name);
        holder.heroIconView=(ImageView) rowView.findViewById(R.id.hero_icon);
        holder.heroValueView=(TextView) rowView.findViewById(R.id.hero_value);
        holder.progressBar=(ProgressBar) rowView.findViewById(R.id.progressBar);
        holder.heroNameView.setText(heroNames.get(position));
        holder.heroValueView.setText(heroValues.get(position));
        holder.heroNameView.setTypeface(OWFONT);
        holder.heroValueView.setTypeface(OWFONT);
        holder.heroIconView.setImageResource(heroIcons[position]);
        // this progress is incorrect
        holder.progressBar.setProgress(maxValue.get(position));
        rowView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
//                Toast.makeText(context, "You Clicked "+result[position], Toast.LENGTH_LONG).show();
            }
        });
        return rowView;
    }

}