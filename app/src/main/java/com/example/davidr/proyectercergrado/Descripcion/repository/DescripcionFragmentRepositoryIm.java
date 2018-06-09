package com.example.davidr.proyectercergrado.Descripcion.repository;

import com.example.davidr.proyectercergrado.ApiRest.Adapter;
import com.example.davidr.proyectercergrado.ApiRest.Service;
import com.example.davidr.proyectercergrado.Descripcion.adapter.DescripcionAdapter;
import com.example.davidr.proyectercergrado.Descripcion.interactor.DescripcionFragmentInteractor;
import com.example.davidr.proyectercergrado.Descripcion.interactor.DescripcionFragmentInteractorIm;
import com.example.davidr.proyectercergrado.Descripcion.model.Descripcion;
import com.example.davidr.proyectercergrado.Places.model.Place;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DescripcionFragmentRepositoryIm implements DescripcionFragmentRepository {


    private DescripcionFragmentInteractor descripcionFragmentInteractor;
    List <Descripcion> descripcionList;

    public DescripcionFragmentRepositoryIm(DescripcionFragmentInteractor descripcionFragmentInteractor){
        this.descripcionFragmentInteractor = descripcionFragmentInteractor;
    }

    @Override
    public void getDescripPlace() {
        Adapter adapter = new Adapter();
        Service service = adapter.getClienteService();

        final Call<List<Descripcion>> descripcion = service.getDescripPlace();
        descripcion.enqueue(new Callback<List<Descripcion>>() {
            @Override
            public void onResponse(Call<List<Descripcion>> call, Response<List<Descripcion>> response) {
                descripcionList = response.body();
                descripcionFragmentInteractor.showDescripPlace(descripcionList);

            }

            @Override
            public void onFailure(Call<List<Descripcion>> call, Throwable t) {

            }
        });
    }

}
