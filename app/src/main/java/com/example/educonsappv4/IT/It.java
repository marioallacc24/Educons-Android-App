package com.example.educonsappv4.IT;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.example.educonsappv4.R;

public class It extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_it);

        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Button button = (Button) findViewById(R.id.nastava_btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRasporedNastava();
            }
        });

        Button button1 = (Button) findViewById(R.id.vezbe_btn);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRasporedVezbe();
            }
        });

        Button button2 = (Button) findViewById(R.id.ispiti_btn);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRasporedIspit();
            }
        });

        Button button3 = (Button) findViewById(R.id.obavestenja_btn);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openObavestenja();
            }
        });
    }

    public void openRasporedNastava(){
        Intent intent = new Intent(this, RasporedNastavaIT.class);
        startActivity(intent);
    }

    public void openRasporedVezbe(){
        Intent intent = new Intent(this, RasporedVezbeIT.class);
        startActivity(intent);
    }

    public void openRasporedIspit(){
        Intent intent = new Intent(this, RasporedIspitIT.class);
        startActivity(intent);
    }

    public void openObavestenja(){
        Intent intent = new Intent(this, ObavestenjaIT.class);
        startActivity(intent);
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
}
