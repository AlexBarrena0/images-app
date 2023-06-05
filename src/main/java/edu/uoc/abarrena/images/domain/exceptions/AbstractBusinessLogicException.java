package edu.uoc.abarrena.images.domain.exceptions;

import lombok.Getter;

@Getter
public abstract class AbstractBusinessLogicException extends RuntimeException {
    protected AbstractBusinessLogicException(final String message) {
        super(message);
    }
}
