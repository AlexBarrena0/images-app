package edu.uoc.abarrena.images.domain.converter;

import edu.uoc.abarrena.images.application.dto.response.ImageDto;
import edu.uoc.abarrena.images.domain.model.Image;
import edu.uoc.abarrena.images.infrastructure.repository.mybatis.entity.ImageEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ImageConverter {

    ImageConverter INSTANCE = Mappers.getMapper(ImageConverter.class);

    ImageEntity toEntity(Image image);

    Image toDomain(ImageEntity imageEntity);

    ImageDto toDto(Image image);
}
