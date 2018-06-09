package com.example.davidr.proyectercergrado.Places.presenter;

import android.support.v4.app.FragmentManager;

import com.example.davidr.proyectercergrado.Places.interactor.PlacesFragmentInteractor;
import com.example.davidr.proyectercergrado.Places.interactor.PlacesFragmentInteractorIm;
import com.example.davidr.proyectercergrado.Places.model.Place;
import com.example.davidr.proyectercergrado.Places.view.PlacesFragmentView;

import java.util.List;

public class PlacesFragmentPresenterIm implements PlacesFragmentPresenter {

    private PlacesFragmentView placesFragmentView;
    private PlacesFragmentInteractor placesFragmentInteractor;

    public PlacesFragmentPresenterIm(PlacesFragmentView placesFragmentView){
        this.placesFragmentView = placesFragmentView;
        placesFragmentInteractor = new PlacesFragmentInteractorIm(this);
    }

    @Override
    public void showResultPlace(List<Place> placeList) {
        placesFragmentView.showResultPlace(placeList);

    }

    @Override
    public void getDataPlace() {
        placesFragmentInteractor.getDataPlace();

    }
}
