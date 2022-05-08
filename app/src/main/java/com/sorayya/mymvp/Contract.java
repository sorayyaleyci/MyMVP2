package com.sorayya.mymvp;

public interface Contract {
    interface View {
        // method to display progress bar
        // when next random course details
        // is being fetched
        void showProgress();

        // method to hide progress bar
        // when next random course details
        // is being fetched
        void hideProgress();

        // method to set random
        // text on the TextView


        void setInteger(Integer[] integer);
    }

    interface Model {

        // nested interface to be
        interface OnFinishedListener {
            // function to be called
            // once the Handler of Model class
            // completes its execution
            void onFinished(Integer[] integer);
        }

        void getNextDice(Contract.Model.OnFinishedListener onFinishedListener);
    }

    interface Presenter {

        // method to be called when
        // the button is clicked
        void onButtonClick();

        // method to destroy
        // lifecycle of MainActivity
        void onDestroy();
    }
}
