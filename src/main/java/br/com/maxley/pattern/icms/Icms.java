package br.com.maxley.pattern.icms;

import br.com.maxley.pattern.model.Budget;

import java.math.BigDecimal;

public interface Icms {
    public BigDecimal calculate(Budget budget);
}
