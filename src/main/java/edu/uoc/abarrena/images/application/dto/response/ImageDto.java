package edu.uoc.abarrena.images.application.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ImageDto {

    private Long id;
    private byte[] content;
    private String contentType;
    private String name;
}
