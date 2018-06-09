package com.example.davidr.proyectercergrado.HomePlaces.presenter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import com.example.davidr.proyectercergrado.HomePlaces.ineractor.CardActivityInteractor;
import com.example.davidr.proyectercergrado.HomePlaces.ineractor.CardActivityInteractorIm;
import com.example.davidr.proyectercergrado.HomePlaces.view.CardActivity;
import com.example.davidr.proyectercergrado.HomePlaces.view.CardActivityView;

public class CardActivityPresenterIm implements  CardActivityPresenter{

    private CardActivityView cardActivityView;
    private CardActivityInteractor cardActivityInteractor;

    public CardActivityPresenterIm(CardActivityView cardActivityView){
        this.cardActivityView = cardActivityView;
        cardActivityInteractor = new CardActivityInteractorIm(this);
    }

    @Override
    public void showResult() {

    }

    @Override
    public void ChangeTab(Integer position, FragmentManager fragmentManager) {
        cardActivityInteractor.ChangeTab(position, fragmentManager);

    }
}
