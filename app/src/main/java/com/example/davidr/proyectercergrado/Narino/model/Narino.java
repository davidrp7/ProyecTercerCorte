package com.example.davidr.proyectercergrado.Narino.model;

public class Narino
{
    private Integer id;
    private String etiq, lema, imgband, imagescud, descrip;

    public Narino(Integer id, String etiq, String lema, String imgband, String imagescud, String descrip){

        this.id = id;
        this.etiq = etiq;
        this.lema = lema;
        this.imgband = imgband;
        this.imagescud = imagescud;
        this.descrip = descrip;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEtiq() {
        return etiq;
    }

    public void setEtiq(String etiq) {
        this.etiq = etiq;
    }

    public String getLema() {
        return lema;
    }

    public void setLema(String lema) {
        this.lema = lema;
    }

    public String getImgband() {
        return imgband;
    }

    public void setImgband(String imgband) {
        this.imgband = imgband;
    }

    public String getImagescud() {
        return imagescud;
    }

    public void setImagescud(String imagescud) {
        this.imagescud = imagescud;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }
}
