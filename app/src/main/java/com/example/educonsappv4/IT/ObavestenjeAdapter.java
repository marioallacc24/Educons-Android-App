package com.example.educonsappv4.IT;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.educonsappv4.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class ObavestenjeAdapter extends RecyclerView.Adapter<ObavestenjeViewHolder> {

    ArrayList<Obavestenje> obavestenjes;

    public ObavestenjeAdapter() {
        obavestenjes = new ArrayList<>();
    }

    public void setData(ArrayList<Obavestenje> obavestenjes){
        this.obavestenjes = obavestenjes;
    }

    @NonNull
    @Override
    public ObavestenjeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View obavestenjaView = layoutInflater.inflate(R.layout.obavestenja_it_recycler_row,parent,false);

        return new ObavestenjeViewHolder(obavestenjaView);
    }

    @Override
    public void onBindViewHolder(@NonNull ObavestenjeViewHolder holder, int position) {
        Obavestenje obavestenje = obavestenjes.get(position);

        Picasso.get().load(obavestenje.slika).into(holder.slika);
        holder.naslov.setText(obavestenje.naslov);
        holder.datum.setText(obavestenje.datum);
        holder.tekst.setText(obavestenje.tekst);


    }

    @Override
    public int getItemCount() {
        return obavestenjes.size();
    }
}
