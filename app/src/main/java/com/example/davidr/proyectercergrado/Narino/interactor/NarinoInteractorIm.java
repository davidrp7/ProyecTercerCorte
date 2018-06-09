package com.example.davidr.proyectercergrado.Narino.interactor;

import com.example.davidr.proyectercergrado.Narino.model.Narino;
import com.example.davidr.proyectercergrado.Narino.presenter.NarinoPresenter;
import com.example.davidr.proyectercergrado.Narino.repository.NarinoRepository;
import com.example.davidr.proyectercergrado.Narino.repository.NarinoRepositoryIm;

import java.util.List;

public class NarinoInteractorIm implements NarinoInteractor {


    private NarinoPresenter narinoPresenter;
    private NarinoRepository narinoRepository;

    public NarinoInteractorIm(NarinoPresenter narinoPresenter) {
        this.narinoPresenter = narinoPresenter;
        narinoRepository = new NarinoRepositoryIm(this);
    }

    @Override
    public void getDataNar() {
        narinoRepository.getDataNar();
    }

    @Override
    public void showResultNar(List<Narino> narinoList) {

        narinoPresenter.showResultNar(narinoList);
    }
}
