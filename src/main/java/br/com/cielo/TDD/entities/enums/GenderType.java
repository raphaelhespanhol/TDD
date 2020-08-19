package br.com.cielo.TDD.entities.enums;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum GenderType {

    MALE("MALE"),
    FEMALE("FEMALE");
    private String value;

    GenderType(final String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

    @JsonCreator
    public static GenderType fromValue(final String text) {
        for (GenderType g : GenderType.values()) {
            if (String.valueOf(g.value).equalsIgnoreCase(text)) {
                return g;
            }
        }
        return null;
    }
}
