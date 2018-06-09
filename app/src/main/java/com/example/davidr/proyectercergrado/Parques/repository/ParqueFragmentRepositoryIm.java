package com.example.davidr.proyectercergrado.Parques.repository;

import com.example.davidr.proyectercergrado.ApiRest.Adapter;
import com.example.davidr.proyectercergrado.ApiRest.Service;
import com.example.davidr.proyectercergrado.Parques.interactor.ParqueFragmentInteractor;
import com.example.davidr.proyectercergrado.Parques.model.Parque;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ParqueFragmentRepositoryIm implements ParqueFragmentRepository {


    private ParqueFragmentInteractor parqueFragmentInteractor;
    List<Parque> parqueList;

    public ParqueFragmentRepositoryIm(ParqueFragmentInteractor parqueFragmentInteractor){
        this.parqueFragmentInteractor = parqueFragmentInteractor;
    }


    @Override
    public void getDataParque() {

        Adapter adapter= new Adapter();
        Service service = adapter.getClienteService();

        final Call<List<Parque>> parques = service.getDataParque();
        parques.enqueue(new Callback<List<Parque>>() {
            @Override
            public void onResponse(Call<List<Parque>> call, Response<List<Parque>> response) {

                parqueList = response.body();
                parqueFragmentInteractor.showResultParque(parqueList);

            }

            @Override
            public void onFailure(Call<List<Parque>> call, Throwable t) {

            }
        });

    }
}
