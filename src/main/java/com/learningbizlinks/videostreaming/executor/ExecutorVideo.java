package com.learningbizlinks.videostreaming.executor;

import com.learningbizlinks.videostreaming.videos.VideoConsole;

public class ExecutorVideo {

    private VideoConsole video;

    public ExecutorVideo(VideoConsole video) {
        this.video = video;
    }

    public void run(){
        //validamos que el video se esta ejecutando mostrandolo en pantalla
        System.out.println("Ejecutador video: " + video);

        //Acciones del juego
        video.reproducir();
        video.pausar();
        video.detener();
        video.avanzar();
        video.retroceder();
    }
}
