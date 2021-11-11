package br.com.cielo.TDD.unit.fixtures;

import br.com.cielo.TDD.entities.response.GroupedVehiclesByDateResponse;

public class GroupedVehiclesByDateResponseFixture {

    public static GroupedVehiclesByDateResponse defaultValues() {
        return GroupedVehiclesByDateResponse.builder()
                .today(VehicleReportFixture.defaultValues())
                .week(VehicleReportFixture.defaultValues())
                .month(VehicleReportFixture.defaultValues())
                .build();
    }
}
