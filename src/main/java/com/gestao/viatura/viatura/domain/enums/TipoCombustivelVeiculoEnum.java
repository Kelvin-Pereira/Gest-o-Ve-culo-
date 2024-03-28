package com.gestao.viatura.viatura.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TipoCombustivelVeiculoEnum {

    GASOLINA("Gasolina"),
    GASOLINA_ETANOL("Flex"),
    DIESEL("Disel"),
    ELETRICO("Elétrico"),
    HIBRIDO("Hibrido"),
    ETANOL("Etanol"),
    GNV("GNV");

    private final String value;
}
