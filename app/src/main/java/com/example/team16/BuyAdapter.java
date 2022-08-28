package com.example.team16;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class BuyAdapter extends RecyclerView.Adapter<BuyAdapter.CustomViewHolder> {

    private ArrayList<BuyData> arrayList;
    private Intent intent;

    public BuyAdapter(ArrayList<BuyData> arrayList) {
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public BuyAdapter.CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.buy_item_view, parent, false);
        CustomViewHolder holder = new CustomViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull BuyAdapter.CustomViewHolder holder, int position) {
        holder.buy_name.setText(arrayList.get(position).getBuy_name());
        holder.buy_detail.setText(arrayList.get(position).getBuy_detail());
        holder.buy_time.setText(arrayList.get(position).getBuy_time());

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

        protected TextView buy_name;
        protected TextView buy_detail;
        protected TextView buy_time;

        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);
            this.buy_name = (TextView) itemView.findViewById(R.id.product_name);
            this.buy_detail = (TextView) itemView.findViewById(R.id.product_detail);
            this.buy_time = (TextView) itemView.findViewById(R.id.product_time);

        }
    }
}