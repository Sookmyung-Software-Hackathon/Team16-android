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

public class BuyFragment extends Fragment {

    private RecyclerView recyclerView;
    private BuyAdapter mAdapter;
    private ArrayList<BuyData> buylist = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.activity_buy, container, false);

        //recyclerview
        recyclerView = (RecyclerView) view.findViewById(R.id.product_list);
        recyclerView.setHasFixedSize(true);
        mAdapter = new BuyAdapter(buylist);

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
        buylist.add(new BuyData("서울시청","37.54892296550104"));
        buylist.add(new BuyData("경복궁","126.99089033876304"));
        buylist.add(new BuyData("서울역","37.54892296550104"));
        buylist.add(new BuyData("남산","4892296550104"));
        buylist.add(new BuyData("을지로입구역","37.54892296550104"));
    }

}