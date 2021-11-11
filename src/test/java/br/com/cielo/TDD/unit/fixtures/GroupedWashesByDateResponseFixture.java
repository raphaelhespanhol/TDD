package br.com.cielo.TDD.unit.fixtures;

import br.com.cielo.TDD.entities.response.GroupedWashesByDateResponse;

public class GroupedWashesByDateResponseFixture {

    public static GroupedWashesByDateResponse defaultValues() {
        return GroupedWashesByDateResponse.builder()
                .today(WashesReportFixture.defaultValues())
                .week(WashesReportFixture.defaultValues())
                .month(WashesReportFixture.defaultValues())
                .build();
    }
}
