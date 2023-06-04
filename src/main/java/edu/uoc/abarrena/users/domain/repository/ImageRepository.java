package edu.uoc.abarrena.users.domain.repository;

import edu.uoc.abarrena.users.domain.model.Image;

public interface ImageRepository {
    /**
     * Save an image
     *
     * @param image to save
     * @return the id of the saved image
     */
    Long save(Image image);

    /**
     * Finds an image by its id
     *
     * @param id of the image to find
     * @return the image with the given id
     */
    Image findById(Long id);

    /**
     * Deletes an image
     *
     * @param id of the image to delete
     */
    void delete(Long id);
}
