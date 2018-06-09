package com.example.davidr.proyectercergrado.Registro.presenter;

import com.example.davidr.proyectercergrado.Registro.model.Cuenta;

import java.util.List;

public interface RegistroActivityPresenter {
    void createCuenta(Cuenta cuenta);
    void showResult(List<Cuenta> cuentaList);
    void showError(String mensj);
}
