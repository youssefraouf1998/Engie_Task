package com.example.android.firsttask;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AdapterSearch extends RecyclerView.Adapter<AdapterSearch.ViewHolder> {
    ArrayList<ModelSearch>mList=new ArrayList<>();
    Context mcontext;
    public AdapterSearch(ArrayList<ModelSearch>moduleArrayList ,Context context) {
        this.mList=moduleArrayList;
        this.mcontext=context;
    }
    class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public int currentItem ;
        public ImageView itemImage ;
        public TextView itemTitle,itemdesc; ;
        public ViewHolder (View itemView ){
            super(itemView);
            itemImage = itemView.findViewById(R.id.image_item);
            itemTitle = itemView.findViewById(R.id.title_item);
            itemdesc=itemView.findViewById(R.id.des_item);
            itemView.setOnClickListener(this);
        }
        @Override
        public void onClick(View view) {
            Snackbar.make(view , "Selected" , Snackbar.LENGTH_LONG).setAction("Action", null).show();
        }
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_layout , parent , false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.itemTitle.setText(mList.get(position).getTitle());
        holder.itemdesc.setText(mList.get(position).getDesc());
        holder.itemImage.setImageResource(mList.get(position).getImg());
    }
    @Override
    public int getItemCount() {
        return mList.size();
    }
}
