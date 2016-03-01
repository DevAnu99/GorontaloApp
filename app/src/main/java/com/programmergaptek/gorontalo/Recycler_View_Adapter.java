package com.programmergaptek.gorontalo;


import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Collections;
import java.util.List;

public class Recycler_View_Adapter extends RecyclerView.Adapter<View_Holder>{

    List<Data> list = Collections.emptyList();
    Context context;
    View card;
    onCardDiklikListener listener;

    public Recycler_View_Adapter(List<Data> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public View_Holder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_lagu, parent, false);
        final View_Holder holder = new View_Holder(v);
        return holder;
    }


    @Override
    public void onBindViewHolder(View_Holder holder,final int position){

        //Use the provided View Holder on the onCreateViewHolder method to populate the current row on the RecyclerView
        holder.judul.setText(list.get(position).judul);
        holder.penyanyi.setText(list.get(position).penyanyi);
        holder.iconview.setImageResource(list.get(position).icon);
        holder.cv.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (listener != null) listener.onCardDiKlik(position);
            }
        });
        //animate(holder);
    }

    @Override
    public int getItemCount() {
        //returns the number of elements the RecyclerView will display
        return list.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    // Insert a new item to the RecyclerView on a predefined position
    public void insert(int position, Data data) {
        list.add(position, data);
        notifyItemInserted(position);
    }

    // Remove a RecyclerView item containing a specified Data object
    public void remove(Data data) {
        int position = list.indexOf(data);
        list.remove(position);
        notifyItemRemoved(position);
    }

    public static interface onCardDiklikListener {
        void onCardDiKlik(int position);

        void OnStop();
    }

    public void setonCardDiklikListener(onCardDiklikListener listener) {
        this.listener = listener;
    }
}
