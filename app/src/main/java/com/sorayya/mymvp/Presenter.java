package com.sorayya.mymvp;

public class Presenter implements Contract.Presenter, Contract.Model.OnFinishedListener {

    // creating object of View Interface
    private Contract.View mainView;

    // creating object of Model Interface
    private Contract.Model model;

    // instantiating the objects of View and Model Interface
    public Presenter(Contract.View mainView, Contract.Model model) {
        this.mainView = mainView;
        this.model = model;
    }

    @Override
    // operations to be performed
    // on button click
    public void onButtonClick() {
        if (mainView != null) {
            mainView.showProgress();
        }
        model.getNextDice(this);
    }

    @Override
    public void onDestroy() {
        mainView = null;
    }


    @Override
    public void onFinished(Integer[] integer) {
        if (mainView != null) {
            mainView.setInteger(integer);
            mainView.hideProgress();
        }
    }
}