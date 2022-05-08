package com.sorayya.mymvp;

import android.os.Handler;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Model implements Contract.Model {

    // array list of strings from which
    // random strings will be selected
    // to display in the activity
    private List<Integer> arrayList = Arrays.asList(
            1, 2, 3, 4, 5, 6
    );

    @Override
    // this method will invoke when
    // user clicks on the button
    // and it will take a delay of
    // 1200 milliseconds to display next course detail
    public void getNextDice(final OnFinishedListener listener) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                listener.onFinished(getRandomInteger());
            }
        }, 1200);
    }

    // method to select random
    // string from the list of strings
    private Integer[] getRandomInteger() {
        Random random = new Random();
        int index = random.nextInt(arrayList.size());
        int index1 = random.nextInt(arrayList.size());
        return new Integer[]{arrayList.get(index),arrayList.get(index1)};
    }
}
