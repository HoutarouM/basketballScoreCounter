package com.example.basketballscorecounter;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
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

        binding.scoreTextView.setText(Integer.toString(pointsViewModel.getScore()));


        binding.addOneButton.setOnClickListener(view_local -> {
            pointsViewModel.incScore(1);

            binding.scoreTextView.setText(Integer.toString(pointsViewModel.getScore()));
        });
    }
}