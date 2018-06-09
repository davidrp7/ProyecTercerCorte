package com.example.davidr.proyectercergrado.Parques.presenter;

import com.example.davidr.proyectercergrado.Parques.model.Parque;

import java.util.List;

public interface ParqueFragmentPresenter {
    void showResultParque(List<Parque> parqueList);
    void getDataParque();
}
