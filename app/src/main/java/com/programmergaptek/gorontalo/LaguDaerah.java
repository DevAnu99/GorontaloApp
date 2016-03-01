package com.programmergaptek.gorontalo;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Build;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LaguDaerah extends AppCompatActivity implements Recycler_View_Adapter.onCardDiklikListener {

    MediaPlayer mp3;
    final Context context = this;
    ImageView iPlay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lagu_daerah_layout);

        final Toolbar toolbar = (Toolbar) findViewById(R.id.MyToolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        TextView lagu = (TextView) findViewById(R.id.txtLagu);

        lagu.setShadowLayer(10, 0, 0, Color.BLACK);

        CollapsingToolbarLayout collapsingToolbar = (CollapsingToolbarLayout) findViewById(R.id.collapse_toolbar);
        collapsingToolbar.setTitle("Lagu Daerah");
        collapsingToolbar.setCollapsedTitleTextColor(getResources().getColor(R.color.white));
        collapsingToolbar.setExpandedTitleColor(getResources().getColor(R.color.white));
        collapsingToolbar.setContentScrimColor(getResources().getColor(R.color.colorPrimary));
        collapsingToolbar.setExpandedTitleTextAppearance(R.style.expandedappbar);
        collapsingToolbar.setCollapsedTitleTextAppearance(R.style.collapsedappbar);

        List<Data> data = data_lagu();

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        Recycler_View_Adapter adapter = new Recycler_View_Adapter(data, getApplication());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter.setonCardDiklikListener(this);
    }

    public List<Data> data_lagu() {

        List<Data> data = new ArrayList<>();

        data.add(new Data("Hulondalo Lipu'u", "Rama Aiphama", R.drawable.play, R.drawable.play));
        data.add(new Data("Binthe Biluhuta", "Eddi Silitonga", R.drawable.play, R.drawable.play));
        data.add(new Data("Ati Olo Ati Mama", "-", R.drawable.play, R.drawable.play));
        data.add(new Data("Dana Dana", "Rama Aiphama", R.drawable.play, R.drawable.play));
        data.add(new Data("Tahuli li Mama", "Dr Anwar Pasaribu", R.drawable.play, R.drawable.play));
        data.add(new Data("Posabari", "Benny Panjaitan", R.drawable.play, R.drawable.play));
        data.add(new Data("Tilola Malo Wolo Wololo", "Rama Aiphama", R.drawable.play, R.drawable.play));
        data.add(new Data("To Rabua", "Halim Rasyid", R.drawable.play, R.drawable.play));
        return data;
    }


    @Override
    public void onCardDiKlik(final int position) {
            AlertDialog.Builder lirik = new AlertDialog.Builder(context);
            if (position==0) {
                mp3 = MediaPlayer.create(LaguDaerah.this, R.raw.hulondalo);
                lirik.setView(R.layout.lirik2);
            } else if (position==1){
                mp3 = MediaPlayer.create(LaguDaerah.this, R.raw.binthe);
                lirik.setView(R.layout.lirik5);
            } else  if (position==2) {
                mp3 = MediaPlayer.create(LaguDaerah.this, R.raw.ati_mam);
                lirik.setView(R.layout.lirik4);
            } else if (position==3) {
                mp3 = MediaPlayer.create(LaguDaerah.this, R.raw.dana);
                lirik.setView(R.layout.lirik1);
            } else if (position==4) {
                mp3 = MediaPlayer.create(LaguDaerah.this, R.raw.tahuli);
                lirik.setView(R.layout.lirik8);
            } else if (position==6) {
                mp3 = MediaPlayer.create(LaguDaerah.this, R.raw.tilola_malo);
                lirik.setView(R.layout.lirik6);
            } else if (position==7) {
                mp3 = MediaPlayer.create(LaguDaerah.this, R.raw.to_rabua);
                lirik.setView(R.layout.lirik7);
            }
            lirik.setCancelable(false)
                    .setTitle(data_lagu().get(position).judul)
                    .setIcon(R.mipmap.ic_launcher)
                    .setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    mp3.stop();
                                    try {
                                        mp3.prepare();
                                    } catch (IllegalStateException e) {
                                        // TODO Auto-generated catch block
                                        e.printStackTrace();
                                    } catch (IOException e) {
                                        // TODO Auto-generated catch block
                                        e.printStackTrace();
                                    }
                                    mp3.seekTo(0);
                                    String message = data_lagu().get(position).judul + " Berhenti";
                                    Toast.makeText(getApplicationContext(), message , Toast.LENGTH_SHORT).show();
                                }
                            }
                    );
            AlertDialog alertDialog = lirik.create();
            alertDialog.show();
            mp3.start();
        }
        @Override
    public void OnStop() {

    }

}

