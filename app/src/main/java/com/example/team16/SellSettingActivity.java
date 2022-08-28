package com.example.team16;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SellSettingActivity extends AppCompatActivity {

    private Button add_complete;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sell_setting);

        add_complete = findViewById(R.id.add_complete);

        add_complete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "신청이 완료되었습니다", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(SellSettingActivity.this, BuyFragment.class);
                startActivity(intent);
            }
        });
    }
}
