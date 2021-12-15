package com.example.Empolyee;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/Empolyee/details")
public class EmpolyeeController {

    @Autowired
    private EmpolyeeService empolyeeService;

    @PostMapping(value = "/save")
    public ResponseEntity<?> saveEmpolyee(@RequestBody Empolyee empolyee)
    {
        Empolyee empolyees = empolyeeService.saveEmpolyee(empolyee);
        return new ResponseEntity<Empolyee>(empolyees, HttpStatus.CREATED);
    }
    @GetMapping("/fetch/{id}")
    public ResponseEntity<?> getEmpolyee(@PathVariable("id") Long empolyeeID) throws EmpolyeeNotFoundException {
        Empolyee empolyees= empolyeeService.getEmpolyee(empolyeeID);
        return new ResponseEntity<Empolyee>(empolyees,HttpStatus.OK);
    }


}
