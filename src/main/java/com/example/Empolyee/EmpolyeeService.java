package com.example.Empolyee;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
public class EmpolyeeService {

    @Autowired
    private EmpolyeeRepository empolyeeRepository;

    public Empolyee saveEmpolyee(Empolyee empolyee) {

        log.info("Iniside the service method in Service Class");
        System.out.println("Test the service class..");
        return empolyeeRepository.save(empolyee);
    }


    public Empolyee getEmpolyee(Long empolyeeID) throws EmpolyeeNotFoundException {

        Optional<Empolyee> empolyee= empolyeeRepository.findById(empolyeeID);
        if(!empolyee.isPresent())
        {
            log.info("Iniside the service method in Service Class");
            throw new EmpolyeeNotFoundException("Empolyee is not Available..");
        }
        return  empolyee.get();
    }
    
}
