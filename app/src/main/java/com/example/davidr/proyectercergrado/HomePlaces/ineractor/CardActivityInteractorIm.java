package com.example.davidr.proyectercergrado.HomePlaces.ineractor;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.example.davidr.proyectercergrado.Descripcion.view.DescripcionFragment;
import com.example.davidr.proyectercergrado.HomePlaces.presenter.CardActivityPresenter;
import com.example.davidr.proyectercergrado.Parques.view.ParqueFragment;
import com.example.davidr.proyectercergrado.Perfil.ProfileFragment;
import com.example.davidr.proyectercergrado.Places.view.PlacesFragment;
import com.example.davidr.proyectercergrado.R;

public class CardActivityInteractorIm implements CardActivityInteractor {

    private CardActivityPresenter cardActivityPresenter;

    public CardActivityInteractorIm(CardActivityPresenter cardActivityPresenter){
        this.cardActivityPresenter = cardActivityPresenter;
    }


    @Override
    public void ChangeTab(Integer position, FragmentManager fragmentManager) {
        switch (position){
            case 0:
                PlacesFragment placesFragment = new PlacesFragment();
                fragmentManager
                        .beginTransaction()
                        .replace(R.id.fl_index, placesFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                        .addToBackStack(null)
                        .commit();
                break;
            case 1:
                ProfileFragment profileFragment = new ProfileFragment();
                fragmentManager
                        .beginTransaction()
                        .replace(R.id.fl_index, profileFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                        .addToBackStack(null)
                        .commit();
                break;
            case 2:
                ParqueFragment parqueFragment = new ParqueFragment();
                fragmentManager
                        .beginTransaction()
                        .replace(R.id.fl_index, parqueFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                        .addToBackStack(null)
                        .commit();
                break;
            case 3:
                DescripcionFragment descripcionFragment = new DescripcionFragment();
                fragmentManager
                        .beginTransaction()
                        .replace(R.id.fl_index, descripcionFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                        .addToBackStack(null)
                        .commit();
                break;
        }
    }
}
