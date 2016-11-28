package com.example.saabir.internationaluniversityinfo;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class PublicActivity extends AppCompatActivity {

   private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_public);
        listView=(ListView)findViewById(R.id.lstPublic);


        final String[] names={"Army university of science and technology","Begum rokeya university","Mujibur Rahman agricultural university","Mujibur Rahman maritime university",
        "Mujibur Rahman science and technology university","Bangladesh university of business and technology university","Bangladesh university of engineering and technology","Bangladesh university of professional","Bangladesh textile university","University of chittagong",
        "Chittagong university of engineering and technology","Chittagong veterinary and animal university","Dhaka university","Dhaka University of Engineering & Technology","Hajee Dinash science and technology university","Islamic arabic university","Islami university",
        "Jahangirnagar university","National university","Jessore science and technology university","Jagannath university","Kabi kazi nazrul islam university",
        "Khulna university","Bangladesh agricultural university","Komilla university","Mawlana Bhashani Science & Technology University","Noakhali Science and Technology Univerity","Patuakhali Science and Technology University",
        "Pabna University of Science & Technology","Rajshahi University","Rajshahi University of Engineering & Technology","Shere Bangla Agricultural university","Shahjalal University of Science and Technology","Sylhet Agricultural University ","Barisal university",
        "Bangladesh Open University"};



        int[] images={R.drawable.armybd,R.drawable.begum_rokeya_universitybd,R.drawable.bsmraubd,R.drawable.bsmrmubd,
        R.drawable.bsmustbd,R.drawable.bubtbd,R.drawable.buetbd,R.drawable.bupbd,R.drawable.butexbd,R.drawable.cittagonguniversitybd,
        R.drawable.cuetbd,R.drawable.cvasubd,R.drawable.dhakauniversitybd,R.drawable.duetbd,R.drawable.hstubd,R.drawable.iaubd,R.drawable.islamibd,
        R.drawable.jahangirnogorbd,R.drawable.jatiobd,R.drawable.jessorebd,R.drawable.jogonathbd,R.drawable.kabinazrulbd,
        R.drawable.khulnauniversitybd,R.drawable.krishibd,R.drawable.kumillabd,R.drawable.maulanavasanibd,R.drawable.nstubd,R.drawable.pstubd,
        R.drawable.pustbd,R.drawable.rajsahiuniversitybd,R.drawable.ruetbd,R.drawable.saubd,R.drawable.siletbd,R.drawable.siletkrishibd,R.drawable.universityofbarisalbd,
        R.drawable.unmukktobd};



        final String[] links={"www.baust.edu.bd/","https://www.brur.ac.bd/","http://bsmrau.edu.bd/","http://www.bsmrmu.edu.bd/",
                "http://www.bsmrstu.edu.bd/","http://bubt.ac.bd/","http://www.buet.ac.bd/","http://bup.edu.bd/","http://www.butex.edu.bd/","www.cu.ac.bd/",
                "www.cuet.ac.bd/","http://cvasu.ac.bd/","http://www.du.ac.bd/","http://www.duet.ac.bd/","http://www.hstu.ac.bd/","http://iau.edu.bd/","http://iu.ac.bd/",
                "http://www.juniv.edu/","http://www.nu.edu.bd/","http://just.edu.bd/","www.jnu.ac.bd/","http://www.jkkniu.edu.bd/",
                "http://ku.ac.bd/","http://www.bau.edu.bd/","http://www.cou.ac.bd/","http://mbstu.ac.bd/","http://www.nstu.edu.bd/","https://www.pstu.ac.bd/",
                "http://www.pust.ac.bd/","http://www.ru.ac.bd/","http://www.ruet.ac.bd/","http://www.sau.edu.bd/","www.sust.edu/","www.sau.ac.bd/","www.barisaluniv.edu.bd/",
                "http://www.bou.edu.bd/"};





        PublicUnAdapter publicUnAdapter = new PublicUnAdapter(this,names,links,images);

        listView.setAdapter(publicUnAdapter);

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

            Intent intent = new Intent(PublicActivity.this,MainActivity.class);
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
