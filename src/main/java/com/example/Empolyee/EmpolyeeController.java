package com.example.Empolyee;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/Empolyee/details")
@Slf4j
public class EmpolyeeController {

    @Autowired
    private EmpolyeeService empolyeeService;

    @PostMapping(value = "/save")
    public ResponseEntity<?> saveEmpolyee(@RequestBody Empolyee empolyee)
    {
        log.info("Inside the Controller method saveEmpolyee");
        Empolyee empolyees = empolyeeService.saveEmpolyee(empolyee);
        return new ResponseEntity<Empolyee>(empolyees, HttpStatus.CREATED);
    }
    @GetMapping("/fetch/{id}")
    public ResponseEntity<?> getEmpolyee(@PathVariable("id") Long empolyeeID) throws EmpolyeeNotFoundException {

        log.info("Inside the Controller method by getEmpolyee ");
        Empolyee empolyees= empolyeeService.getEmpolyee(empolyeeID);
        return new ResponseEntity<Empolyee>(empolyees,HttpStatus.OK);
    }


}
