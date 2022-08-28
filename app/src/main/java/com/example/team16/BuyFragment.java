package com.example.team16;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.team16.databinding.ActivityMainBinding;
import java.util.ArrayList;

public class BuyFragment extends Fragment {

    Activity activity;
    private ActivityMainBinding binding;
    private RecyclerView recyclerView;
    private BuyAdapter mAdapter;
    private ArrayList<BuyData> buylist = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.activity_buy, container, false);

        //recyclerview
        recyclerView = (RecyclerView) view.findViewById(R.id.product_list);
        recyclerView.setHasFixedSize(true);
        mAdapter = new BuyAdapter(buylist);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        Button add_buy_product = view.findViewById(R.id.add_buy_product);
        add_buy_product.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SellSettingActivity.class);
                startActivity(intent);
            }
        });


        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        if (context instanceof Activity)
            activity = (Activity) context;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        prepareData();
    }

    //데이터 준비(최종적으로는 동적으로 추가하거나 삭제할 수 있어야 한다. 이 데이터를 어디에 저장할지 정해야 한다.)
    private void prepareData() {
        buylist.add(new BuyData("애플펜슬 펜촉","펜촉이 닳아서..\n 1시간만 빌리고 싶습니다!", "10:00~11:00"));
        buylist.add(new BuyData("이어폰","강의 때문에 2시간만 이어폰 빌립니다", "11:00~13:00"));
        buylist.add(new BuyData("노트북","1시간만 노트북 빌려주실 분 구해요.\n 문서 작성만 할 예정입니다", "12:00~13:00"));
        buylist.add(new BuyData("충전기 C타입","충전기 C타입 3시간만 빌려요", "12:00~15:00"));
        buylist.add(new BuyData("담요","무릎담요 빌려요!","10:00~19:00"));
    }

}