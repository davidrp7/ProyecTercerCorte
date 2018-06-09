package com.example.davidr.proyectercergrado.Registro.presenter;

import com.example.davidr.proyectercergrado.Registro.interactor.RegistroActivityInteractor;
import com.example.davidr.proyectercergrado.Registro.interactor.RegistroActivityInteractorIm;
import com.example.davidr.proyectercergrado.Registro.model.Cuenta;
import com.example.davidr.proyectercergrado.Registro.view.RegisterActivityView;

import java.util.List;

public class RegistroActivityPresenterIm implements  RegistroActivityPresenter {

    private RegisterActivityView registerActivityView;
    private RegistroActivityInteractor registroActivityInteractor;

    public RegistroActivityPresenterIm(RegisterActivityView registerActivityView) {
        this.registerActivityView = registerActivityView;
        registroActivityInteractor = new RegistroActivityInteractorIm(this);
    }
    @Override
    public void createCuenta(Cuenta cuenta) {
        registroActivityInteractor.createCuenta(cuenta);
    }

    @Override
    public void showResult(List<Cuenta> cuentaList) {
        registerActivityView.showResult(cuentaList);

    }

    @Override
    public void showError(String mensj) {
        registerActivityView.showError(mensj);
    }
}
