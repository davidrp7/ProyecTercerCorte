package com.example.davidr.proyectercergrado.Descripcion.interactor;

import com.example.davidr.proyectercergrado.Descripcion.model.Descripcion;
import com.example.davidr.proyectercergrado.Descripcion.presenter.DescripcionFragmentPresenter;
import com.example.davidr.proyectercergrado.Descripcion.repository.DescripcionFragmentRepository;
import com.example.davidr.proyectercergrado.Descripcion.repository.DescripcionFragmentRepositoryIm;

import java.util.List;

public class DescripcionFragmentInteractorIm implements  DescripcionFragmentInteractor {

    private DescripcionFragmentPresenter descripcionFragmentPresenter;
    private DescripcionFragmentRepository descripcionFragmentRepository;

    public DescripcionFragmentInteractorIm(DescripcionFragmentPresenter descripcionFragmentPresenter){

        this.descripcionFragmentPresenter = descripcionFragmentPresenter;
        descripcionFragmentRepository = new DescripcionFragmentRepositoryIm(this);
    }


    @Override
    public void getDescripPlace() {
        descripcionFragmentRepository.getDescripPlace();

    }

    @Override
    public void showDescripPlace(List<Descripcion> descripcionList) {
        descripcionFragmentPresenter.showDescripPlace(descripcionList);

    }
}
