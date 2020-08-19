package br.com.cielo.TDD.entities.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Getter
@Builder
public class WashesReport {

    private long simples;
    private long simplesCera;
    private long completa;
    private long cera;
    private long polimento;
}
