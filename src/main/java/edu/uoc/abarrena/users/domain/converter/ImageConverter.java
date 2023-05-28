package edu.uoc.abarrena.users.domain.converter;

import edu.uoc.abarrena.users.application.dto.response.ImageDto;
import edu.uoc.abarrena.users.domain.model.Image;
import edu.uoc.abarrena.users.infrastructure.repository.mybatis.entity.ImageEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ImageConverter {

    public static final ImageConverter INSTANCE = Mappers.getMapper(ImageConverter.class);

    ImageEntity toEntity(Image image);
    Image toDomain(ImageEntity imageEntity);
    ImageDto toDto(Image image);
}
