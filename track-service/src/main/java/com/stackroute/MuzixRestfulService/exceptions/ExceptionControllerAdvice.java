package com.stackroute.MuzixRestfulService.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ExceptionControllerAdvice {

//    @ExceptionHandler(TrackAlreadyExistsException.class)
//    public ResponseForException handleTrackAlreadyExistsException(TrackAlreadyExistsException trackAlreadyExistsException, final HttpServletRequest request) {
//
//        ResponseForException error = new ResponseForException();
//        error.setErrorMessage(trackAlreadyExistsException.getMessage());
//        error.setRequestedURI(request.getRequestURI());
//
//        return error;
//    }
//
//    @ExceptionHandler(TrackNotFoundException.class)
//    public ResponseForException handleTrackNotFoundException(TrackNotFoundException trackNotFoundException,final HttpServletRequest request) {
//
//        ResponseForException error = new ResponseForException();
//        error.setErrorMessage(trackNotFoundException.getMessage());
//        error.setRequestedURI(request.getRequestURI());
//
//        return error;
//    }
    @ExceptionHandler(TrackNotFoundException.class)
    public ResponseEntity handleMuzixNotFoundException(final TrackNotFoundException e) {
        return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
    }
}
