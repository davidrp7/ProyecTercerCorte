package com.example.davidr.proyectercergrado.Places.view;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import com.example.davidr.proyectercergrado.Descripcion.view.DescripcionFragment;
import com.example.davidr.proyectercergrado.Places.adapter.PlaceAdapter;
import com.example.davidr.proyectercergrado.Places.presenter.PlacesFragmentPresenterIm;
import com.example.davidr.proyectercergrado.R;
import com.example.davidr.proyectercergrado.Places.model.Place;
import com.example.davidr.proyectercergrado.Places.presenter.PlacesFragmentPresenter;

import java.util.List;

public class PlacesFragment extends Fragment implements PlacesFragmentView {

    private PlacesFragmentPresenter placesFragmentPresenter;
    ProgressBar progressBarPlace;
    RecyclerView recyclerViewPlace;

    public PlacesFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_places, container, false);

        progressBarPlace = (ProgressBar) view.findViewById(R.id.pb_places);
        recyclerViewPlace = (RecyclerView) view.findViewById(R.id.rcv_places);

        recyclerViewPlace.setLayoutManager(new LinearLayoutManager(getContext()));

        placesFragmentPresenter = new PlacesFragmentPresenterIm(this);

        progressBarPlace.setVisibility(View.VISIBLE);
        placesFragmentPresenter.getDataPlace();

        return view;
    }

    @Override
    public void showResultPlace(List<Place> placeList) {
        progressBarPlace.setVisibility(View.GONE);
        recyclerViewPlace.setAdapter(new PlaceAdapter(placeList, getContext()));
    }
}
