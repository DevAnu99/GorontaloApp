package com.programmergaptek.gorontalo;

import android.content.ClipData;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Build;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Pariwisata extends AppCompatActivity implements AdapterView.OnItemClickListener {

    GridView gridview;
    GridViewAdapter gridviewAdapter;
    ArrayList<Item> data = new ArrayList<Item>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pariwisata_layout);

        initView(); // Initialize the GUI Components
        fillData(); // Insert The Data
        setDataAdapter(); // Set the Data Adapter

        final Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar1);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("Pariwisata Gorontalo");


    }

    private void initView()
    {
        gridview = (GridView) findViewById(R.id.gridView);
        gridview.setOnItemClickListener(this);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            gridview.setNestedScrollingEnabled(true);
        }
    }

    private void fillData()
    {
        data.add(new Item("Pantai Bolihutuo", getResources().getDrawable(R.drawable.pariwisata_main)));
        data.add(new Item("Pulau Saronde", getResources().getDrawable(R.drawable.pariwisata_main)));
        data.add(new Item("Kolam Pancing", getResources().getDrawable(R.drawable.pariwisata_main)));
        data.add(new Item("Benteng Otanaha", getResources().getDrawable(R.drawable.pariwisata_main)));
        data.add(new Item("Taman Laut Olele", getResources().getDrawable(R.drawable.pariwisata_main)));
        data.add(new Item("Danau Limboto", getResources().getDrawable(R.drawable.pariwisata_main)));
        data.add(new Item("Pentadio Resort", getResources().getDrawable(R.drawable.pariwisata_main)));
        data.add(new Item("Air Terjun Ayuhulalo", getResources().getDrawable(R.drawable.pariwisata_main)));
        data.add(new Item("Taman Nasional Nani Wartabone", getResources().getDrawable(R.drawable.pariwisata_main)));
    }

    private void setDataAdapter()
    {
        gridviewAdapter = new GridViewAdapter(getApplicationContext(), R.layout.row_pariwisata, data);
        gridview.setAdapter(gridviewAdapter);
    }

    @Override
    public void onItemClick(final AdapterView<?> arg0,final View view,final int position,final long id) {
        String message = "Clicked : " + data.get(position).getTitle();
        Toast.makeText(getApplicationContext(), message , Toast.LENGTH_SHORT).show();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_item, menu);
        return true;

    }
}
