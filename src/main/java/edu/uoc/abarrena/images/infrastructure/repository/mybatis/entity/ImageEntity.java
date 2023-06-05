package edu.uoc.abarrena.images.infrastructure.repository.mybatis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ImageEntity {
    private Long id;
    private byte[] content;
    private String contentType;
    private String name;
}
