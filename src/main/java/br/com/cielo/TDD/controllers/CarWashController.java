package br.com.cielo.TDD.controllers;

import br.com.cielo.TDD.entities.request.DriverRequest;
import br.com.cielo.TDD.entities.response.DriverResponse;
import br.com.cielo.TDD.entities.response.DriversOwnVehicleResponse;
import br.com.cielo.TDD.entities.response.GroupedVehiclesByDateResponse;
import br.com.cielo.TDD.entities.response.GroupedVehiclesResponse;
import br.com.cielo.TDD.entities.response.GroupedWashesByDateResponse;
import br.com.cielo.TDD.entities.response.UberDriversResponse;
import br.com.cielo.TDD.usecases.CreateDriver;
import br.com.cielo.TDD.usecases.GetDriversWithHisOwnVehicle;
import br.com.cielo.TDD.usecases.GetGroupedVehicles;
import br.com.cielo.TDD.usecases.GetGroupedVehiclesByDate;
import br.com.cielo.TDD.usecases.GetGroupedWashesByDate;
import br.com.cielo.TDD.usecases.GetUberDrivers;
import br.com.cielo.TDD.usecases.UpdateDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

@RestController
@RequestMapping("/api/car-wash")
@Validated
public class CarWashController {

    @Autowired
    private CreateDriver createDriver;

    @Autowired
    private GetDriversWithHisOwnVehicle getDriversWithHisOwnVehicle;

    @Autowired
    private GetGroupedVehicles getGroupedVehicles;

    @Autowired
    private GetGroupedVehiclesByDate getGroupedVehiclesByDate;

    @Autowired
    private GetGroupedWashesByDate getGroupedWashesByDate;

    @Autowired
    private GetUberDrivers getUberDrivers;

    @Autowired
    private UpdateDriver updateDriver;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<DriverResponse> createDriver(@RequestBody final DriverRequest driverRequest) {
        throw new NotImplementedException();
    }

    @GetMapping("/get-washes-by-date")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<GroupedWashesByDateResponse> getWashesByDate() {
        throw new NotImplementedException();
    }

    @GetMapping("/get-vehicles-by-date-report")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<GroupedVehiclesByDateResponse> getVehiclesByDate() {
        throw new NotImplementedException();
    }

    @GetMapping("/get-vehicles-report")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<GroupedVehiclesResponse> getVehicles() {
        throw new NotImplementedException();
    }

    @GetMapping("/get-drivers-own-vehicle")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<DriversOwnVehicleResponse> getDriversWithHisOwnVehicle() {
        throw new NotImplementedException();
    }

    @GetMapping("/get-uber-drivers")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<UberDriversResponse> getUberDrivers() {
        throw new NotImplementedException();
    }

    @PutMapping("/update/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<DriverResponse> updateDriver(@PathVariable final long id,
                                                       @RequestBody final DriverRequest driverRequest) {
        throw new NotImplementedException();
    }
}
