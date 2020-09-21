package com.example.invisible.learnc;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class youtubeadapter extends RecyclerView.Adapter<youtubeviewholder> {

    ArrayList<dataset> arrayList;
    Context context;

    public youtubeadapter(ArrayList<dataset> arrayList,Context context) {
        this.arrayList = arrayList;
        this.context=context;
    }

    @NonNull
    @Override
    public youtubeviewholder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(context).inflate(R.layout.video_per_row,viewGroup,false);
        return new youtubeviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull youtubeviewholder youtubeviewholder, int i) {

        final dataset current=arrayList.get(i);
        youtubeviewholder.webView.loadUrl(current.getLink());
        youtubeviewholder.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(context,videofullscreen.class);
                i.putExtra("link",current.getLink());
                context.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}
