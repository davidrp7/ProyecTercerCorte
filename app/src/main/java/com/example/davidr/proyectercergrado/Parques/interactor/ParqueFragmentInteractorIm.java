package com.example.davidr.proyectercergrado.Parques.interactor;

import com.example.davidr.proyectercergrado.Parques.model.Parque;
import com.example.davidr.proyectercergrado.Parques.presenter.ParqueFragmentPresenter;
import com.example.davidr.proyectercergrado.Parques.repository.ParqueFragmentRepository;
import com.example.davidr.proyectercergrado.Parques.repository.ParqueFragmentRepositoryIm;
import com.example.davidr.proyectercergrado.Places.model.Place;

import java.util.List;

public class ParqueFragmentInteractorIm implements ParqueFragmentInteractor {

    private ParqueFragmentPresenter parqueFragmentPresenter;
    private ParqueFragmentRepository parqueFragmentRepository;

    public ParqueFragmentInteractorIm(ParqueFragmentPresenter parqueFragmentPresenter) {
        this.parqueFragmentPresenter = parqueFragmentPresenter;
        parqueFragmentRepository = new ParqueFragmentRepositoryIm(this);

    }

    @Override
    public void getDataParque() {
        parqueFragmentRepository.getDataParque();

    }

    @Override
    public void showResultParque(List<Parque> placeList) {
        parqueFragmentPresenter.showResultParque(placeList);
    }
}
