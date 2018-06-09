package com.example.davidr.proyectercergrado.Registro.interactor;

import com.example.davidr.proyectercergrado.Registro.model.Cuenta;

import java.util.List;

public interface RegistroActivityInteractor {
    void createCuenta(Cuenta cuenta);
    void proccesData (List<Cuenta>cuentaList);
    void showError(String mensj);

}
