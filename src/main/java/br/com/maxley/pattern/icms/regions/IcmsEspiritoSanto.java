package br.com.maxley.pattern.icms.regions;

import br.com.maxley.pattern.icms.Icms;
import br.com.maxley.pattern.model.Budget;

import java.math.BigDecimal;

public class IcmsEspiritoSanto implements Icms {
    @Override
    public BigDecimal calculate(Budget budget) {
        return budget.getValue().multiply(new BigDecimal(0.17));
    }

}
