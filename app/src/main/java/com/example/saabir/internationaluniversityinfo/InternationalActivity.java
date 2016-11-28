package com.example.saabir.internationaluniversityinfo;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import static com.example.saabir.internationaluniversityinfo.R.drawable.alliance;

public class InternationalActivity extends AppCompatActivity {

    ImageView imageView;
    TextView textView;

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_international);
        listView =(ListView)findViewById(R.id.lstInternational);
        imageView=(ImageView)findViewById(R.id.imageInternational);
        textView=(TextView)findViewById(R.id.txtInternational);





        final String[] varsityName={"Alliance University","Anna University","Berkeley University","Caltech University","Columbia University","Cornell University","ETH switzerland University","Harvard University",
        "Imperial London University","Johns Hopkins University","Kyoto University","Mlchigan University","Manchester University","Massacusetts University","NewYork University","NorthWestern University ",
        "Oxford University","Princeton University","Stanford University","British Coulmbia University","Cambridge University","Chicago University","Copenhegen University","Kolkata University","University of London",
        "Texas University","Tokyo University","Toronto University","Pennsylvnia University","Washington University","Yale University"};


       final String[] varsityLink={"http://alliance.edu.in/","https:www.annauniv.edu","http://www.berkeley.edu/","http://www.caltech.edu/",
       "http://www.columbia.edu/","https://www.cornell.edu/","https://www.ethz.ch/","http://www.harvard.edu/","https://www.imperial.ac.uk/",
       "https://www.jhu.edu/","http://www.kyoto-u.ac.jp/en","https://msu.edu/","http://www.manchester.ac.uk/","http://web.mit.edu/","https://www.nyu.edu/",
       "http://www.northwestern.edu/","http://www.ox.ac.uk/","https://www.princeton.edu/main/","https://www.stanford.edu/","https://www.ubc.ca/",
       "https://www.cam.ac.uk/","http://www.uchicago.edu/","http://www.ku.dk/english/","http://www.caluniv.ac.in/","http://www.london.ac.uk/",
       "http://www.utexas.edu/","http://www.u-tokyo.ac.jp/","https://www.utoronto.ca/","http://cms.business-services.upenn.edu/",
       "http://www.washington.edu/","http://www.yale.edu/"};

        int[] images = {R.drawable.alliance,R.drawable.anna,R.drawable.berkeley,R.drawable.caltech,R.drawable.columbia,
        R.drawable.cornell,R.drawable.eth,R.drawable.harvard,R.drawable.imperialcollegelondon,R.drawable.johnshopkins,
        R.drawable.kyotouniversity,R.drawable.mlchiganuniversity,R.drawable.manchesteruniversity,R.drawable.massacusettsinstitute,
        R.drawable.newyorkuniversity,R.drawable.northwesternuniversity,R.drawable.oxforduniversity,R.drawable.princetonuniversity,
        R.drawable.stanforduniversity,R.drawable.universitybritiscoulmbia,R.drawable.cambridge,R.drawable.universitychicago,
        R.drawable.universitycopenhegen,R.drawable.kolkata,R.drawable.london,R.drawable.universitytexas,R.drawable.universitytokio,
        R.drawable.universitytoronto,R.drawable.universitypennsylvania,R.drawable.washingtonuniversity,R.drawable.yaleuniversity};


          final InternationalAdapter internationalAdapter = new InternationalAdapter(this,varsityName,varsityLink,images);

        listView.setAdapter(internationalAdapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(getApplicationContext(), " " + varsityName[position], Toast.LENGTH_LONG).show();

                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(varsityLink[position]));
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

            Intent intent = new Intent(InternationalActivity.this,MainActivity.class);
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
