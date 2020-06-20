package com.example.educonsappv4.IT;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.educonsappv4.R;

import java.util.ArrayList;

public class PredmetAdapter extends RecyclerView.Adapter<PredmetViewHolder> {

    ArrayList<Predmet> predmets;

    public PredmetAdapter() {
        predmets = new ArrayList<>();
    }

    public void setData(ArrayList<Predmet> predmets){
        this.predmets = predmets;
    }

    @NonNull
    @Override
    public PredmetViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View nastavaView = layoutInflater.inflate(R.layout.raspored_nastava_it_recycler_row,parent,false);

        return new PredmetViewHolder(nastavaView);
    }

    @Override
    public void onBindViewHolder(@NonNull PredmetViewHolder holder, int position) {

        Predmet predmet = predmets.get(position);

        holder.godina.setText(predmet.godina);
        holder.naziv.setText(predmet.naziv);
        holder.profesor.setText(predmet.profesor);
        holder.dan.setText(predmet.dan);
        holder.vreme.setText(predmet.vreme);
        holder.prostorija.setText(predmet.prostorija);

    }

    @Override
    public int getItemCount() {
        return predmets.size();
    }
}
