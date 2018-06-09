package com.example.davidr.proyectercergrado.Parques.interactor;

import android.support.v4.app.FragmentManager;

import com.example.davidr.proyectercergrado.Parques.model.Parque;
import com.example.davidr.proyectercergrado.Places.model.Place;

import java.util.List;

public interface ParqueFragmentInteractor {

    void getDataParque();
    void showResultParque(List<Parque> placeList);
}
