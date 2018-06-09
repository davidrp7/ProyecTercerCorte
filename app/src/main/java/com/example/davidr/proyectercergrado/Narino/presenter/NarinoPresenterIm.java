package com.example.davidr.proyectercergrado.Narino.presenter;

import com.example.davidr.proyectercergrado.Narino.interactor.NarinoInteractor;
import com.example.davidr.proyectercergrado.Narino.interactor.NarinoInteractorIm;
import com.example.davidr.proyectercergrado.Narino.model.Narino;
import com.example.davidr.proyectercergrado.Narino.view.NarinoFragmentView;

import java.util.List;

public class NarinoPresenterIm implements  NarinoPresenter {


    private NarinoFragmentView narinoFragmentView;
    private NarinoInteractor narinoInteractor;

    public NarinoPresenterIm(NarinoFragmentView narinoFragmentView){
        this.narinoFragmentView = narinoFragmentView;
        narinoInteractor = new NarinoInteractorIm(this);
    }

    @Override
    public void showResultNar(List<Narino> narinoList) {
        narinoFragmentView.showResultData(narinoList);

    }

    @Override
    public void getDataNar() {
        narinoInteractor.getDataNar();
    }
}
