package com.example.ejercicio7mvp;

public class Presentador {
    private Modelo modelo;
    private VistaPresentador vistaPresentador;

    public Presentador(VistaPresentador vistaPresentador) {
        this.vistaPresentador = vistaPresentador;

        modelo = new Modelo();
    }

    public void evaluarContrasena(String password) {

        int nivelFuerza = modelo.validarClave(password);

        if (nivelFuerza == Modelo.Debil) {
           this.vistaPresentador.mostrarDebil();
        } else if (nivelFuerza == Modelo.Media) {
            this.vistaPresentador.mostrarMedia();

        }else if (nivelFuerza == Modelo.Fuerte) {
            this.vistaPresentador.mostrarFuerte();

        }else {

            this.vistaPresentador.mostrarError();

        }
    }


}