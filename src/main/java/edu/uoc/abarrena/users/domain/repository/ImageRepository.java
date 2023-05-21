package edu.uoc.abarrena.users.domain.repository;

import edu.uoc.abarrena.users.domain.model.Image;

public interface ImageRepository {
    /**
     * Save an image
     * @param image to save
     * @return the id of the saved image
     */
    public Long save(Image image);

    /**
     * Finds an image by its id
     * @param id of the image to find
     * @return the image with the given id
     */
    public Image findById(Long id);

    /**
     * Updates an image
     * @param image to update
     */
    public void update(Image image);

    /**
     * Deletes an image
     * @param id of the image to delete
     */
    public void delete(Long id);
}
