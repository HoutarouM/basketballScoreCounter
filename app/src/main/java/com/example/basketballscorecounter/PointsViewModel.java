package com.example.basketballscorecounter;

import androidx.lifecycle.ViewModel;

public class PointsViewModel extends ViewModel {
    private int score;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void incScore(int n) {
        this.score += n;
    }
}
