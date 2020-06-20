package com.example.educonsappv4.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.educonsappv4.Fakulteti;
import com.example.educonsappv4.Kontaktiraj;
import com.example.educonsappv4.Nauka;
import com.example.educonsappv4.OEduconsu;
import com.example.educonsappv4.R;
import com.example.educonsappv4.Studije;
import com.example.educonsappv4.Upisise;
import com.example.educonsappv4.user.UserFragment;

import java.text.DateFormat;
import java.util.Calendar;

public class HomeFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home,container,false);

        Calendar calendar = Calendar.getInstance();
        String currentDate = DateFormat.getDateInstance(DateFormat.FULL).format(calendar.getTime());
        TextView trenutnuDatum = view.findViewById(R.id.trenutniDatum);
        trenutnuDatum.setText(currentDate);

        Button button = (Button) view.findViewById(R.id.o_educonsu_btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),OEduconsu.class);
                startActivity(intent);
            }
        });

        Button button1 = (Button) view.findViewById(R.id.fakulteti_btn);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Fakulteti.class);
                startActivity(intent);
            }
        });

        Button button2 = (Button) view.findViewById(R.id.studije_btn);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Studije.class);
                startActivity(intent);
            }
        });

        Button button3 = (Button) view.findViewById(R.id.upisise_btn);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Upisise.class);
                startActivity(intent);
            }
        });

        Button button4 = (Button) view.findViewById(R.id.nauka_btn);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Nauka.class);
                startActivity(intent);
            }
        });

        Button button5 = (Button) view.findViewById(R.id.kontaktiraj_btn);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Kontaktiraj.class);
                startActivity(intent);
            }
        });

        Button button6 = (Button) view.findViewById(R.id.login_btn);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment selectedFragment = null;
                selectedFragment = new UserFragment();

                getFragmentManager().beginTransaction().replace(R.id.fragment_container,selectedFragment).commit();
            }
        });


        return view;
    }


}
