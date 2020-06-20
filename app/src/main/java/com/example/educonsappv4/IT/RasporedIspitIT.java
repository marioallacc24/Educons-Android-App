package com.example.educonsappv4.IT;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import com.example.educonsappv4.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class RasporedIspitIT extends AppCompatActivity {

    String url = "https://my-json-server.typicode.com/marioallacc24/educonsapi/ispiti";
    RecyclerView recyclerView;
    PredmetAdapter adapter;
    ArrayList<Predmet> predmets;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_raspored_ispit_it);

        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        recyclerView = findViewById(R.id.recycleview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new PredmetAdapter();
        recyclerView.setAdapter(adapter);
        predmets = new ArrayList<>();

        getData();
    }

    private void getData() {

        final ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("Ucitavanje...");
        progressDialog.show();

        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(url, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {

                try {
                    for (int i=0; i<response.length(); i++){
                        JSONObject jsonObject = response.getJSONObject(i);
                        Predmet predmet = new Predmet();
                        predmet.setGodina(jsonObject.getString("godina"));
                        predmet.setNaziv(jsonObject.getString("naziv"));
                        predmet.setProfesor(jsonObject.getString("profesor"));
                        predmet.setDan(jsonObject.getString("dan"));
                        predmet.setVreme(jsonObject.getString("vreme"));
                        predmet.setProstorija(jsonObject.getString("prostorija"));

                        predmets.add(predmet);
                    }
                } catch (JSONException e){

                    Toast.makeText(RasporedIspitIT.this,"JSON greska!",Toast.LENGTH_SHORT).show();
                }

                adapter.setData(predmets);
                adapter.notifyDataSetChanged();
                progressDialog.dismiss();

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                progressDialog.dismiss();
                Toast.makeText(RasporedIspitIT.this,"Greska pri ucitavanju!",Toast.LENGTH_SHORT).show();
            }
        });

        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(jsonArrayRequest);

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
