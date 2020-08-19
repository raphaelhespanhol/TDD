package br.com.cielo.TDD.fixtures;

import br.com.cielo.TDD.entities.Driver;
import br.com.cielo.TDD.entities.enums.GenderType;
import br.com.cielo.TDD.entities.enums.VehicleType;
import br.com.cielo.TDD.entities.enums.WashingType;
import br.com.cielo.TDD.utils.DateUtils;

public class DriverFixture {

    public static Driver defaultValues() {
        return Driver.builder()
                .gender(GenderType.MALE)
                .hasOwnVehicle(true)
                .id(3L)
                .isUber(true)
                .lastUpdateDate(DateUtils.getDateNowToday())
                .name("Pedro Henrique")
                .vehicleType(VehicleType.JIPE)
                .washingDate(DateUtils.getDateFirstDayThisWeek())
                .washingType(WashingType.COMPLETA)
                .build();
    }
}
