package com.example.team16;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    private NavigationView navigationView;

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