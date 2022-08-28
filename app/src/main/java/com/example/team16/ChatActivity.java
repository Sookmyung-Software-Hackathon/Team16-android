package com.example.team16;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class ChatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("message");
        // 메세지를 참조해 데이터를 갖고 옴

        myRef.setValue("Hello, World! 123");
        // setValue : message 밑에 들어갈 데이터.
        // 1. recyclerView = 반복, 채팅창을 반복해 보여줌
        // 2. DB 내용을 넣는다.3
        // 3. 상대방 폰에 채팅 내용이 보임


    }
}