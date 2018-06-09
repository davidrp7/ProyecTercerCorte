package com.example.davidr.proyectercergrado.Parques.model;

public class Parque {
    private Integer id;
    private String title, ubc, img, desc;

    public Parque(Integer id, String title, String ubc, String img, String desc){

        this.id = id;
        this.title = title;
        this.ubc = ubc;
        this.img = img;
        this.desc = desc;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUbc() {
        return ubc;
    }

    public void setUbc(String ubc) {
        this.ubc = ubc;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
