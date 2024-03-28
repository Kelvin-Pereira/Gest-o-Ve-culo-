package com.gestao.viatura.viatura.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum StatusVeiculoEnum {

    SIM("S"),
    NAO("N");

    private final String value;

}
