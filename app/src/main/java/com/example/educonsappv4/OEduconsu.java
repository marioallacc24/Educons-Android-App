package com.example.educonsappv4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class OEduconsu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oeduconsu);

        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);



        TextView textView = (TextView) findViewById(R.id.tekst);
        textView.setJustificationMode(Layout.JUSTIFICATION_MODE_INTER_WORD);


    }

    public void facebook(View view){
        Intent browserInt = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/EduconsUniverzitet/"));
        startActivity(browserInt);
    }
    public void instagram(View view){
        Intent browserInt = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/university_educons/"));
        startActivity(browserInt);
    }
    public void linkedin(View view){
        Intent browserInt = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/company/1903606/"));
        startActivity(browserInt);
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
