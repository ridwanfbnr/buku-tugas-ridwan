package com.ridwanfbnr.bukutugasridwan;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ridwanfbnr.bukutugasridwan.databinding.ItemRecycleviewBinding;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.AdapterViewHolder> {
    Data[] allData;

    public Adapter(Data[] allData) {
        this.allData = allData;
    }

    @NonNull
    @Override
    public Adapter.AdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new AdapterViewHolder(ItemRecycleviewBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.AdapterViewHolder holder, int position) {
        holder.itemRecycleviewBinding.tvNama.setText(allData[position].getNama());
        holder.itemRecycleviewBinding.tvDeskripsi.setText(allData[position].getDeskripsi());
        holder.itemRecycleviewBinding.imageView.setImageResource(allData[position].getProfile());
    }

    @Override
    public int getItemCount() {
        return allData.length;
    }

    public static class AdapterViewHolder extends RecyclerView.ViewHolder {

        ItemRecycleviewBinding itemRecycleviewBinding;

        public AdapterViewHolder(ItemRecycleviewBinding itemRecycleviewBinding) {
            super(itemRecycleviewBinding.getRoot());
            this.itemRecycleviewBinding = itemRecycleviewBinding;
        }
    }
}
