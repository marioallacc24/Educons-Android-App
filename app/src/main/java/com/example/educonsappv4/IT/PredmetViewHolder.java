package com.example.educonsappv4.IT;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.educonsappv4.R;

public class PredmetViewHolder extends RecyclerView.ViewHolder {

    TextView godina;
    TextView naziv;
    TextView profesor;
    TextView dan;
    TextView vreme;
    TextView prostorija;

    public PredmetViewHolder(@NonNull View itemView) {
        super(itemView);

        godina = itemView.findViewById(R.id.godina);
        naziv = itemView.findViewById(R.id.naziv);
        profesor = itemView.findViewById(R.id.profesor);
        dan = itemView.findViewById(R.id.dan);
        vreme = itemView.findViewById(R.id.vreme);
        prostorija = itemView.findViewById(R.id.prostorija);
    }
}
