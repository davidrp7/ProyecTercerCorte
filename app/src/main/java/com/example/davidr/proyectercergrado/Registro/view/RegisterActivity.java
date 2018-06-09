package com.example.davidr.proyectercergrado.Registro.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.Toolbar;

import com.example.davidr.proyectercergrado.HomePlaces.view.CardActivity;
import com.example.davidr.proyectercergrado.Ingreso.view.MainActivity;
import com.example.davidr.proyectercergrado.R;
import com.example.davidr.proyectercergrado.Registro.model.Cuenta;
import com.example.davidr.proyectercergrado.Registro.presenter.RegistroActivityPresenter;
import com.example.davidr.proyectercergrado.Registro.presenter.RegistroActivityPresenterIm;

import java.util.List;

public class RegisterActivity extends AppCompatActivity implements RegisterActivityView {

    private RegistroActivityPresenter registroActivityPresenter;
    SharedPreferences sharedPreferences;
    TextInputEditText textInputEditTextName, textInputEditTextEmail, textInputEditTextUser, textInputEditTextPass, textInputEditTextPassconf;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        registroActivityPresenter = new RegistroActivityPresenterIm(this);
        textInputEditTextName = findViewById(R.id.txv_name_register);
        textInputEditTextEmail = findViewById(R.id.txv_email_register);
        textInputEditTextUser = findViewById(R.id.txv_username_register);
        textInputEditTextPass = findViewById(R.id.txv_password_register);
        textInputEditTextPassconf = findViewById(R.id.txv_passwordconf_register);
    }


    public void clickCrear(View view) {
        Cuenta cuenta = new Cuenta(
                textInputEditTextName.getText().toString(),
                textInputEditTextEmail.getText().toString(),
                textInputEditTextUser.getText().toString(),
                textInputEditTextPass.getText().toString(),
                textInputEditTextPassconf.getText().toString()
        );
        registroActivityPresenter.createCuenta(cuenta);
        }

    @Override
    public void showResult(List<Cuenta> cuentaList) {

        sharedPreferences = getSharedPreferences("PreferencesTurismoPlace", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putString("email", textInputEditTextEmail.getText().toString());
        editor.putString("name", textInputEditTextName.getText().toString());
        editor.putString("user", textInputEditTextUser.getText().toString());
        editor.putString("password", textInputEditTextPass.getText().toString());
        editor.putBoolean("persistence",true);

        editor.commit();

        Intent intent = new Intent(this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);

    }

    @Override
    public void showError(String mensj) {
        Toast.makeText(this, mensj, Toast.LENGTH_SHORT).show();
    }

}
