package com.example.davidr.proyectercergrado.ApiRest;

import com.example.davidr.proyectercergrado.Descripcion.model.Descripcion;
import com.example.davidr.proyectercergrado.Ingreso.model.Ingreso;
import com.example.davidr.proyectercergrado.Parques.model.Parque;
import com.example.davidr.proyectercergrado.Places.model.Place;
import com.example.davidr.proyectercergrado.Registro.model.Cuenta;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface Service {

    @POST(Constants.URL_POST_LOGIN)
    @FormUrlEncoded
    Call<List<Ingreso>> onSignIn(@Field("user") String user, @Field("pass") String pass);

    @POST(Constants.URL_POST_SIGNUP)
    @FormUrlEncoded
    Call<List<Cuenta>> onSignUp(
            @Field("user") String user,
            @Field("pass") String pass,
            @Field("name") String name,
            @Field("email") String email);

    @GET(Constants.URL_GET_PLACES)
    Call<List<Place>> getDataPlace();


    @GET(Constants.URLG_GET_PARQUES)
    Call<List<Parque>> getDataParque();

    @GET(Constants.URL_GET_DESCRIPCION)
    Call<List<Descripcion>> getDescripPlace();

    @GET(Constants.URL_GET_FAVO)
    Call<List<Descripcion>> getDataFavo();




}




