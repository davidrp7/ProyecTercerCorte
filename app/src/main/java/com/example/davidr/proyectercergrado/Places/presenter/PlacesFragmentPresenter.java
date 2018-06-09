package com.example.davidr.proyectercergrado.Places.presenter;

import android.support.v4.app.FragmentManager;

import com.example.davidr.proyectercergrado.Places.model.Place;

import java.util.List;

public interface PlacesFragmentPresenter {
    void showResultPlace(List<Place> placeList);
    void getDataPlace();
}
