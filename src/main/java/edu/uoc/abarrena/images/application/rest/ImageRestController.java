package edu.uoc.abarrena.images.application.rest;

import edu.uoc.abarrena.images.application.dto.response.ImageDto;
import edu.uoc.abarrena.images.application.dto.response.Result;
import edu.uoc.abarrena.images.domain.converter.ImageConverter;
import edu.uoc.abarrena.images.domain.model.Image;
import edu.uoc.abarrena.images.domain.service.ImageService;
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

        Long imageId = imageService.createImage(new Image(image.getBytes(), image.getContentType(), image.getOriginalFilename()));

        return new Result<Long>(imageId, "Image created successfully");
    }

    @GetMapping("/{id}")
    public Result<ImageDto> findImageById(@PathVariable Long id) {
        log.trace("Finding image by id " + id);

        ImageDto image = ImageConverter.INSTANCE.toDto(imageService.findImageById(id));

        return new Result<ImageDto>(image, null);
    }

    @DeleteMapping("/{id}")
    public Result<Boolean> deleteImage(@PathVariable Long id) {
        log.trace("Deleting image " + id);

        imageService.deleteImage(id);

        return new Result<Boolean>(true, "Image deleted successfully");
    }
}
