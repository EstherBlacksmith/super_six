package org.example.super_six.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    private static final Logger log = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(NoSticksException.class)
    public ResponseEntity<ErrorDetail> handleNoSticks(NoSticksException ex) {
        return buildResponse(ex, HttpStatus.CONFLICT);
    }

    @ExceptionHandler(InvalidInitialSticksException.class)
    public ResponseEntity<ErrorDetail> handleInvalidInitialSticks(InvalidInitialSticksException ex) {
        return buildResponse(ex, HttpStatus.BAD_REQUEST);
    }


    private ResponseEntity<ErrorDetail> buildResponse(RuntimeException ex, HttpStatus status) {
        log.warn("Excepcion capturada: {} — {}", ex.getClass().getSimpleName(), ex.getMessage());
        return ResponseEntity.status(status)
                .body(new ErrorDetail(ex.getClass().getSimpleName(), ex.getMessage()));
    }
}
