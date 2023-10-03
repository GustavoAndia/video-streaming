package com.learningbizlinks.videostreaming;

import com.learningbizlinks.videostreaming.videos.ReproductorVideoDescargado;
import com.learningbizlinks.videostreaming.videos.ReproductorVideoEnLinea;
import com.learningbizlinks.videostreaming.videos.ReproductorVideoLocal;
import com.learningbizlinks.videostreaming.executor.ExecutorVideo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class VideoStreamingApplication {

	public static void main(String[] args) {

		var videoDescargado = new ReproductorVideoDescargado();

		var videoEnLinea = new ReproductorVideoEnLinea();

		var videoLocal = new ReproductorVideoLocal();

		//Instancia del videoExecutor (Ejecutor de video)
		var videoExecutor = new ExecutorVideo(videoLocal);
		videoExecutor.run();

	}

}
