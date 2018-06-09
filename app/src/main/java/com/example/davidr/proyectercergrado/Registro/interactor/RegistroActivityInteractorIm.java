package com.example.davidr.proyectercergrado.Registro.interactor;

import com.example.davidr.proyectercergrado.Registro.model.Cuenta;
import com.example.davidr.proyectercergrado.Registro.presenter.RegistroActivityPresenter;
import com.example.davidr.proyectercergrado.Registro.repository.RegistroActivityRepository;
import com.example.davidr.proyectercergrado.Registro.repository.RegistroActivityRepositoryIm;

import java.util.List;

public class RegistroActivityInteractorIm implements RegistroActivityInteractor {

    private RegistroActivityPresenter registroActivityPresenter;
    private RegistroActivityRepository registroActivityRepository;

    public RegistroActivityInteractorIm(RegistroActivityPresenter registroActivityPresenter){
        this.registroActivityPresenter = registroActivityPresenter;
        registroActivityRepository = new RegistroActivityRepositoryIm(this);
    }

    @Override
    public void createCuenta(Cuenta cuenta) {
        registroActivityRepository.createCuenta(cuenta);
    }

    @Override
    public void proccesData(List<Cuenta> cuentaList) {
        registroActivityPresenter.showResult(cuentaList);
    }


    @Override
    public void showError(String mensj) {
        registroActivityPresenter.showError(mensj);
    }
}
