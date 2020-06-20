package com.example.educonsappv4.IT;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.educonsappv4.R;

public class ObavestenjeViewHolder extends RecyclerView.ViewHolder {

    ImageView slika;
    TextView naslov;
    TextView datum;
    TextView tekst;

    public ObavestenjeViewHolder(@NonNull View itemView) {
        super(itemView);

        slika = itemView.findViewById(R.id.slika);
        naslov = itemView.findViewById(R.id.naslov);
        datum = itemView.findViewById(R.id.datum);
        tekst = itemView.findViewById(R.id.tekst);
    }


}
