package br.com.cielo.TDD.unit.fixtures;

import br.com.cielo.TDD.entities.response.WashesReport;

public class WashesReportFixture {

    public static WashesReport defaultValues() {
        return WashesReport.builder()
                .cera(1)
                .completa(2)
                .polimento(3)
                .simples(4)
                .simplesCera(5)
                .build();
    }
}
