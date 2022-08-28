package com.example.team16;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ChatFragment extends Fragment {

    private RecyclerView recyclerView;
    private ChatListAdapter mAdapter;
    private ArrayList<ChatListData> userlist = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.activity_chatting_list, container, false);

        //recyclerview
        recyclerView = (RecyclerView) view.findViewById(R.id.chattingRecyclerView);
        //recyclerView.setHasFixedSize(true);
        mAdapter = new ChatListAdapter(userlist);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        prepareData();
    }

    //데이터 준비(최종적으로는 동적으로 추가하거나 삭제할 수 있어야 한다. 이 데이터를 어디에 저장할지 정해야 한다.)
    private void prepareData() {
        userlist.add(new ChatListData("","벝민진", "데이터 빌려주세요..."));
        userlist.add(new ChatListData("","채영재", "코딩천재 빌려주세요....!"));
        userlist.add(new ChatListData("","윤지윤", "어디서 만날까요?"));
        userlist.add(new ChatListData("","일가을", "저희 집으로 오실 수 있나요?"));
        userlist.add(new ChatListData("","나경나","노원역 2번출구로 오세요!"));
        userlist.add(new ChatListData("","스탑윤","반납은 언제쯤 하실건가요?"));
        userlist.add(new ChatListData("","경나","사물함 거래 가능하신가요?"));
    }

}