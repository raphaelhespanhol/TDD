package br.com.cielo.TDD.fixtures;

import br.com.cielo.TDD.entities.response.VehicleReport;

public class VehicleReportFixture {

    public static VehicleReport defaultValues() {
        return VehicleReport.builder()
                .esportivo(1)
                .hatch(2)
                .jipe(3)
                .picape(4)
                .sedan(5)
                .suv(6)
                .van(7)
                .build();
    }
}
