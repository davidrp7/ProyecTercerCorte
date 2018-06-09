package com.example.davidr.proyectercergrado.Registro.model;

public class Cuenta {

    private String user;
    private String password;
    private String name;
    private String email;
    private String repassword;

    public Cuenta(String user, String password, String name, String email, String repassword)
    {
        this.user = user;
        this.password = password;
        this.name = name;
        this.email = email;
        this.repassword = repassword;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRepassword() {
        return repassword;
    }

    public void setRepassword(String repassword) {
        this.repassword = repassword;
    }
}
