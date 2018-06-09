package com.example.davidr.proyectercergrado.Perfil;


import android.support.v4.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.example.davidr.proyectercergrado.Ingreso.view.MainActivity;
import com.example.davidr.proyectercergrado.R;
import com.squareup.picasso.Picasso;

import de.hdodenhof.circleimageview.CircleImageView;


public class ProfileFragment extends Fragment implements  ProfileFragmentView{

    SharedPreferences sharedPreferences;
    CircleImageView circleImageView;
    TextView textViewNameperf, textViewEmailperf;
    Switch aSwitchOut;

    public ProfileFragment(){}


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInsatceState) {
        final View view = inflater.inflate  (R.layout.fragment_profile, container, false);

        circleImageView = view.findViewById(R.id.iv_profileimage);
        textViewNameperf = view.findViewById(R.id.txv_profile_name);
        textViewEmailperf = view.findViewById(R.id.txv_profile_email);
        aSwitchOut = view.findViewById(R.id.sw_profile_offsesion);

        aSwitchOut.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    SignOff();
                } else {
                    Toast.makeText(getActivity(), "Se quito la seleccion", Toast.LENGTH_SHORT).show();
                }
            }
        });

        initSharedPreferences();
        return view;

    }

    public void initSharedPreferences(){
        sharedPreferences = this.getActivity().getSharedPreferences("PreferencesTurismoPlace", Context.MODE_PRIVATE);

        String imageProfile = sharedPreferences.getString("img", null);
        String nameProfile = sharedPreferences.getString("name", null);
        String emailProfile = sharedPreferences.getString("email", null);

        Picasso.get().load(imageProfile).into(circleImageView);
        textViewNameperf.setText(nameProfile);
        textViewEmailperf.setText(emailProfile);

    }

    @Override
    public void SignOff() {
        sharedPreferences = this.getActivity().getSharedPreferences("PreferencesTurismoPlace", Context.MODE_PRIVATE);
        sharedPreferences.edit().clear().commit();

        Intent intent = new Intent(this.getActivity(), MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }
}
