package br.com.cielo.TDD.entities.enums;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum WashingType {

    SIMPLES("SIMPLES"),
    SIMPLES_CERA("SIMPLES_CERA"),
    COMPLETA("COMPLETA"),
    CERA("CERA"),
    POLIMENTO("POLIMENTO");

    private String value;

    WashingType(final String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

    @JsonCreator
    public static WashingType fromValue(final String text) {
        for (WashingType g : WashingType.values()) {
            if (String.valueOf(g.value).equalsIgnoreCase(text)) {
                return g;
            }
        }
        return null;
    }
}
