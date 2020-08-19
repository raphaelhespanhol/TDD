package br.com.cielo.TDD.entities.response;

import br.com.cielo.TDD.entities.Driver;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
@Builder
public class DriversOwnVehicleResponse {

    private List<Driver> drivers;
}
