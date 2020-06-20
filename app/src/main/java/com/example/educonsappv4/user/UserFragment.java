package com.example.educonsappv4.user;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.educonsappv4.Obavestenje;
import com.example.educonsappv4.R;

public class UserFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_user,container,false);


        Button ulogujSe = (Button) view.findViewById(R.id.ulogujSe_btn);
        ulogujSe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog();
            }
        });



        return view;
    }

    public void openDialog(){
        Obavestenje obavestenje = new Obavestenje();
        obavestenje.show(getFragmentManager(),"primer");
    }




}
