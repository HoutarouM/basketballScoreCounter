package com.example.basketballscorecounter;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.basketballscorecounter.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

//    wiazanie danych:
//    - dodac build grade module

    private ActivityMainBinding binding;

    private int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());

        View view = binding.getRoot();

        setContentView(view);

        binding.addOneButton.setOnClickListener(view_local -> {
            score++;

            binding.scoreTextView.setText(Integer.toString(score));
        });
    }
}