package com.learningbizlinks.videostreaming;
import com.learningbizlinks.videostreaming.videos.ReproductorVideoDescargado;
import com.learningbizlinks.videostreaming.videos.ReproductorVideoEnLinea;
import com.learningbizlinks.videostreaming.videos.ReproductorVideoLocal;
import com.learningbizlinks.videostreaming.executor.ExecutorVideo;


public class VideoStreamingApplication {

	public static void main(String[] args) {

		var videoDescargado = new ReproductorVideoDescargado();

		var videoEnLinea = new ReproductorVideoEnLinea();

		var videoLocal = new ReproductorVideoLocal();

		//Instancia del GameRunner (Ejecutor de juegos)
		var videoExecutor = new ExecutorVideo(videoLocal);
		videoExecutor.run();
	}

}
