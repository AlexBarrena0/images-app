package edu.uoc.abarrena.images.infrastructure.repository.mybatis;

import edu.uoc.abarrena.images.domain.converter.ImageConverter;
import edu.uoc.abarrena.images.domain.model.Image;
import edu.uoc.abarrena.images.domain.repository.ImageRepository;
import edu.uoc.abarrena.images.infrastructure.repository.mybatis.entity.ImageEntity;
import edu.uoc.abarrena.images.infrastructure.repository.mybatis.mapper.ImageMapper;

public class ImageRepositoryImpl implements ImageRepository {

    private final ImageMapper imageMapper;

    public ImageRepositoryImpl(ImageMapper imageMapper) {
        this.imageMapper = imageMapper;
    }

    @Override
    public Long save(Image image) {
        ImageEntity imageEntity = ImageConverter.INSTANCE.toEntity(image);
        imageMapper.save(imageEntity);
        return imageEntity.getId();
    }

    @Override
    public Image findById(Long id) {
        return ImageConverter.INSTANCE.toDomain(imageMapper.findById(id));
    }

    @Override
    public void delete(Long id) {
        imageMapper.delete(id);
    }
}
