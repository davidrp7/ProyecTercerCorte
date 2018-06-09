package com.example.davidr.proyectercergrado.Parques.presenter;

import com.example.davidr.proyectercergrado.Parques.interactor.ParqueFragmentInteractor;
import com.example.davidr.proyectercergrado.Parques.interactor.ParqueFragmentInteractorIm;
import com.example.davidr.proyectercergrado.Parques.model.Parque;
import com.example.davidr.proyectercergrado.Parques.view.ParqueFragmentView;

import java.util.List;

public class ParqueFragmentPresenterIm implements ParqueFragmentPresenter {


    private ParqueFragmentView parqueFragmentView;
    private ParqueFragmentInteractor parqueFragmentInteractor;

    public ParqueFragmentPresenterIm(ParqueFragmentView parqueFragmentView){
        this.parqueFragmentView = parqueFragmentView;
        parqueFragmentInteractor = new ParqueFragmentInteractorIm(this);
    }

    @Override
    public void showResultParque(List<Parque> parqueList) {
        parqueFragmentView.showResultParque(parqueList);

    }

    @Override
    public void getDataParque() {
        parqueFragmentInteractor.getDataParque();

    }
}
