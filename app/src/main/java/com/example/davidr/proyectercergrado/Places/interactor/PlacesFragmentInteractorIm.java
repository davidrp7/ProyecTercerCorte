package com.example.davidr.proyectercergrado.Places.interactor;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.example.davidr.proyectercergrado.Descripcion.view.DescripcionFragment;
import com.example.davidr.proyectercergrado.Places.model.Place;
import com.example.davidr.proyectercergrado.Places.presenter.PlacesFragmentPresenter;
import com.example.davidr.proyectercergrado.Places.repository.PlacesFragmentRepository;
import com.example.davidr.proyectercergrado.Places.repository.PlacesFragmentRepositoryIm;
import com.example.davidr.proyectercergrado.R;

import java.util.List;

public class PlacesFragmentInteractorIm implements PlacesFragmentInteractor {

    private PlacesFragmentPresenter placesFragmentPresenter;
    private PlacesFragmentRepository placesFragmentRepository;

    public PlacesFragmentInteractorIm(PlacesFragmentPresenter placesFragmentPresenter) {
        this.placesFragmentPresenter = placesFragmentPresenter;
        placesFragmentRepository = new PlacesFragmentRepositoryIm(this);
    }

    @Override
    public void getDataPlace() {
        placesFragmentRepository.getDataPlace();
    }

    @Override
    public void showResultPlace(List<Place> placeList) {
        placesFragmentPresenter.showResultPlace(placeList);
    }
}