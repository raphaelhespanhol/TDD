package br.com.cielo.TDD.entities.response;

import br.com.cielo.TDD.entities.enums.GenderType;
import br.com.cielo.TDD.entities.enums.VehicleType;
import br.com.cielo.TDD.entities.enums.WashingType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.sql.Timestamp;

@AllArgsConstructor
@Getter
@Builder
public class DriverResponse {

    private long id;
    private String name;
    private GenderType gender;
    private boolean hasOwnVehicle;
    private VehicleType vehicleType;
    private WashingType washingType;
    private boolean isUber;
    private Timestamp washingDate;
    private Timestamp lastUpdateDate;
}
