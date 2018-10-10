package com.example.android.firsttask;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Catagerious extends AppCompatActivity {
    ArrayList<ModelCatagerious> mlist=new ArrayList<>();
    RecyclerView rec ;

    RecyclerView.LayoutManager layoutManager ;
    RecyclerView.Adapter adapter ;
    AdapterCatagerious adp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catagerious);
        mlist.add(new ModelCatagerious("STRUCTURE ITS",R.drawable.i11));
        mlist.add(new ModelCatagerious("ACTIVITES",R.drawable.i10));
        mlist.add(new ModelCatagerious("ELECTRICITY",R.drawable.i9));
        mlist.add(new ModelCatagerious("NATURAL GAS AND ENERGY SERVICE",R.drawable.i4));
        mlist.add(new ModelCatagerious("INNOVATION AND ENERGY",R.drawable.i5));
        mlist.add(new ModelCatagerious("OIL AND GAS",R.drawable.i6));
        mlist.add(new ModelCatagerious("CLEAN ENERGY",R.drawable.i7));
        mlist.add(new ModelCatagerious("SOLAR POWER",R.drawable.i8));
        mlist.add(new ModelCatagerious("RENEWABLE ENERGY",R.drawable.i9));
        mlist.add(new ModelCatagerious("WIND ENERGY",R.drawable.i10));
        mlist.add(new ModelCatagerious("WASTED ENERGY",R.drawable.i11));
        rec =findViewById(R.id.recycle_view);
        layoutManager = new LinearLayoutManager(this);
        rec.setLayoutManager(layoutManager);
        adp=new AdapterCatagerious(mlist,this);
        rec.setAdapter(adp);
    }
}
