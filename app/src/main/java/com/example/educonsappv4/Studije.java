package com.example.educonsappv4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class Studije extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_studije);

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

    public void osnovne(View view){
        Intent browserInt = new Intent(Intent.ACTION_VIEW, Uri.parse("https://educons.edu.rs/studije/osnovne-studije/"));
        startActivity(browserInt);
    }
    public void master(View view){
        Intent browserInt = new Intent(Intent.ACTION_VIEW, Uri.parse("https://educons.edu.rs/studije/master-studije/"));
        startActivity(browserInt);
    }
    public void specijalisticke(View view){
        Intent browserInt = new Intent(Intent.ACTION_VIEW, Uri.parse("https://educons.edu.rs/studije/specijalisticke-studije/"));
        startActivity(browserInt);
    }
    public void doktorske(View view){
        Intent browserInt = new Intent(Intent.ACTION_VIEW, Uri.parse("https://educons.edu.rs/studije/doktorske-studije/"));
        startActivity(browserInt);
    }
    public void naDaljinu(View view){
        Intent browserInt = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.studijenadaljinu.edu.rs/"));
        startActivity(browserInt);
    }
    public void naEngleskom(View view){
        Intent browserInt = new Intent(Intent.ACTION_VIEW, Uri.parse("https://educons.edu.rs/studije/studije-na-engleskom-jeziku/"));
        startActivity(browserInt);
    }
}
