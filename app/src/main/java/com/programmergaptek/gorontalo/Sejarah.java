package com.programmergaptek.gorontalo;

import android.graphics.Color;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.widget.TextView;

public class Sejarah extends AppCompatActivity {
    TextView pg1, pg2, pg3, pg4, pg5, pg6, L1, pg7, L2, pg8, pg9, L3, pg10, L4, pg11, L5, pg12, pg13, pg14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_sejarah);

        final Toolbar toolbar = (Toolbar) findViewById(R.id.MyToolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        TextView sjrh = (TextView) findViewById(R.id.txtSejarah);

        pg1 = (TextView) findViewById(R.id.txtPag1);
        pg2 = (TextView) findViewById(R.id.txtPag2);
        pg3 = (TextView) findViewById(R.id.txtPag3);
        pg4 = (TextView) findViewById(R.id.txtPag4);
        pg5 = (TextView) findViewById(R.id.txtPag5);
        pg6 = (TextView) findViewById(R.id.txtPag6);
        pg7 = (TextView) findViewById(R.id.txtPag7);
        pg8 = (TextView) findViewById(R.id.txtPag8);
        pg9 = (TextView) findViewById(R.id.txtPag9);
        pg10 = (TextView) findViewById(R.id.txtPag10);
        pg11 = (TextView) findViewById(R.id.txtPag11);
        pg12 = (TextView) findViewById(R.id.txtPag12);
        pg13 = (TextView) findViewById(R.id.txtPag13);
        pg14 = (TextView) findViewById(R.id.txtPag14);
        L1 = (TextView) findViewById(R.id.txtL1);
        L2 = (TextView) findViewById(R.id.txtL2);
        L3 = (TextView) findViewById(R.id.txtL3);
        L4 = (TextView) findViewById(R.id.txtL4);
        L5 = (TextView) findViewById(R.id.txtL5);

        sjrh.setShadowLayer(10, 0, 0, Color.BLACK);

        pg1.setText("       Menurut catatan sejarah, Jazirah Semenanjung Gorontalo (Gorontalo Peninsula) terbentuk kurang lebih 1300 tahun lalu, di mana Kerajaan Suwawa telah ditemukan berdiri pada sekitar tahun 700 Masehi atau pada abad ke-8 Masehi.Hal ini diperkuat dengan ditemukannya makam para Raja di tepian hulu sungai Bulawa. Tidak hanya itu,  makam Raja Suwawa lainnya dapat kita temukan di hulu sungai Bone, yaitu makam Raja Moluadu (salah seorang Raja di Kerajaan Suwawa) bersama dengan makam istrinya dan anaknya ");
        pg2.setText("       Namun, sebagai salah satu jazirah tertua di Sulawesi dan Nusantara, Semenanjung Gorontalo pun tidak hanya memiliki catatan sejarah pada prasasti makam-makam Rajanya dahulu,melainkan pula memiliki situs prasejarah yang telah ditemukan. Situs Oluhuta,merupakan sebuah situs prasejarah dan memiliki makam prasejarah di dalamnya.hal ini dapat menjadi bukti bahwa Gorontalo telah memiliki peradaban yang sangat lampau");
        pg3.setText("       Sementara itu, Kota Gorontalo merupakan salah satu kota tua di Pulau Sulawesi selain Kota Makassar, Parepare dan Manado. Diperkirakan, Kota Gorontalo sudah terbentuk sejak kurang lebih 400 tahun yang lalu atau sekitar tahun 1500-an pada abad ke-16. Kota Gorontalo pada saat itu menjadi salah satu pusat penyebaran agama Islam di Kawasan Timur Indonesia, selain Ternate (sekarang bagian dari Provinsi Maluku Utara) dan Bone (sekarang bagian dari Provinsi Sulawesi Selatan)");
        pg4.setText("       Seiring dengan penyebaran agama tersebut, Kota Gorontalo akhirnya menjadi pusat pendidikan dan perdagangan masyarakat di wilayah \"Tomini-Bocht\" seperti Bolaang Mongondow (Sulawesi utara), Buol Toli-Toli, Luwuk Banggai, Donggala (Sulteng) bahkan sampai ke Sulawesi Tenggara. Hal ini dikarenakan, Kota Gorontalo memiliki letak yang sangat strategis, posisinya menghadap langsung ke Teluk Tomini (bagian selatan) dan Laut Sulawesi (bagian utara).");
        pg5.setText("       Kerajaan Gorontalo mulanya berada di Kelurahan Hulawa Kecamatan Telaga sekarang, tepatnya di pinggiran sungai Bolango. Menurut Penelitian, pada tahun 1024 H, kota Kerajaan ini dipindahkan dari Keluruhan Hulawa ke Dungingi Kelurahan Tuladenggi Kecamatan Kota Barat sekarang. Kemudian dimasa Pemerintahan Sultan Botutihe kota Kerajaan ini dipindahkan dari Dungingi di pinggiran sungai Bolango, ke satu lokasi yang terletak antara dua kelurahan yaitu Kelurahan Biawao dan Kelurahan Limba B. Dengan letaknya yang stategis yang menjadi pusat pendidikan dan perdagangan serta penyebaran agama islam maka pengaruh Gorontalo sangat besar pada wilayah sekitar, bahkan menjadi pusat pemerintahan yang disebut dengan Kepala Daerah Sulawesi Utara Afdeling Gorontalo yang meliputi Gorontalo dan wilayah sekitarnya seperti Buol ToliToli dan, Donggala dan Bolaang Mongondow.");
        pg6.setText("       Sebelum masa penjajahan keadaaan daerah Gorontalo berbentuk kerajaan-kerajaan yang diatur menurut hukum adat ketatanegaraan Gorontalo. Kerajaan-kerajaan itu tergabung dalam satu ikatan kekeluargaan yang disebut \"Pohala'a\". Menurut Haga (1931) daerah Gorontalo ada lima pohala'a");
        pg7.setText("       Berdasarkan klasifikasi adat yang dibuat oleh Mr.C.Vollenhoven, maka Semenanjung Gorontalo termasuk kedalam 19 wilayah adat di Indonesia. Antara agama dengan adat di Gorontalo pun menyatu dengan istilah \"Adat bersendikan Syara' dan Syara' bersendikan Kitabullah\". Pohalaa Gorontalo merupakan pohalaa yang paling menonjol di antara kelima pohalaa tersebut. Itulah sebabnya Gorontalo lebih banyak dikenal. Asal usul nama Gorontalo terdapat berbagai pendapat dan penjelasan antara lain :");
        pg8.setText("       Jadi asal usul nama Gorontalo (arti katanya) tidak diketahui lagi,namun jelas kata Hulontalo hingga sekarang masih hidup dalam ucapan orang Gorontalo dan orang Belanda karena kesulitan dalam mengucapkannya diucapkan dengan Horontalo dan bila ditulis menjadi Gorontalo");
        pg9.setText("       Pada tahun 1824 daerah Limo Lo Pohalaa telah berada di bawah kekusaan seorang asisten Residen disamping Pemerintahan tradisonal. Pada tahun 1889 sistem pemerintahan kerajaan dialihkan ke pemerintahan langsung yang dikenal dengan istilah Rechtatreeks Bestur. Pada tahun 1911 terjadi lagi perubahan dalam struktur pemerintahan Daerah Limo Lo Pohalaa dibagi atas tiga Onder Afdeling yaitu :");
        pg10.setText("       Selanjutnya pada tahun 1920 berubah lagi menjadi lima distrik yaitu :");
        pg11.setText("       Pada tahun 1922 Gorontalo ditetapkan menjadi tiga Afdeling yaitu :");
        pg12.setText("        Sebelum kemerdekaan Republik Indonesia, rakyat Gorontalo dipelopori oleh Bpk H. Nani Wartabone berjuang dan merdeka pada tanggal 23 Januari 1942. Selama kurang lebih dua tahun yaitu sampai tahun 1944 wilayah Gorontalo berdaulat dengan pemerintahan sendiri. Perjuangan patriotik ini menjadi tonggak kemerdekaan bangsa Indonesia dan memberi imbas dan inspirasi bagi wilayah sekitar bahkan secara nasional. Oleh karena itu Bpk H. Nani Wartabone dikukuhkan oleh Pemerintah RI sebagai pahlawan perintis kemerdekaan.");
        pg13.setText("        Pada dasarnya masyarakat Gorontalo mempunyai jiwa nasionalisme yang tinggi. Indikatornya dapat dibuktikan yaitu pada saat Hari Kemerdekaan Gorontalo yaitu 23 Januari 1942 dikibarkan bendera merah putih dan dinyanyikan lagu Indonesia Raya. Padahal saat itu Negara Indonesia sendiri masih merupakan mimpi kaum nasionalis tetapi rakyat Gorontalo telah menyatakan kemerdekaan dan menjadi bagian dari Indonesia.");
        pg14.setText("        Selain itu pada saat pergolakan PRRI Permesta di Sulawesi Utara masyarakat wilayah Gorontalo dan sekitarnya berjuang untuk tetap menyatu dengan Negara Republik Indonesia dengan semboyan Sekali 'ke Djogdja tetap ke Djogdja' sebagaimana pernah didengungkan pertama kali oleh Ayuba Wartabone di Parlemen Indonesia Timur ketika Gorontalo menjadi bagian dari Negara Indonesia Timur.");
        L1.setText("          * Pohala'a Gorontalo \n\n          * Pohala'a Limboto \n\n          * Pohala'a Suwawa \n\n          * Pohala'a Boalemo \n\n          * Pohala'a Atinggola");
        L2.setText("          * Berasal dari Hulontalangio, nama salah satu kerajaan yang dipersingkat menjadi Hulontalo \n\n          * Berasal dari Hua Lolontalango yang artinya orang-orang goa yang berjalan lalu lalang. \n\n          * Berasal dari Hulontalangi yang artinya lebih mulia. \n\n          * Berasal dari Hulua Lo Tola yang artinya tempat berkembangnya ikan Gabus. \n\n          * Berasal dari Pongolatalo atau Puhulatalo yang artinya tempat menunggu. \n\n          * Berasal dari Gunung Telu yang artinya tiga buah gunung.\n\n          * Berasal dari Hunto suatu tempat yang senantiasa digenangi air");
        L3.setText("          * Onder Afdeling Kwandang \n\n          * Onder Afdeling Boalemo \n\n          * Onder Afdeling Gorontalo");
        L4.setText("          * Distrik Kwandang \n\n          * Distrik Limboto \n\n          * Distrik Bone \n\n          * istrik Gorontalo \n\n          * Distrik Boalemo");
        L5.setText("          * Afdeling Gorontalo \n\n          * Afdeling Boalemo \n\n          * Afdeling Buol");

        CollapsingToolbarLayout collapsingToolbar = (CollapsingToolbarLayout) findViewById(R.id.collapse_toolbar);
        collapsingToolbar.setTitle("Sejarah Gorontalo");
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

    @Override
    protected void onPause()
    {
        super.onPause();
        //closing transition animations
    }
}
