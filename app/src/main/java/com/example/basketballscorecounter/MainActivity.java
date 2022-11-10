package com.example.basketballscorecounter;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.basketballscorecounter.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

//    wiazanie danych:
//    - dodac build grade module

//    dzienki dindowaniu widokow nie musimy uzywac findViewById

    PointsViewModel pointsViewModel;

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());

        View view = binding.getRoot();

        setContentView(view);

        pointsViewModel = new ViewModelProvider(this).get(PointsViewModel.class);

        pointsViewModel.getScore().observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                binding.scoreTextView.setText(integer.toString());
            }
        });


        binding.addOneButton.setOnClickListener(view_local -> {
            pointsViewModel.incScore(1);
        });

        binding.addTwoButton.setOnClickListener(view_local -> {
            pointsViewModel.incScore(2);
        });

        binding.addThreeButton.setOnClickListener(view_local -> {
            pointsViewModel.incScore(3);
        });
    }
}