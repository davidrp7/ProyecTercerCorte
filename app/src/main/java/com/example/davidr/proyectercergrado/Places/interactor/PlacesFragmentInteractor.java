package com.example.davidr.proyectercergrado.Places.interactor;

import android.support.v4.app.FragmentManager;

import com.example.davidr.proyectercergrado.Places.model.Place;

import java.util.List;

public interface PlacesFragmentInteractor {
    void getDataPlace();
    void showResultPlace(List<Place>placeList);
}
