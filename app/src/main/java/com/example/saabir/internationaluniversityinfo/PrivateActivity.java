package com.example.saabir.internationaluniversityinfo;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class PrivateActivity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_private);

        listView = (ListView) findViewById(R.id.lstPrivate);

        final String[] names = {"Ahsanullah University of Science and Technology", "American International University", "ASA University Bangladesh", "Asian University of Bangladesh", "University of Asia Pacific",
                "Bangladesh Islami University", "BRAC University", "Canadian University of Bangladesh", "Chittagong Independent University", "City University", "Daffodil International University",
                "Dhaka International University", "East West University", "Eastern University", "European University of Bangladesh", "Fareast International University", "German University Bangladesh", "Global University Bangladesh",
                "Gono University", "Green University of Bangladesh", "Hamdard University Bangladesh ", "Bangladesh University of Health Sciences", "Independent University, Bangladesh",
                "The Millennium University", "Northern University Bangladesh", "North South University", "North Western University", "Notre Dame University Bangladesh", "The People's University of Bangladesh",
                "Presidency University", "Prime University", "Royal University", "Shanto-Mariam University of Creative Technology", "Sonargaon University", "University of South Asia ", "Southern University Bangladesh",
                "Southeast University", "Stamford University Bangladesh", "State University of Bangladesh", "United International University", "Uttara University", "Victoria University of Bangladesh",
                "World University of Bangladesh"};

        int[] images = {R.drawable.ahsanullahuniversity, R.drawable.aiub, R.drawable.asauniversity, R.drawable.asianuniversitybd, R.drawable.asiapacificbd,
                R.drawable.bangladeshislamibd, R.drawable.bracbd, R.drawable.canadianbd, R.drawable.chittagongindependentbd, R.drawable.cityuniversitybd, R.drawable.daffodiluniversitybd, R.drawable.dhakainternationalunibd, R.drawable.eastwestuniversitybd,
                R.drawable.esternuniversitybd, R.drawable.europeanuniverbd, R.drawable.fearestuniversitybd, R.drawable.germanuniverbd, R.drawable.globaluniverbd, R.drawable.gonoversitybd,
                R.drawable.greenuniverbd, R.drawable.hamdarduniverbd, R.drawable.healthsciencebd, R.drawable.independentuniverbd, R.drawable.milaniumuniverbd, R.drawable.northernuniverbd,
                R.drawable.northsouthuniverbd, R.drawable.northwesternuniversity, R.drawable.notredamuniverbd, R.drawable.peoplesuniverbd, R.drawable.presedencyuniverbd, R.drawable.primeuniverbd,
                R.drawable.royaluniverbd, R.drawable.santamoruiumunibd, R.drawable.sonargoanuniverbd, R.drawable.southasiauniverbd, R.drawable.southernchittabd, R.drawable.southestuniverbd,
                R.drawable.stamfordunibd, R.drawable.stateuniverbd, R.drawable.uniteduniverbd, R.drawable.uttarauniverbd, R.drawable.victoriauniverbd, R.drawable.worlduniverbd};

        final String[] links = {"http://www.aust.edu/", "http://www.aiub.edu/", "http://www.asaub.edu.bd/", "http://www.aub.edu.bd/", "http://www.uap-bd.edu/",
                "http://biu.ac.bd/", "http://www.bracu.ac.bd/", "http://cub.edu.bd/", "http://www.ciu.edu.bd/", "http://www.cityuniversity.edu.bd/", "https://daffodilvarsity.edu.bd/",
                "http://www.diu.ac/", "http://www.ewubd.edu/", "http://www.easternuni.edu.bd/", "http://www.eub.edu.bd/", "http://www.fiu.edu.bd/", "http://www.gub.edu.bd/", "http://www.globaluniversity.edu.bd/",
                "www.gonouniversity.edu.bd/", "www.green.edu.bd/", "http://hamdarduniversity.edu.bd/", "http://www.buhs.ac.bd/", "http://www.iub.edu.bd/",
                "http://themillenniumuniversity.edu.bd/", "http://www.nub.ac.bd/", "http://www.northsouth.edu/", "http://www.northwestern.edu/", "http://www.ndub.edu.bd/",
                "http://www.pub.ac.bd/", "http://www.presidency.edu.bd/", "www.primeuniversity.edu.bd/", "http://www.royal.edu.bd/", "www.smuct.edu.bd/",
                "www.su.edu.bd/", "http://www.southasia-uni.org/", "www.southern.edu.bd/", "www.seu.ac.bd/", "www.stamforduniversity.edu.bd/",
                "www.sub.edu.bd/", "www.uiu.ac.bd/", "www.uttarauniversity.edu.bd/", "http://www.vub.edu.bd/", "http://www.wub.edu.bd/"};

        PrivateAdapter nAdapter = new PrivateAdapter(this, names, links, images);

        listView.setAdapter(nAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(getApplicationContext(), " " + names[position], Toast.LENGTH_LONG).show();

                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(links[position]));
                startActivity(intent);
            }
        });

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        if (id == R.id.homeButton){

            Intent intent = new Intent(PrivateActivity.this,MainActivity.class);
            startActivity(intent);

            return true;
        }
        if(id==R.id.exit){
            finish();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}







