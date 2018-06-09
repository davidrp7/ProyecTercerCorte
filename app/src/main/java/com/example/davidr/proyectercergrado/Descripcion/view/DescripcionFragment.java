package com.example.davidr.proyectercergrado.Descripcion.view;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import com.example.davidr.proyectercergrado.Descripcion.adapter.DescripcionAdapter;
import com.example.davidr.proyectercergrado.Descripcion.model.Descripcion;
import com.example.davidr.proyectercergrado.Descripcion.presenter.DescripcionFragmentPresenter;
import com.example.davidr.proyectercergrado.Descripcion.presenter.DescripcionFragmentPresenterIm;
import com.example.davidr.proyectercergrado.R;

import java.util.List;

public class DescripcionFragment extends Fragment implements DescripcionFragmentView{

    private DescripcionFragmentPresenter descripcionFragmentPresenter;
    ProgressBar progressBarPlace;
    RecyclerView recyclerViewPlace;

    public DescripcionFragment(){}

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_favorites, container, false);

        progressBarPlace = (ProgressBar) view.findViewById(R.id.pb_favorites);
        recyclerViewPlace = (RecyclerView) view.findViewById(R.id.rcv_favorites);

        recyclerViewPlace.setLayoutManager(new LinearLayoutManager(getContext()));

        descripcionFragmentPresenter = new DescripcionFragmentPresenterIm(this);

        progressBarPlace.setVisibility(View.VISIBLE);
        descripcionFragmentPresenter.getDescripPlace();

        return view;
    }

    @Override
    public void showDescripPlace(List<Descripcion> descripcionList) {
        progressBarPlace.setVisibility(View.GONE);
        recyclerViewPlace.setAdapter(new DescripcionAdapter(descripcionList, getContext()));
    }
}
