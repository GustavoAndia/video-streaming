package com.learningbizlinks.videostreaming.videos;

public class ReproductorVideoLocal implements VideoConsole {

    public void reproducir() {
        System.out.println("Reproduciendo el video local");
    }

    public void pausar() {
        System.out.println("Pausando el video local");
    }

    public void detener() {
        System.out.println("Deteniendo el video local");
    }

    public void avanzar() {
        System.out.println("Avanzando el video local");
    }

    public void retroceder() {
        System.out.println("Retrocediendo el video local");
    }
}
