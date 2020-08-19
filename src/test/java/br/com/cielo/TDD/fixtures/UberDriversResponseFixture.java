package br.com.cielo.TDD.fixtures;

import br.com.cielo.TDD.entities.response.UberDriversResponse;

public class UberDriversResponseFixture {

    public static UberDriversResponse defaultValues() {
        return UberDriversResponse.builder()
                .drivers(DriverResponseFixture.defaultValuesUberDrivers())
                .build();
    }
}
