package com.planarform.daniel.owstats;

import android.content.Context;
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
public class TopHeroListViewAdapter extends BaseAdapter{
    String [] heroNames;
    Context context;
    int [] heroIcons;
    String [] heroValues;
    private static LayoutInflater inflater=null;
    public TopHeroListViewAdapter(TopHeroesFragment topHeroesFragment, String[] heroNames, int[] heroIcons, String[] heroValues) {
        // TODO Auto-generated constructor stub
        this.heroNames = heroNames;
        this.context=topHeroesFragment.getActivity();
        this.heroIcons = heroIcons;
        this.heroValues = heroValues;
        inflater = ( LayoutInflater )context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return heroNames.length;
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
        rowView = inflater.inflate(R.layout.activity_listview, null);
        holder.heroNameView=(TextView) rowView.findViewById(R.id.hero_name);
        holder.heroIconView=(ImageView) rowView.findViewById(R.id.hero_icon);
        holder.heroValueView=(TextView) rowView.findViewById(R.id.hero_value);
        holder.heroNameView.setText(heroNames[position]);
        holder.heroValueView.setText(heroValues[position]);
        holder.heroIconView.setImageResource(heroIcons[position]);
//        holder.progressBar.setProgress()
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