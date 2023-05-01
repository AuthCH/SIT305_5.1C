package com.example.newsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    Context mContext;
    ArrayList<MyDataModel> newslist;

    public MyAdapter(Context mContext, ArrayList<MyDataModel> newslist) {
        this.mContext = mContext;
        this.newslist = newslist;
    }

    @NonNull
    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.recyclerview_layout,parent,false);
        return new MyViewHolder(view);
        //return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.mTextview.setText(newslist.get(position).getNews());
        holder.desctext.setText(newslist.get(position).getDesc());
        holder.imageView.setImageResource(newslist.get(position).getImage());
    }

    @Override
    public int getItemCount() {

        return newslist.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView mTextview, desctext;
        ImageView imageView;
        public MyViewHolder(@NonNull View itemView) {

            super(itemView);
            mTextview = itemView.findViewById(R.id.newstextView);
            desctext = itemView.findViewById(R.id.desc);
            imageView = itemView.findViewById(R.id.pic1);
        }
    }
}
