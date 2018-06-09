package com.example.davidr.proyectercergrado.Ingreso.view;

import com.example.davidr.proyectercergrado.Ingreso.model.Ingreso;

import java.util.List;

public interface MainActivityView {
    void showResult(List<Ingreso> ingresoList);
    void showError(String error);
}

