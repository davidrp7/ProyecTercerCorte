package com.example.davidr.proyectercergrado.Ingreso.repository;

import com.example.davidr.proyectercergrado.ApiRest.Adapter;
import com.example.davidr.proyectercergrado.ApiRest.Service;
import com.example.davidr.proyectercergrado.Ingreso.interactor.IngresoActivityInteractor;
import com.example.davidr.proyectercergrado.Ingreso.model.Ingreso;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class IngresoActivityRepositoryIm  implements IngresoActivityRepository{

    private IngresoActivityInteractor ingresoActivityInteractor;
    List<Ingreso> ingresoList;

    public IngresoActivityRepositoryIm(IngresoActivityInteractor ingresoActivityInteractor){
        this.ingresoActivityInteractor = ingresoActivityInteractor;
    }

    @Override
    public void signIn(String user, String pass) {

        Adapter adapter = new Adapter();
        Service service = adapter.getClienteService();
        service.onSignIn(user, pass).enqueue(new Callback<List<Ingreso>>() {
            @Override
            public void onResponse(Call<List<Ingreso>> call, Response<List<Ingreso>> response) {
                ingresoList = response.body();
                ingresoActivityInteractor.processData(ingresoList);
            }

            @Override
            public void onFailure(Call<List<Ingreso>> call, Throwable t) {

            }
        });
    }
}
