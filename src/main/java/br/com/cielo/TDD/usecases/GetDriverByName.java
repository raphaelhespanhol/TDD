package br.com.cielo.TDD.usecases;

import br.com.cielo.TDD.entities.Driver;
import br.com.cielo.TDD.exceptions.DriverNotFoundException;
import br.com.cielo.TDD.repositories.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GetDriverByName {

    @Autowired
    private DriverRepository driverRepository;

    public Driver findDriverByName(String name) {
        return driverRepository
                .findByNameIgnoreCase(name)
                .orElseThrow(DriverNotFoundException::new);
    }

}
