package com.example.davidr.proyectercergrado.Ingreso.presenter;

import com.example.davidr.proyectercergrado.Ingreso.interactor.IngresoActivityInteractor;
import com.example.davidr.proyectercergrado.Ingreso.interactor.IngresoActivityInteractorIm;
import com.example.davidr.proyectercergrado.Ingreso.model.Ingreso;
import com.example.davidr.proyectercergrado.Ingreso.view.MainActivityView;

import java.util.List;

public class IngresoActivityPresenterIm implements IngresoActivityPresenter {

    private MainActivityView mainActivityView;
    private IngresoActivityInteractor ingresoActivityInteractor;

    public IngresoActivityPresenterIm (MainActivityView mainActivityView){
        this.mainActivityView =  mainActivityView;
        ingresoActivityInteractor = new IngresoActivityInteractorIm(this);
    }

    @Override
    public void signIn(String user, String pass) {
        ingresoActivityInteractor.signIn(user, pass);

    }

    @Override
    public void showResult(List<Ingreso> ingresoList) {
        mainActivityView.showResult(ingresoList);
    }

    @Override
    public void showError(String error) {
        mainActivityView.showError(error);

    }
}
