package edu.uoc.abarrena.users.domain.config;

import edu.uoc.abarrena.users.domain.repository.ImageRepository;
import edu.uoc.abarrena.users.domain.service.ImageService;
import edu.uoc.abarrena.users.domain.service.impl.ImageServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DomainConfig {

    @Bean
    public ImageService imageService(ImageRepository imageRepository) {
        return new ImageServiceImpl(imageRepository);
    }
}
