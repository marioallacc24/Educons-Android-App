package com.example.educonsappv4;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Calendar;

public class Upisise extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upisise);

        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        TextView textView = (TextView) findViewById(R.id.pasus1);
        textView.setJustificationMode(Layout.JUSTIFICATION_MODE_INTER_WORD);
        TextView textView2 = (TextView) findViewById(R.id.pasus2);
        textView2.setJustificationMode(Layout.JUSTIFICATION_MODE_INTER_WORD);
        TextView textVie3 = (TextView) findViewById(R.id.pasus3);
        textVie3.setJustificationMode(Layout.JUSTIFICATION_MODE_INTER_WORD);
        TextView textView4 = (TextView) findViewById(R.id.pasus4);
        textView4.setJustificationMode(Layout.JUSTIFICATION_MODE_INTER_WORD);
        //TextView textView5 = (TextView) findViewById(R.id.pasus5);
        //textView5.setJustificationMode(Layout.JUSTIFICATION_MODE_INTER_WORD);

        Spinner spinnerFakulteti = findViewById(R.id.spinerFakulteti);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.fakulteti, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerFakulteti.setAdapter(adapter);





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
