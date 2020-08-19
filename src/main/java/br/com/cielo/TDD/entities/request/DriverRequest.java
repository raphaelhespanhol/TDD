package br.com.cielo.TDD.entities.request;

import br.com.cielo.TDD.entities.enums.GenderType;
import br.com.cielo.TDD.entities.enums.VehicleType;
import br.com.cielo.TDD.entities.enums.WashingType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Getter
@Builder
public class DriverRequest {

    private String name;
    private GenderType gender;
    private boolean hasOwnVehicle;
    private VehicleType vehicleType;
    private WashingType washingType;
    private boolean isUber;
}
