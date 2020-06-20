package com.example.educonsappv4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class Nauka extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nauka);

        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);


    }

    public void goBack(View view){
        Button backBtn = (Button) findViewById(R.id.back_btn);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    public void naucniCentar(View view){
        Intent browserInt = new Intent(Intent.ACTION_VIEW, Uri.parse("https://educons.edu.rs/nauka/naucno%c2%adistrazivacki-centar-univerziteta-educons/"));
        startActivity(browserInt);
    }

    public void casopis(View view){
        Intent browserInt = new Intent(Intent.ACTION_VIEW, Uri.parse("https://educons.edu.rs/nauka/casopis-poslovna-ekonomija/"));
        startActivity(browserInt);
    }

    public void skup(View view){
        Intent browserInt = new Intent(Intent.ACTION_VIEW, Uri.parse("https://educons.edu.rs/nauka/naucni-skup/"));
        startActivity(browserInt);
    }

    public void projekti(View view){
        Intent browserInt = new Intent(Intent.ACTION_VIEW, Uri.parse("https://educons.edu.rs/nauka/projekti/"));
        startActivity(browserInt);
    }

    public void lab(View view){
        Intent browserInt = new Intent(Intent.ACTION_VIEW, Uri.parse("https://educons.edu.rs/nauka/laboratorija-a-bio-tech-lab/"));
        startActivity(browserInt);
    }
}
