package edu.uoc.abarrena.users.application.rest;

import edu.uoc.abarrena.users.application.dto.response.Result;
import edu.uoc.abarrena.users.domain.model.Image;
import edu.uoc.abarrena.users.domain.service.ImageService;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Log4j2
@RestController
@RequestMapping(ImageRestController.BASE_PATH)
public class ImageRestController {

    public static final String BASE_PATH = "/images";

    private final ImageService imageService;

    public ImageRestController(ImageService imageService) {
        this.imageService = imageService;
    }

    @PostMapping
    public Result<Long> createImage(@RequestParam("file") MultipartFile image) throws IOException {
        log.trace("Creating image " + image.getOriginalFilename());

        Long imageId = imageService.createImage(new Image(image.getBytes()));

        return new Result<Long>(imageId, "Image created successfully");
    }

    @GetMapping("/{id}")
    public Result<byte[]> findImageById(@PathVariable Long id) {
        log.trace("Finding image by id " + id);

        byte[] image = imageService.findImageById(id);

        return new Result<byte[]>(image, null);
    }

    @PutMapping("/{id}")
    public Result<Boolean> updateImage(@PathVariable Long id, @RequestParam("file") MultipartFile image) throws IOException {
        log.trace("Updating image " + image.getOriginalFilename());

        imageService.updateImage(new Image(id, image.getBytes()));

        return new Result<Boolean>(true, "Image updated successfully");
    }

    @DeleteMapping("/{id}")
    public Result<Boolean> deleteImage(@PathVariable Long id) {
        log.trace("Deleting image " + id);

        imageService.deleteImage(id);

        return new Result<Boolean>(true, "Image deleted successfully");
    }
}
