package br.com.cielo.TDD.unit.fixtures;

import br.com.cielo.TDD.entities.response.DriversOwnVehicleResponse;

public class DriversOwnVehiclesResponseFixture {

    public static DriversOwnVehicleResponse defaultValues() {
        return DriversOwnVehicleResponse.builder()
                .drivers(DriverResponseFixture.defaultValuesListDrivers())
                .build();
    }
}
