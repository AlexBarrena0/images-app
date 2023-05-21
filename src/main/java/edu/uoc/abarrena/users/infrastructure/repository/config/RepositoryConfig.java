package edu.uoc.abarrena.users.infrastructure.repository.config;

import edu.uoc.abarrena.users.domain.repository.ImageRepository;
import edu.uoc.abarrena.users.infrastructure.repository.mybatis.ImageRepositoryImpl;
import edu.uoc.abarrena.users.infrastructure.repository.mybatis.mapper.ImageMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RepositoryConfig {

    @Bean
    public ImageRepository imageRepository(ImageMapper imageMapper) {
        return new ImageRepositoryImpl(imageMapper);
    }
}
