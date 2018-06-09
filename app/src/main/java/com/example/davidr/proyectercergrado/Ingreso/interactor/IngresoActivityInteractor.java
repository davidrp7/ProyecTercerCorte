package com.example.davidr.proyectercergrado.Ingreso.interactor;

import com.example.davidr.proyectercergrado.Ingreso.model.Ingreso;

import java.util.List;

public interface IngresoActivityInteractor {

    void signIn(String user, String pass);
    void processData(List<Ingreso> ingresoList);

}
