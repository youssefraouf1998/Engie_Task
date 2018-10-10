package com.example.android.firsttask;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;



public class ViewPagerAdapter extends PagerAdapter {

    private ArrayList<ModelpagerViewe>mlist;
    private Context context;
    private LayoutInflater layoutInflater;
    public ViewPagerAdapter(ArrayList<ModelpagerViewe> mlist, Context context) {
        this.mlist = mlist;
        this.context = context;
    }

    @Override
    public int getCount() {
        return mlist.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, final int position) {
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.pagervieweritem, null);
        ImageView imageView = view.findViewById(R.id.imageView);
        imageView.setImageResource(mlist.get(position).getImg());
        TextView title =  view.findViewById(R.id.title);
        title.setText(mlist.get(position).getTitle());
        TextView desc =  view.findViewById(R.id.desc);
        desc.setText(mlist.get(position).getDesc());
        ViewPager vp = (ViewPager) container;
        vp.addView(view, 0);
        return view;
    }
    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {

        ViewPager vp = (ViewPager) container;
        View view = (View) object;
        vp.removeView(view);

    }
}

