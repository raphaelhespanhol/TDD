package br.com.cielo.TDD.entities.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Getter
@Builder
public class GroupedWashesByDateResponse {

    private WashesReport today;
    private WashesReport week;
    private WashesReport month;
}
