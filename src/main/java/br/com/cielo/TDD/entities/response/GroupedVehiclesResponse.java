package br.com.cielo.TDD.entities.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Getter
@Builder
public class GroupedVehiclesResponse {

    private int today;
    private int week;
    private int month;
}
