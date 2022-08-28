package com.example.team16;

import static android.content.ContentValues.TAG;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.team16.databinding.ActivityMainBinding;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    private NavigationView navigationView;
    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fragment buyFragment = new BuyFragment();
        Fragment sellFragment = new SellFragment();
        Fragment chatFragment = new ChatFragment();
        Fragment mypageFragment = new MypageFragment();

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch(item.getItemId()){
                    case  R.id.aciton_buy:
                        // replace(프레그먼트를 띄워줄 frameLayout, 교체할 fragment 객체)
                        getSupportFragmentManager().beginTransaction().replace(R.id.main_content, buyFragment).commitAllowingStateLoss();
                        return  true;
                    case  R.id.action_sell:
                        getSupportFragmentManager().beginTransaction().replace(R.id.main_content, sellFragment).commitAllowingStateLoss();
                        return  true;
                    case  R.id.action_chat:
                        getSupportFragmentManager().beginTransaction().replace(R.id.main_content, chatFragment).commitAllowingStateLoss();
                        return  true;
                    case  R.id.action_mypage:
                        getSupportFragmentManager().beginTransaction().replace(R.id.main_content, mypageFragment).commitAllowingStateLoss();
                        return  true;
                    default:
                        return false;
                }
            }
        });

    }

}