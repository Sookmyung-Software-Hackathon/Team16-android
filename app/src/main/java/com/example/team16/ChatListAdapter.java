package com.example.team16;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class ChatListAdapter extends RecyclerView.Adapter<ChatListAdapter.CustomViewHolder> {

    private ArrayList<ChatListData> arrayList;
    private Intent intent;

    public ChatListAdapter(ArrayList<ChatListData> arrayList) {
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public ChatListAdapter.CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.chatlist_view, parent, false);

        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ChatListAdapter.CustomViewHolder holder, int position) {

        holder.profile.setText(arrayList.get(position).getProfile());
        holder.name.setText(arrayList.get(position).getName());
        holder.content.setText(arrayList.get(position).getContent());

        holder.itemView.setTag(position);

    }

    @Override
    public int getItemCount() {
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }



    public static class CustomViewHolder extends RecyclerView.ViewHolder  {

        protected TextView profile;
        protected TextView name;
        protected TextView content;


        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);
            this.profile = (TextView) itemView.findViewById(R.id.chatting_profile);
            this.name = (TextView) itemView.findViewById(R.id.chatting_name);
            this.content = (TextView) itemView.findViewById(R.id.chatting_content);

            itemView.setOnClickListener((View.OnClickListener) this);
        }
    }
}