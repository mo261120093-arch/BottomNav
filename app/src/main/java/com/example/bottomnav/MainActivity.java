package com.example.bottomnav;

import static android.widget.Toast.LENGTH_LONG;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

  BottomNavigationView bottom1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        bottom1 = findViewById(R.id.bottom1);
        ReplaceFragment(new HomeFragment());

        bottom1.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                if(menuItem.getItemId()==R.id.btfav) {
                    ReplaceFragment(new favoritFragment());
                }

               else  if(menuItem.getItemId()==R.id.btstteing) {
                    ReplaceFragment(new setteingFragment());
                }

                else if(menuItem.getItemId()==R.id.bthom) {
                    ReplaceFragment(new HomeFragment());
                }


                  else if(menuItem.getItemId()==R.id.forText) {
                        ReplaceFragment(new forFragment());
                    }




                return false;
            }
        });
    }

    void ReplaceFragment(Fragment f){
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.HomeFragment,f);
        transaction.addToBackStack(null);
        transaction.commit();
    }










    }
