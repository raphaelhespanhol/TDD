package br.com.cielo.TDD.entities.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Getter
@Builder
public class VehicleReport {

    private long esportivo;
    private long hatch;
    private long jipe;
    private long picape;
    private long sedan;
    private long suv;
    private long van;
}
