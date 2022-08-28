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
        buylist.add(new BuyData("서울시청","서울시청 빌려주세요", "10:00~11:00"));
        buylist.add(new BuyData("경복궁","경복궁 빌려주시면 안될까요?", "11:00~12:00"));
        buylist.add(new BuyData("서울역","서울역 싸게 빌려요", "10:00~13:00"));
        buylist.add(new BuyData("남산","남산 베풀어주실수 있을까요", "10:00~15:00"));
        buylist.add(new BuyData("을지로입구역","을지로입구역 빌려요. \n을지로3가역도 괜찮아요","10:00~19:00"));
    }

}