package com.example.davidr.proyectercergrado.Registro.view;

import com.example.davidr.proyectercergrado.Registro.model.Cuenta;

import java.util.List;

public interface RegisterActivityView {
    void showResult(List<Cuenta> cuentaList);
    void showError(String mensj);
}
