package com.programmergaptek.gorontalo;

import android.graphics.Color;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;
import android.widget.ViewFlipper;

import org.w3c.dom.Text;

public class Kebudayaan extends AppCompatActivity {

    private FloatingActionButton next;
    ViewFlipper vf1, vf2;
    TextView txt1;
    WebView web1, web2, web3, web4, web5;
    FloatingActionButton fabNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kebudayaan_layout);

        final Toolbar toolbar = (Toolbar) findViewById(R.id.MyToolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        CollapsingToolbarLayout collapsingToolbar = (CollapsingToolbarLayout) findViewById(R.id.collapse_toolbar);
        collapsingToolbar.setTitle("Kebudayaan");
        collapsingToolbar.setCollapsedTitleTextColor(getResources().getColor(R.color.white));
        collapsingToolbar.setExpandedTitleColor(getResources().getColor(R.color.white));
        collapsingToolbar.setContentScrimColor(getResources().getColor(R.color.colorPrimary));
        collapsingToolbar.setExpandedTitleTextAppearance(R.style.expandedappbar);
        collapsingToolbar.setCollapsedTitleTextAppearance(R.style.collapsedappbar);

        vf1 = (ViewFlipper) findViewById(R.id.vfHead);
        vf2 = (ViewFlipper) findViewById(R.id.vfBody);
        web1 = (WebView) findViewById(R.id.web1);
        web2 = (WebView) findViewById(R.id.web2);
        web3 = (WebView) findViewById(R.id.web3);
        web4 = (WebView) findViewById(R.id.web4);
        web5 = (WebView) findViewById(R.id.web5);
        fabNext = (FloatingActionButton) findViewById(R.id.fabNext);
        txt1 = (TextView) findViewById(R.id.txtBudaya1);

        txt1.setShadowLayer(10, 0, 0, Color.BLACK);

        fabNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vf1.showNext();
                vf2.showNext();
            }
        });

        web1.loadUrl("file:///android_asset/html/kebudayaan/rumah_adat.html");
        web2.loadUrl("file:///android_asset/html/kebudayaan/pakaian_adat.html");
        web3.loadUrl("file:///android_asset/html/kebudayaan/tarian_tradisional.html");
        web4.loadUrl("file:///android_asset/html/kebudayaan/senjata_tradisional.html");
        web5.loadUrl("file:///android_asset/html/kebudayaan/alat_musik.html");

    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_item, menu);
        return true;

    }
}
