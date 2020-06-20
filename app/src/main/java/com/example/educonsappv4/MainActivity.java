package com.example.educonsappv4;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.example.educonsappv4.home.HomeFragment;
import com.example.educonsappv4.map.MapFragment;
import com.example.educonsappv4.user.UserFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        BottomNavigationView bottomNav = findViewById(R.id.bottom_nav); //Kreiranje navigacije i dodeljivanje xml izgleda
        bottomNav.setOnNavigationItemSelectedListener(navListener); //dodeljivanje listenera koji vraca sta je kliknuto

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new HomeFragment()).commit();


    }



    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                    Fragment selectedFragment = null; //kreiranje temp fragmenta

                    switch (menuItem.getItemId()){  //u odnosi na kliknuti element temp fragment zameni kreiranjem novog trazenog
                        case R.id.nav_home:
                            selectedFragment = new HomeFragment();
                            break;

                        case  R.id.nav_map:
                            selectedFragment = new MapFragment();
                            break;

                        case  R.id.nav_user:
                            selectedFragment = new UserFragment();
                            break;
                    }


                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragment).commit(); //fragment prosledi xml fragment konteneru da ga prikaze

                    return true;
                }
            };


}
