package com.example.davidr.proyectercergrado.Ingreso.presenter;

import com.example.davidr.proyectercergrado.Ingreso.model.Ingreso;

import java.util.List;

public interface IngresoActivityPresenter{

    void signIn(String user, String pass);
    void showResult(List<Ingreso> ingresoList);
    void showError(String error);


}
