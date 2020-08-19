package br.com.cielo.TDD.entities.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Getter
@Builder
public class GroupedVehiclesByDateResponse {

    private VehicleReport today;
    private VehicleReport week;
    private VehicleReport month;
}
