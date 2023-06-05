package edu.uoc.abarrena.images.domain.service.impl;

import edu.uoc.abarrena.images.domain.exceptions.EntityNotFoundException;
import edu.uoc.abarrena.images.domain.model.Image;
import edu.uoc.abarrena.images.domain.repository.ImageRepository;
import edu.uoc.abarrena.images.domain.service.ImageService;

public class ImageServiceImpl implements ImageService {

    private final ImageRepository imageRepository;

    public ImageServiceImpl(ImageRepository imageRepository) {
        this.imageRepository = imageRepository;
    }

    @Override
    public Long createImage(Image image) {
        return imageRepository.save(image);
    }

    @Override
    public Image findImageById(Long id) throws EntityNotFoundException {
        Image image = imageRepository.findById(id);
        if (image == null) {
            throw new EntityNotFoundException("Image not found");
        }
        return image;
    }

    @Override
    public void deleteImage(Long id) {
        imageRepository.delete(id);
    }
}
