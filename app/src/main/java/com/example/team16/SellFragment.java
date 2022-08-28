package com.example.team16;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ProgressBar;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SellFragment extends Fragment {

    private RecyclerView recyclerView;
    private SellAdapter mAdapter;
    private ArrayList<SellData> selllist = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.activity_buy, container, false);

        //recyclerview
        recyclerView = (RecyclerView) view.findViewById(R.id.product_list);
        recyclerView.setHasFixedSize(true);
        mAdapter = new SellAdapter(selllist);

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
        selllist.add(new SellData("C 프로그래밍 교재","교재 빌려드려요 \n 일주일까지 가능합니다", "10:00~11:00"));
        selllist.add(new SellData("보조배터리","보조배터리 빌려드립니다", "11:00~17:00"));
        selllist.add(new SellData("학위복","1캠 앞 직거래 선호합니다", "10:00~13:00"));
        selllist.add(new SellData("캐리어","캐리어 빌려드립니다!", "10:00~15:00"));
        selllist.add(new SellData("노트북 충전기","노트북 충전기 빌려드립니다 :)","10:00~19:00"));
    }

}