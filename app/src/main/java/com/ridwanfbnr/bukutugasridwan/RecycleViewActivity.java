package com.ridwanfbnr.bukutugasridwan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.ridwanfbnr.bukutugasridwan.databinding.ActivityRecycleViewBinding;

import java.util.ArrayList;

public class RecycleViewActivity extends AppCompatActivity {

    private ActivityRecycleViewBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityRecycleViewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.rvList.setHasFixedSize(true);
        showRecycleView();
    }

    private void showRecycleView() {
        Data[] data = new Data[]{
                new Data("Ridwan1", "Deskripsi1", R.drawable.women),
                new Data("Ridwan2", "Deskripsi2", R.drawable.women),
                new Data("Ridwan3", "Deskripsi3", R.drawable.women),
                new Data("Ridwan4", "Deskripsi4", R.drawable.women),
                new Data("Ridwan5", "Deskripsi5", R.drawable.women),
                new Data("Ridwan6", "Deskripsi6", R.drawable.women),
                new Data("Ridwan7", "Deskripsi7", R.drawable.women),
                new Data("Ridwan8", "Deskripsi8", R.drawable.women),
                new Data("Ridwan9", "Deskripsi9", R.drawable.women),
                new Data("Ridwan10", "Deskripsi10", R.drawable.women),
        };

        binding.rvList.setLayoutManager(new LinearLayoutManager(this));
        Adapter adapter = new Adapter(data);
        binding.rvList.setAdapter(adapter);
    }
}