package br.com.cielo.TDD.unit.fixtures;

import br.com.cielo.TDD.entities.enums.GenderType;
import br.com.cielo.TDD.entities.enums.VehicleType;
import br.com.cielo.TDD.entities.enums.WashingType;
import br.com.cielo.TDD.entities.request.DriverRequest;

public class DriverRequestFixture {

    public static DriverRequest defaultValues() {
        return DriverRequest.builder()
                .gender(GenderType.MALE)
                .hasOwnVehicle(true)
                .isUber(false)
                .name("Douglas Henrique")
                .vehicleType(VehicleType.ESPORTIVO)
                .washingType(WashingType.COMPLETA)
                .build();
    }
}
