package com.example.davidr.proyectercergrado.Places.repository;

import com.example.davidr.proyectercergrado.ApiRest.Adapter;
import com.example.davidr.proyectercergrado.ApiRest.Service;
import com.example.davidr.proyectercergrado.Places.interactor.PlacesFragmentInteractor;
import com.example.davidr.proyectercergrado.Places.model.Place;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PlacesFragmentRepositoryIm implements  PlacesFragmentRepository{

    private PlacesFragmentInteractor placesFragmentInteractor;
    List<Place> placeList;

    public PlacesFragmentRepositoryIm(PlacesFragmentInteractor placesFragmentInteractor){
        this.placesFragmentInteractor = placesFragmentInteractor;
    }

    @Override
    public void getDataPlace() {
        Adapter adapter = new Adapter();
        Service service = adapter.getClienteService();

        final Call<List<Place>> places = service.getDataPlace();
        places.enqueue(new Callback<List<Place>>() {
            @Override
            public void onResponse(Call<List<Place>> call, Response<List<Place>> response) {
                placeList = response.body();
                placesFragmentInteractor.showResultPlace(placeList);
            }

            @Override
            public void onFailure(Call<List<Place>> call, Throwable t) {
            }
        });
    }
}
