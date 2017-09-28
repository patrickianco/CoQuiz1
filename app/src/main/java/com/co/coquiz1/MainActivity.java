package com.co.coquiz1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    String[] android;
    int[] logos;
    ListView lvVersions;
    CustomAdapter adapter;
    List<Android> androidList;
    Button ver1, ver2, ver3, home;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ver1 = (Button) findViewById(R.id.ver1Btn);
        ver2 = (Button) findViewById(R.id.ver2Btn);
        ver3 = (Button) findViewById(R.id.ver3Btn);
        home = (Button) findViewById(R.id.homeBtn);

        home.setEnabled(false);

        androidList = new ArrayList<Android>();
        android = getResources().getStringArray(R.array.androidVersions);
        lvVersions = (ListView) findViewById(R.id.lvVersions);
        logos = new int[] {R.drawable.nougat, R.drawable.marshmallow, R.drawable.oreo};

        for(int i = 0; i < android.length; i++){
            androidList.add(new Android(android[i], logos[i]));
        }

        adapter = new CustomAdapter(this, androidList);
        lvVersions.setAdapter(adapter);


        lvVersions.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String version = android[i];
                Intent intent;
                switch(version){
                    case "Nougat":
                        intent = new Intent(getApplicationContext(), DisplayActivity.class);

                        intent.putExtra("ver", "1");
                        intent.putExtra("codename", "Nougat");
                        intent.putExtra("version", "Version 7.0 - 7.1.2");
                        intent.putExtra("api", "API Level 24 - 25");
                        intent.putExtra("released", "August 22, 2016");

                        startActivity(intent);
                    break;
                    case "Marshmallow":
                        intent = new Intent(getApplicationContext(), DisplayActivity.class);

                        intent.putExtra("ver", "2");
                        intent.putExtra("codename", "Marshmallow");
                        intent.putExtra("version", "Version 6.0 - 6.0.1");
                        intent.putExtra("api", "API Level 23");
                        intent.putExtra("released", "August 5, 2015");

                        startActivity(intent);
                    break;
                    case "Oreo":
                        intent = new Intent(getApplicationContext(), DisplayActivity.class);

                        intent.putExtra("ver", "3");
                        intent.putExtra("codename", "Oreo");
                        intent.putExtra("version", "Version 8.0");
                        intent.putExtra("api", "API Level 26");
                        intent.putExtra("released", "August 21, 2017");

                        startActivity(intent);
                    break;
                }
            }
        });
    }

    public void showVer1(View view){
        Intent intent = new Intent(this, DisplayActivity.class);

        intent.putExtra("ver", "1");
        intent.putExtra("codename", "Nougat");
        intent.putExtra("version", "Version 7.0 - 7.1.2");
        intent.putExtra("api", "API Level 24 - 25");
        intent.putExtra("released", "August 22, 2016");

        startActivity(intent);
    }

    public void showVer2(View view){
        Intent intent = new Intent(this, DisplayActivity.class);

        intent.putExtra("ver", "2");
        intent.putExtra("codename", "Marshmallow");
        intent.putExtra("version", "Version 6.0 - 6.0.1");
        intent.putExtra("api", "API Level 23");
        intent.putExtra("released", "August 5, 2015");

        startActivity(intent);
    }

    public void showVer3(View view){
        Intent intent = new Intent(this, DisplayActivity.class);

        intent.putExtra("ver", "3");
        intent.putExtra("codename", "Oreo");
        intent.putExtra("version", "Version 8.0");
        intent.putExtra("api", "API Level 26");
        intent.putExtra("released", "August 21, 2017");

        startActivity(intent);
    }
}
