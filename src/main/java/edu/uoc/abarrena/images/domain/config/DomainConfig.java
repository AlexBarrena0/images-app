package edu.uoc.abarrena.images.domain.config;

import edu.uoc.abarrena.images.domain.repository.ImageRepository;
import edu.uoc.abarrena.images.domain.service.ImageService;
import edu.uoc.abarrena.images.domain.service.impl.ImageServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DomainConfig {

    @Bean
    public ImageService imageService(ImageRepository imageRepository) {
        return new ImageServiceImpl(imageRepository);
    }
}
