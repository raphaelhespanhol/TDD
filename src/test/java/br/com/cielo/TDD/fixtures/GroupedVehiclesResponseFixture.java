package br.com.cielo.TDD.fixtures;

import br.com.cielo.TDD.entities.response.GroupedVehiclesResponse;

public class GroupedVehiclesResponseFixture {

    public static GroupedVehiclesResponse defaultValues() {
        return GroupedVehiclesResponse.builder()
                .today(12)
                .week(124)
                .month(1233)
                .build();
    }
}
