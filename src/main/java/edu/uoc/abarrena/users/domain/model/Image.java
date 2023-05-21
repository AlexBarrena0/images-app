package edu.uoc.abarrena.users.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Image {

    private Long id;
    private byte[] content;

    public Image() {
    }
    public Image(byte[] content) {
        this.content = content;
    }
}
