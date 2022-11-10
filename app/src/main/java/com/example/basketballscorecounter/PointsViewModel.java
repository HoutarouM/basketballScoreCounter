package com.example.basketballscorecounter;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PointsViewModel extends ViewModel {
    private MutableLiveData<Integer> score;

    public MutableLiveData<Integer> getScore() {
        if (score == null) {
            score = new MutableLiveData<>();

            score.setValue(0);
        }

        return score;
    }

    public void setScore(Integer score) {
        this.score.setValue(score);
    }

    public void incScore(Integer n) {
        if (this.score.getValue() != null) {
            this.score.setValue(this.score.getValue() + n);
        }
    }
}
