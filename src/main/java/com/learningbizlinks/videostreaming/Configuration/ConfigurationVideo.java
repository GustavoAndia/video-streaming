package com.learningbizlinks.videostreaming.Configuration;

import com.learningbizlinks.videostreaming.executor.ExecutorVideo;
import com.learningbizlinks.videostreaming.videos.ReproductorVideoDescargado;
import com.learningbizlinks.videostreaming.videos.ReproductorVideoEnLinea;
import com.learningbizlinks.videostreaming.videos.ReproductorVideoLocal;
import com.learningbizlinks.videostreaming.videos.VideoConsole;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationVideo {

    @Bean
    public ReproductorVideoLocal reproductorVideoLocal(){
        return new ReproductorVideoLocal();
    }

    @Bean
    public ReproductorVideoEnLinea reproductorVideoEnLinea(){
        return new ReproductorVideoEnLinea();
    }

    @Bean
    public ReproductorVideoDescargado reproductorVideoDescargado(){
        return new ReproductorVideoDescargado();
    }

    @Bean
    public ExecutorVideo executorVideo(
            @Qualifier("reproductorVideoLocal")
            VideoConsole video) {
        return new ExecutorVideo(video);
    }
}
