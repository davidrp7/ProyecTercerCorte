package com.example.davidr.proyectercergrado.Descripcion.presenter;

import com.example.davidr.proyectercergrado.Descripcion.interactor.DescripcionFragmentInteractor;
import com.example.davidr.proyectercergrado.Descripcion.interactor.DescripcionFragmentInteractorIm;
import com.example.davidr.proyectercergrado.Descripcion.model.Descripcion;
import com.example.davidr.proyectercergrado.Descripcion.view.DescripcionFragmentView;

import java.util.List;

public class DescripcionFragmentPresenterIm implements  DescripcionFragmentPresenter {

    private DescripcionFragmentView descripcionFragmentView;
    private DescripcionFragmentInteractor descripcionFragmentInteractor;

    public DescripcionFragmentPresenterIm(DescripcionFragmentView descripcionFragmentView){
        this.descripcionFragmentView = descripcionFragmentView;
        descripcionFragmentInteractor = new DescripcionFragmentInteractorIm(this);
    }

    @Override
    public void showDescripPlace(List<Descripcion> descripcionList) {
        descripcionFragmentView.showDescripPlace(descripcionList);

    }

    @Override
    public void getDescripPlace() {
        descripcionFragmentInteractor.getDescripPlace();

    }
}
