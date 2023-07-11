package com.example.ejercicio7mvp;

public class Modelo {
    public static final int Debil =0;
    public static final int Media =1;
    public static final int Fuerte =2;


    public int validarClave(String password){
       if(password.length() <5){

           return Debil;
       }
    }else if (password.equals(password.tolowerCase()))

    {
        return MEdia;


    }else{
     return Fuerte;
    }
}