package com.example.team16;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SellAdapter extends RecyclerView.Adapter<SellAdapter.CustomViewHolder> {

    private ArrayList<SellData> arrayList;
    private Intent intent;

    public SellAdapter(ArrayList<SellData> arrayList) {
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public SellAdapter.CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.buy_item_view, parent, false);
        CustomViewHolder holder = new CustomViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull SellAdapter.CustomViewHolder holder, int position) {
        holder.sell_name.setText(arrayList.get(position).getSell_name());
        holder.sell_detail.setText(arrayList.get(position).getSell_detail());
        holder.sell_time.setText(arrayList.get(position).getSell_time());

        holder.itemView.setTag(position);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(view.getContext(), BuyFragment.class);
                view.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {

        protected TextView sell_name;
        protected TextView sell_detail;
        protected TextView sell_time;

        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);
            this.sell_name = (TextView) itemView.findViewById(R.id.product_name);
            this.sell_detail = (TextView) itemView.findViewById(R.id.product_detail);
            this.sell_time = (TextView) itemView.findViewById(R.id.product_time);

        }
    }
}