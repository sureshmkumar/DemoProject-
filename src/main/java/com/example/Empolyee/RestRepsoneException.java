package com.example.Empolyee;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.NoSuchElementException;

@ControllerAdvice
@ResponseStatus
@Slf4j
public class RestRepsoneException extends ResponseEntityExceptionHandler {


    @ExceptionHandler(EmpolyeeNotFoundException.class)
    public ResponseEntity<String> empolyeeNotFoundException(EmpolyeeNotFoundException Exception, WebRequest request)
    {
           //SendErrorMessageCode message = new SendErrorMessageCode(HttpStatus.NOT_FOUND,Exception.getMessage());
           //log.info("Inside the RestRepsoneException "+message+" "+ Exception.getMessage());
           return new ResponseEntity<String>("Please data into available",HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity<String> handleNoSuchElementException(NoSuchElementException noSuchElementException,WebRequest webRequest)
    {
        return new ResponseEntity<String>("Please choose post method",HttpStatus.NOT_FOUND );
    }
}
