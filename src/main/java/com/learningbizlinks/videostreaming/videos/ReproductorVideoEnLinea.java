package com.learningbizlinks.videostreaming.videos;

import org.springframework.stereotype.Component;

@Component
public class ReproductorVideoEnLinea{

    public void reproducir() {
        System.out.println("Reproduciendo el video en línea");
    }

    public void pausar() {
        System.out.println("Pausando el video en línea");
    }

    public void detener() {
        System.out.println("Deteniendo el video en línea");
    }

    public void avanzar() {
        System.out.println("Avanzando el video en línea");
    }

    public void retroceder() {
        System.out.println("Retrocediendo el video en línea");
    }
}
