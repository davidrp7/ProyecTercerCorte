package com.example.davidr.proyectercergrado.Parques.view;

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

import com.example.davidr.proyectercergrado.Parques.adapter.ParqueAdapter;
import com.example.davidr.proyectercergrado.Parques.model.Parque;
import com.example.davidr.proyectercergrado.Parques.presenter.ParqueFragmentPresenter;
import com.example.davidr.proyectercergrado.Parques.presenter.ParqueFragmentPresenterIm;
import com.example.davidr.proyectercergrado.R;

import java.util.List;

public class ParqueFragment extends Fragment implements ParqueFragmentView {



    private ParqueFragmentPresenter parqueFragmentPresenter;
    ProgressBar progressBarPlace;
    RecyclerView recyclerViewPlace;

    public ParqueFragment(){

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_parques, container, false);

        progressBarPlace = (ProgressBar) view.findViewById(R.id.pb_parques);
        recyclerViewPlace = (RecyclerView) view.findViewById(R.id.rcv_parques);

        recyclerViewPlace.setLayoutManager(new LinearLayoutManager(getContext()));

        parqueFragmentPresenter = new ParqueFragmentPresenterIm(this);

        progressBarPlace.setVisibility(View.VISIBLE);
        parqueFragmentPresenter.getDataParque();

        return view;
    }

    @Override
    public void showResultParque(List<Parque> parqueList) {
        progressBarPlace.setVisibility(View.GONE);
        recyclerViewPlace.setAdapter(new ParqueAdapter(parqueList, getContext()));

    }
}
