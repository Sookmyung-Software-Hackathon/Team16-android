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
        selllist.add(new SellData("서울시청","서울시청 빌려드릴게요", "10:00~11:00"));
        selllist.add(new SellData("경복궁","경복궁 받아주시면 안될까요?", "11:00~12:00"));
        selllist.add(new SellData("서울역","서울역 싸게 빌려드려요", "10:00~13:00"));
        selllist.add(new SellData("남산","남산 베풀어드릴게요", "10:00~15:00"));
        selllist.add(new SellData("을지로입구역","을지로입구역 빌려드릴까유. \n을지로3가역도 가능","10:00~19:00"));
    }

}