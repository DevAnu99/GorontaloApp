package com.programmergaptek.gorontalo;

import android.graphics.Color;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.widget.TextView;

public class VisiMisi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.visi_misi_layout);

        final Toolbar toolbar = (Toolbar) findViewById(R.id.MyToolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        TextView visi = (TextView) findViewById(R.id.txtVisi);
        TextView misi = (TextView) findViewById(R.id.Txtmisi);

        visi.setShadowLayer(10, 0, 0, Color.BLACK);

        misi.setText("01 .Untuk pencapaian visi pembangunan tersebut ditetapkan Misi Pembangunan Gorontalo 2012-2016 yaitu:\n\n" +
                "02. Memfokuskan peningkatan ekonomi atas dasar optimalisasi potensi kewilayahan, mendorong laju investasi, percepatan pembangunan infrastruktur pedesaan, sekaligus mengembangkan potensi unggulan dengan mengakselerasi secara cerdas terhadap pencapaian kesejahteraan rakyat.\n\n" +
                "03. Meningkatkan kualitas Sumber Daya Manusia melalui pendekatan kesesuaian keahlian serta pemenuhan mutu kualitas penyelenggaraan Pendidikan dan Kesehatan.\n\n" +
                "04. Mengembangkan manajemen pengelolaan potensi sumber daya Kelautan, Pertanian, Peternakan, kehutanan, Danau Limboto dan potensi lingkungan lainnya yang lebih baik, saling terintegrasi serta lestari demi kepentingan kemakmuran masyarakat.\n\n" +
                "05. Mengembangkan nilai-nilai religi, dalam kehidupan beragama yang rukun penuh kesejukan sekaligus memelihara keragaman budaya serta memperkuat peran Pemberdayaan Perempuan, Perlindungan terhadap anak, termasuk issue kesetaraan Gender dalam Pembangunan.\n\n" +
                "06. Menciptakan sinergitas diantara Pemerintah Provinsi dengan Pemerintah Kabupaten/Kota di Gorontalo dalam kaidah otonomi daerah sekaligus untuk meningkatkan kinerja pelayanan publik, menurunkan angka kemiskinan serta menjalankan sistem tata pemerintahan yang baik dalam rangka reformasi birokrasi.");

        CollapsingToolbarLayout collapsingToolbar = (CollapsingToolbarLayout) findViewById(R.id.collapse_toolbar);
        collapsingToolbar.setTitle("Visi & Misi");
        collapsingToolbar.setCollapsedTitleTextColor(getResources().getColor(R.color.white));
        collapsingToolbar.setExpandedTitleColor(getResources().getColor(R.color.white));
        collapsingToolbar.setContentScrimColor(getResources().getColor(R.color.colorPrimary));
        collapsingToolbar.setExpandedTitleTextAppearance(R.style.expandedappbar);
        collapsingToolbar.setCollapsedTitleTextAppearance(R.style.collapsedappbar);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_item, menu);
        return true;

    }
}
