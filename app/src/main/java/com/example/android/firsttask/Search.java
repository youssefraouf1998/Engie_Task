package com.example.android.firsttask;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Search extends AppCompatActivity {
    ArrayList<ModelSearch> mlist=new ArrayList<>();
    RecyclerView rec ;

    RecyclerView.LayoutManager layoutManager ;
    RecyclerView.Adapter adapter ;
    AdapterSearch adp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        mlist=new ArrayList<>();
        mlist.add(new ModelSearch("ENERGY EFFICIENCY",getResources().getString(R.string.search),R.drawable.zzz));
        mlist.add(new ModelSearch("ENERGY EFFICIENCY",getResources().getString(R.string.search),R.drawable.zzz));
        mlist.add(new ModelSearch("ENERGY EFFICIENCY",getResources().getString(R.string.search),R.drawable.zzz));
        rec =findViewById(R.id.recycle_view);
        layoutManager = new LinearLayoutManager(this);
        rec.setLayoutManager(layoutManager);
        adp=new AdapterSearch(mlist,this);
        rec.setAdapter(adp);
    }
}
