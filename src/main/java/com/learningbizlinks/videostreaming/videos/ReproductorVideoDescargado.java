package com.learningbizlinks.videostreaming.videos;

public class ReproductorVideoDescargado implements VideoConsole {

    public void reproducir() {
        System.out.println("Reproduciendo el video descargado");
    }

    public void pausar() {
        System.out.println("Pausando el video descargado");
    }

    public void detener() {
        System.out.println("Deteniendo el video descargado");
    }

    public void avanzar() {
        System.out.println("Avanzando el video descargado");
    }

    public void retroceder() {
        System.out.println("Retrocediendo el video descargado");
    }
}
