package com.example.davidr.proyectercergrado.Ingreso.interactor;

import com.example.davidr.proyectercergrado.Ingreso.model.Ingreso;
import com.example.davidr.proyectercergrado.Ingreso.presenter.IngresoActivityPresenter;
import com.example.davidr.proyectercergrado.Ingreso.repository.IngresoActivityRepository;
import com.example.davidr.proyectercergrado.Ingreso.repository.IngresoActivityRepositoryIm;

import java.util.List;

public class IngresoActivityInteractorIm implements IngresoActivityInteractor {
    private IngresoActivityPresenter ingresoActivityPresenter;
    private IngresoActivityRepository ingresoActivityRepository;

    public IngresoActivityInteractorIm(IngresoActivityPresenter ingresoActivityPresenter){
        this.ingresoActivityPresenter = ingresoActivityPresenter;
        ingresoActivityRepository = new IngresoActivityRepositoryIm(this);

    }

    @Override
    public void signIn(String user, String pass) {

        if ("".equals(user) || "".equals(pass)){
            ingresoActivityPresenter.showError("Debe llenar todos los campos");
        } else {
            ingresoActivityRepository.signIn(user, pass);
        }

    }

    @Override
    public void processData(List<Ingreso> ingresoList) {
        Boolean searchUser = ingresoList.get(0).isSearchUser();

        if (searchUser){
            ingresoActivityPresenter.showResult(ingresoList);
        }else{
            ingresoActivityPresenter.showError("El usuario no esta registrado");
        }
    }
}
