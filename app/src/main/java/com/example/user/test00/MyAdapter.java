package com.example.user.test00;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;


public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private Context context;
    private int pic [] = {R.drawable.b0,R.drawable.b1,R.drawable.b2};

    public MyAdapter(Context context, int pic[]) {
        this.context = context;
        this.pic = pic;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        MyViewHolder holder = new MyViewHolder(LayoutInflater.from(
                context).inflate(R.layout.item_contact, parent,
                false));
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.img.setImageResource(pic[position]);
    }

    @Override
    public int getItemCount() {
        return pic.length;
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView img;

        public MyViewHolder(View view) {
            super(view);
            img = (ImageView) view.findViewById(R.id.id_num);
        }
    }
}
