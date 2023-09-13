package com.learningbizlinks.videostreaming;
import com.learningbizlinks.videostreaming.game.ReproductorVideoDescargado;
import com.learningbizlinks.videostreaming.game.ReproductorVideoEnLinea;
import com.learningbizlinks.videostreaming.game.ReproductorVideoLocal;
import com.learningbizlinks.videostreaming.runner.ExecutorVideo;


public class VideoStreamingApplication {

	public static void main(String[] args) {
//		//Instancia del juego Mario
//		var marioGame = new MarioGame();
//
//		//Instancia  del juego Pacman
//		var pacmanGame = new PacmanGame();

		var videoDescargado = new ReproductorVideoDescargado();

		var videoEnLinea = new ReproductorVideoEnLinea();

		var videoLocal = new ReproductorVideoLocal();

		//Instancia del GameRunner (Ejecutor de juegos)
		var gameRunner = new ExecutorVideo(videoLocal);
		gameRunner.run();
	}

}
