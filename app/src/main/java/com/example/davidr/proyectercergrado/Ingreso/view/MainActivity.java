package com.example.davidr.proyectercergrado.Ingreso.view;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.davidr.proyectercergrado.HomePlaces.view.CardActivity;
import com.example.davidr.proyectercergrado.Ingreso.model.Ingreso;
import com.example.davidr.proyectercergrado.Ingreso.presenter.IngresoActivityPresenter;
import com.example.davidr.proyectercergrado.Ingreso.presenter.IngresoActivityPresenterIm;
import com.example.davidr.proyectercergrado.R;
import com.example.davidr.proyectercergrado.Registro.view.RegisterActivity;

import java.util.List;

public class MainActivity extends AppCompatActivity implements MainActivityView {

    private IngresoActivityPresenter ingresoActivityPresenter;
    SharedPreferences sharedPreferences;
    TextInputEditText textInputEditTextUserName;
    TextInputEditText textInputEditTextPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ingresoActivityPresenter = new IngresoActivityPresenterIm(this);
        textInputEditTextUserName = findViewById(R.id.txv_username_login);
        textInputEditTextPassword = findViewById(R.id.txv_password_login);
    }

    public void clickIngresar(View view) {
        ingresoActivityPresenter.signIn(textInputEditTextUserName.getText().toString(), textInputEditTextPassword.getText().toString());
    }

    @Override
    public void showResult(List<Ingreso> ingresoList) {

        sharedPreferences = getSharedPreferences("PreferencesTurismoPlace", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putString("email", ingresoList.get(0).getEmail());
        editor.putString("name", ingresoList.get(0).getName());
        editor.putString("user", ingresoList.get(0).getUser());
        editor.putString("img", ingresoList.get(0).getImg_user());
        editor.commit();

        Intent intent = new Intent(this, CardActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }

    @Override
    public void showError(String error) {
        Toast.makeText(this, error, Toast.LENGTH_SHORT).show();
    }


    public void clickpasarRegistro(View view) {
        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
    }
}
