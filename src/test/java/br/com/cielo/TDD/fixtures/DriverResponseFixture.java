package br.com.cielo.TDD.fixtures;

import br.com.cielo.TDD.entities.Driver;
import br.com.cielo.TDD.entities.enums.GenderType;
import br.com.cielo.TDD.entities.enums.VehicleType;
import br.com.cielo.TDD.entities.enums.WashingType;
import br.com.cielo.TDD.entities.response.DriverResponse;
import br.com.cielo.TDD.utils.DateUtils;

import java.util.Arrays;
import java.util.List;

public class DriverResponseFixture {

    public static DriverResponse defaultValues() {
        return DriverResponse.builder()
                .gender(GenderType.MALE)
                .hasOwnVehicle(true)
                .id(1L)
                .isUber(true)
                .lastUpdateDate(DateUtils.getDateNowToday())
                .name("Douglas Henrique")
                .vehicleType(VehicleType.ESPORTIVO)
                .washingDate(DateUtils.getDateFirstDayThisWeek())
                .washingType(WashingType.COMPLETA)
                .build();
    }

    public static List<Driver> defaultValuesListDrivers() {
        return Arrays.asList(
                Driver.builder()
                        .gender(GenderType.MALE)
                        .hasOwnVehicle(true)
                        .id(1L)
                        .isUber(false)
                        .lastUpdateDate(DateUtils.getDateNowToday())
                        .name("Douglas Henrique")
                        .vehicleType(VehicleType.ESPORTIVO)
                        .washingDate(DateUtils.getDateFirstDayThisWeek())
                        .washingType(WashingType.COMPLETA)
                        .build(),
                Driver.builder()
                        .gender(GenderType.MALE)
                        .hasOwnVehicle(true)
                        .id(2L)
                        .isUber(false)
                        .lastUpdateDate(DateUtils.getDateNowToday())
                        .name("Caio Henrique")
                        .vehicleType(VehicleType.HATCH)
                        .washingDate(DateUtils.getDateFirstDayThisWeek())
                        .washingType(WashingType.SIMPLES)
                        .build(),
                Driver.builder()
                        .gender(GenderType.MALE)
                        .hasOwnVehicle(true)
                        .id(3L)
                        .isUber(true)
                        .lastUpdateDate(DateUtils.getDateNowToday())
                        .name("Pedro Henrique")
                        .vehicleType(VehicleType.JIPE)
                        .washingDate(DateUtils.getDateFirstDayThisWeek())
                        .washingType(WashingType.COMPLETA)
                        .build(),
                Driver.builder()
                        .gender(GenderType.FEMALE)
                        .hasOwnVehicle(true)
                        .id(4L)
                        .isUber(false)
                        .lastUpdateDate(DateUtils.getDateNowToday())
                        .name("Maria Julia")
                        .vehicleType(VehicleType.PICAPE)
                        .washingDate(DateUtils.getDateFirstDayThisWeek())
                        .washingType(WashingType.CERA)
                        .build(),
                Driver.builder()
                        .gender(GenderType.FEMALE)
                        .hasOwnVehicle(true)
                        .id(5L)
                        .isUber(true)
                        .lastUpdateDate(DateUtils.getDateNowToday())
                        .name("Juliana Silva")
                        .vehicleType(VehicleType.ESPORTIVO)
                        .washingDate(DateUtils.getDateFirstDayThisWeek())
                        .washingType(WashingType.COMPLETA)
                        .build());
    }

    public static List<Driver> defaultValuesUberDrivers() {
        return Arrays.asList(
                Driver.builder()
                        .gender(GenderType.MALE)
                        .hasOwnVehicle(true)
                        .id(3L)
                        .isUber(true)
                        .lastUpdateDate(DateUtils.getDateNowToday())
                        .name("Pedro Henrique")
                        .vehicleType(VehicleType.JIPE)
                        .washingDate(DateUtils.getDateFirstDayThisWeek())
                        .washingType(WashingType.COMPLETA)
                        .build(),
                Driver.builder()
                        .gender(GenderType.FEMALE)
                        .hasOwnVehicle(true)
                        .id(5L)
                        .isUber(true)
                        .lastUpdateDate(DateUtils.getDateNowToday())
                        .name("Juliana Silva")
                        .vehicleType(VehicleType.ESPORTIVO)
                        .washingDate(DateUtils.getDateFirstDayThisWeek())
                        .washingType(WashingType.COMPLETA)
                        .build());
    }
}
