package com.example.davidr.proyectercergrado.Narino.repository;

import com.example.davidr.proyectercergrado.ApiRest.Adapter;
import com.example.davidr.proyectercergrado.ApiRest.Service;
import com.example.davidr.proyectercergrado.Narino.interactor.NarinoInteractor;
import com.example.davidr.proyectercergrado.Narino.model.Narino;
import com.example.davidr.proyectercergrado.Places.model.Place;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class NarinoRepositoryIm implements NarinoRepository {


    private NarinoInteractor narinoInteractor;
    List<Narino> narinoList;

    public NarinoRepositoryIm(NarinoInteractor narinoInteractor){
        this.narinoInteractor = narinoInteractor;
    }

    @Override
    public void getDataNar() {

    }
}
