package com.example.ejercicio7mvp;

public class Presentador {
    private Modelo modelo;

    public void evaluarclave(String password){
       int  nivelFuerza=modelo.validarClave(password);
       if (nivelFuerza==Modelo.Debil){
    }else (nivelFuerza==Modelo.Media){


        }else (nivelFuerza==Modelo.Fuerte){

        }else {

        }
}}
