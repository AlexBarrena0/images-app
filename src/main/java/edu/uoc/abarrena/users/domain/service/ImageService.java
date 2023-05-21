package edu.uoc.abarrena.users.domain.service;

import edu.uoc.abarrena.users.domain.model.Image;

public interface ImageService {

    /**
     * Save an image
     * @param image to save
     * @return the id of the saved image
     */
    public Long createImage(Image image);

    /**
     * Finds an image by its id
     * @param id of the image to find
     * @return the image content with the given id
     */
    public byte[] findImageById(Long id);

    /**
     * Updates an image
     * @param image to update
     */
    public void updateImage(Image image);

    /**
     * Deletes an image
     * @param id of the image to delete
     */
    public void deleteImage(Long id);
}
