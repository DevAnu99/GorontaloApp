package com.programmergaptek.gorontalo;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class View_Holder extends RecyclerView.ViewHolder{

    CardView cv;
    TextView judul;
    TextView penyanyi;
    ImageView iconview;
    ImageView iconPlay;

    View_Holder(View itemView) {
        super(itemView);
        cv = (CardView) itemView.findViewById(R.id.cardView);
        judul = (TextView) itemView.findViewById(R.id.txtJudul);
        penyanyi = (TextView) itemView.findViewById(R.id.txtPenyanyi);
        iconview = (ImageView) itemView.findViewById(R.id.imgPlay);
        iconPlay = (ImageView) itemView.findViewById(R.id.iPlay);
    }
}
