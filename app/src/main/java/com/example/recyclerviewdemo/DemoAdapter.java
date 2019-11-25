package com.example.recyclerviewdemo;

import android.provider.Settings;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DemoAdapter extends RecyclerView.Adapter<DemoAdapter.DemoViewHolder> {

    private List<String> items;

    public static class DemoViewHolder extends RecyclerView.ViewHolder {
        public TextView textView;
        public DemoViewHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.text_view);
        }
    }

    public DemoAdapter(List<String> items) {
        this.items = items;
    }

    @Override
    public DemoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.demo_item, parent, false );
        return new DemoViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull DemoViewHolder holder, final int position) {
        holder.textView.setText(items.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println(items.get(position));
            }
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
