package com.example.Empolyee;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmpolyeeService {

    @Autowired
    private EmpolyeeRepository empolyeeRepository;

    public Empolyee saveEmpolyee(Empolyee empolyee) {

        return empolyeeRepository.save(empolyee);
    }


    public Empolyee getEmpolyee(Long empolyeeID) throws EmpolyeeNotFoundException {

        Optional<Empolyee> empolyee= empolyeeRepository.findById(empolyeeID);
        if(!empolyee.isPresent())
        {
            throw new EmpolyeeNotFoundException("Empolyee is not Available..");
        }
        return  empolyee.get();
    }
    
}
