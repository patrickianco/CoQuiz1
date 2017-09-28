package com.co.coquiz1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        Intent intent = getIntent();

        ImageView imgView = (ImageView) findViewById(R.id.displayLogo);
        TextView codenameView = (TextView) findViewById(R.id.displayName);
        TextView versionView = (TextView) findViewById(R.id.displayVesion);
        TextView apiView = (TextView) findViewById(R.id.displayAPI);
        TextView releasedView = (TextView) findViewById(R.id.displayReleased);
        Button ver1 = (Button) findViewById(R.id.ver1Btn);
        Button ver2 = (Button) findViewById(R.id.ver2Btn);
        Button ver3 = (Button) findViewById(R.id.ver3Btn);
        Button home = (Button) findViewById(R.id.homeBtn);

        String ver = intent.getStringExtra("ver");
        String codename =intent.getStringExtra("codename");
        String version = intent.getStringExtra("version");
        String api = intent.getStringExtra("api");
        String released = intent.getStringExtra("released");

        switch(ver){
            case "1":
                imgView.setImageResource(R.drawable.nougat);
                codenameView.setText(codename);
                versionView.setText(version);
                apiView.setText(api);
                releasedView.setText(released);
                ver1.setEnabled(false);
            break;
            case "2":
                imgView.setImageResource(R.drawable.marshmallow);
                codenameView.setText(codename);
                versionView.setText(version);
                apiView.setText(api);
                releasedView.setText(released);
                ver2.setEnabled(false);
            break;
            case "3":
                imgView.setImageResource(R.drawable.oreo);
                codenameView.setText(codename);
                versionView.setText(version);
                apiView.setText(api);
                releasedView.setText(released);
                ver3.setEnabled(false);
            break;
        }
    }

    public void showHome(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
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
