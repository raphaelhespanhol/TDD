package br.com.cielo.TDD.entities.enums;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum VehicleType {

    ESPORTIVO("ESPORTIVO"),
    HATCH("HATCH"),
    JIPE("JIPE"),
    PICAPE("PICAPE"),
    SEDAN("SEDAN"),
    SUV("SUV"),
    VAN("VAN");

    private String value;

    VehicleType(final String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

    @JsonCreator
    public static VehicleType fromValue(final String text) {
        for (VehicleType g : VehicleType.values()) {
            if (String.valueOf(g.value).equalsIgnoreCase(text)) {
                return g;
            }
        }
        return null;
    }

}
