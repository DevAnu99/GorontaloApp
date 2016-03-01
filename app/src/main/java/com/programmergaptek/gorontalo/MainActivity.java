package com.programmergaptek.gorontalo;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnSejarah, btnKebudayaan, btnVisi, btnGeografis, btnLagu, btnPariwisata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Toolbar toolbar = (Toolbar) findViewById(R.id.MyToolbar);
        setSupportActionBar(toolbar);

        TextView gtlo = (TextView) findViewById(R.id.txtGorontalo);
        TextView smbyn = (TextView) findViewById(R.id.txtSemboyan);
        gtlo.setShadowLayer(10, 0, 0, Color.BLACK);
        smbyn.setShadowLayer(10, 0, 0, Color.BLACK);


        CollapsingToolbarLayout collapsingToolbar = (CollapsingToolbarLayout) findViewById(R.id.collapse_toolbar);
        collapsingToolbar.setTitle("Provinsi Gorontalo");
        collapsingToolbar.setCollapsedTitleTextColor(getResources().getColor(R.color.white));
        collapsingToolbar.setExpandedTitleColor(getResources().getColor(R.color.white));
        collapsingToolbar.setContentScrimColor(getResources().getColor(R.color.colorPrimary));
        collapsingToolbar.setExpandedTitleTextAppearance(R.style.expandedappbar);
        collapsingToolbar.setCollapsedTitleTextAppearance(R.style.collapsedappbar);

        btnSejarah = (Button) findViewById(R.id.btnSejarah);
        btnKebudayaan = (Button) findViewById(R.id.btnKebudayaan);
        btnVisi = (Button) findViewById(R.id.btnVisi);
        btnGeografis = (Button) findViewById(R.id.btnGeografis);
        btnLagu= (Button) findViewById(R.id.btnLagu);
        btnPariwisata= (Button) findViewById(R.id.btnPariwisata);

        btnSejarah.setOnClickListener(this);
        btnKebudayaan.setOnClickListener(this);
        btnVisi.setOnClickListener(this);
        btnLagu.setOnClickListener(this);
        btnPariwisata.setOnClickListener(this);

    }

    @Override
    public void onClick (View v) {
        switch (v.getId()) {
            case R.id.btnSejarah:
                Intent isejarah = new Intent(MainActivity.this,
                        Sejarah.class);
                startActivity(isejarah);
                overridePendingTransition(R.anim.in_right,R.anim.out_left);
            break;
            case R.id.btnKebudayaan:
                Intent ikebudayaan = new Intent(MainActivity.this,
                        Kebudayaan.class);
                startActivity(ikebudayaan);
                overridePendingTransition(R.anim.in_right,R.anim.out_left);
            break;
            case R.id.btnVisi:
                Intent ivisi = new Intent(MainActivity.this,
                        VisiMisi.class);
                startActivity(ivisi);
                overridePendingTransition(R.anim.in_right,R.anim.out_left);
            break;
            case R.id.btnGeografis:
                Intent igeo = new Intent(MainActivity.this,
                        GeografisIklim.class);
                startActivity(igeo);
                overridePendingTransition(R.anim.in_right,R.anim.out_left);
            break;
            case R.id.btnLagu:
                Intent ilagu = new Intent(MainActivity.this,
                        LaguDaerah.class);
                startActivity(ilagu);
                overridePendingTransition(R.anim.in_right,R.anim.out_left);
                break;
            case R.id.btnPariwisata:
                Intent ipari = new Intent(MainActivity.this,
                        Pariwisata.class);
                startActivity(ipari);
                overridePendingTransition(R.anim.in_right,R.anim.out_left);
            break;
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_item, menu);
        return true;

    }

}
