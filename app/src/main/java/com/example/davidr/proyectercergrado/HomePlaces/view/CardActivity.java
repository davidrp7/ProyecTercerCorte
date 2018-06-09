package com.example.davidr.proyectercergrado.HomePlaces.view;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.support.v4.app.FragmentManager;

import com.example.davidr.proyectercergrado.HomePlaces.presenter.CardActivityPresenter;
import com.example.davidr.proyectercergrado.HomePlaces.presenter.CardActivityPresenterIm;
import com.example.davidr.proyectercergrado.Ingreso.view.MainActivity;
import com.example.davidr.proyectercergrado.R;
import com.example.davidr.proyectercergrado.Utilidades.BottomNavigationViewHelper;

public class CardActivity extends AppCompatActivity implements CardActivityView{


    private CardActivityPresenter cardActivityPresenter;
    BottomNavigationView bottomNavigationView;
    FragmentManager fragmentManager;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card);

        cardActivityPresenter = new CardActivityPresenterIm(this);
        bottomNavigationView = (BottomNavigationView) findViewById(R.id.id_bnv_index);
        BottomNavigationViewHelper.removeShiftMode(bottomNavigationView);
        bottomNavigationView.setSelectedItemId(R.id.id_menubn_favorites);
        fragmentManager = getSupportFragmentManager();

        initSharedPreferences();

    }

    public void initSharedPreferences(){
        sharedPreferences = getSharedPreferences("PreferencesTurismoPlace", Context.MODE_PRIVATE);
        String user = sharedPreferences.getString("user", null);

        if ( (user == null) || (user.equals("")) ){
            Intent intent = new Intent(this, MainActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
        }else {
            initBottomNavigationView();
        }
    }

    private void initBottomNavigationView() {

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.id_menubn_places:
                        cardActivityPresenter.ChangeTab(0, fragmentManager);
                        break;
                    case R.id.id_menubn_profile:
                        cardActivityPresenter.ChangeTab(1, fragmentManager);
                        break;
                    case R.id.id_menubn_parks:
                        cardActivityPresenter.ChangeTab(2, fragmentManager);
                        break;
                    case R.id.id_menubn_favorites:
                        cardActivityPresenter.ChangeTab(3, fragmentManager);
                        break;
                    case R.id.id_menubn_homenar:
                        cardActivityPresenter.ChangeTab(4, fragmentManager);
                        break;
                }

                return true;
            }
        });
    }

    @Override
    public void showResult() {

    }
}
