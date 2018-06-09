package com.example.davidr.proyectercergrado.Registro.repository;

import android.util.Log;

import com.example.davidr.proyectercergrado.ApiRest.Adapter;
import com.example.davidr.proyectercergrado.ApiRest.Service;
import com.example.davidr.proyectercergrado.Registro.interactor.RegistroActivityInteractor;
import com.example.davidr.proyectercergrado.Registro.model.Cuenta;
import com.google.gson.Gson;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RegistroActivityRepositoryIm implements  RegistroActivityRepository {

    private RegistroActivityInteractor registroActivityInteractor;
    List<Cuenta> cuentaList;

    public RegistroActivityRepositoryIm(RegistroActivityInteractor registroActivityInteractor){
        this.registroActivityInteractor = registroActivityInteractor;
    }

    @Override
    public void createCuenta(Cuenta cuenta) {
        Adapter adapter = new Adapter();
        Service service = adapter.getClienteService();
        service.onSignUp(cuenta.getUser(), cuenta.getPassword(), cuenta.getName(), cuenta.getEmail()).enqueue(new Callback<List<Cuenta>>() {
            @Override
            public void onResponse(Call<List<Cuenta>> call, Response<List<Cuenta>> response) {
                cuentaList = response.body();
                registroActivityInteractor.proccesData(cuentaList);

                String json = new Gson().toJson(cuentaList);
                Log.d("CuentaPost", json);
            }

            @Override
            public void onFailure(Call<List<Cuenta>> call, Throwable t) {
                Log.d("CuentaPost", "error en la peticion");
            }
        });
    }
}
