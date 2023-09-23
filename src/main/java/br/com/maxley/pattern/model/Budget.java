package br.com.maxley.pattern.model;

import java.math.BigDecimal;

public class Budget {
    private BigDecimal value;
    private Region region;

    public Budget(BigDecimal value, Region region) {
        this.value = value;
        this.region = region;
    }

    public BigDecimal getValue() {
        return value;
    }

    public Region getRegion() {
        return region;
    }
}
