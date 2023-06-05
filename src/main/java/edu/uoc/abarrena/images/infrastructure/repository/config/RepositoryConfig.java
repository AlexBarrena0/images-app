package edu.uoc.abarrena.images.infrastructure.repository.config;

import edu.uoc.abarrena.images.domain.repository.ImageRepository;
import edu.uoc.abarrena.images.infrastructure.repository.mybatis.ImageRepositoryImpl;
import edu.uoc.abarrena.images.infrastructure.repository.mybatis.mapper.ImageMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RepositoryConfig {

    @Bean
    public ImageRepository imageRepository(ImageMapper imageMapper) {
        return new ImageRepositoryImpl(imageMapper);
    }
}
