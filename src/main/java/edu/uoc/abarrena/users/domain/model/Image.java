package edu.uoc.abarrena.users.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Image {

    private Long id;
    private byte[] content;
    private String contentType;
    private String name;

    public Image() {
    }

    public Image(byte[] content, String contentType, String name) {
        this.content = content;
        this.contentType = contentType;
        this.name = name;
    }
}
