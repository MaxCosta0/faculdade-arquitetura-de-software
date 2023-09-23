package br.com.maxley.pattern;

import br.com.maxley.pattern.icms.Icms;
import br.com.maxley.pattern.icms.IcmsFactory;
import br.com.maxley.pattern.model.Budget;
import br.com.maxley.pattern.model.Region;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class PatternApplication {

    public static void main(String[] args) {
        // Criação de um objeto Budget para teste
        Budget budget = new Budget(new BigDecimal(1000), Region.MINAS_GERAIS);

        // Criação de uma instância de IcmsFactory
        IcmsFactory icmsFactory = new IcmsFactory();

        // Chamada do método calculatePerRegion para obter o ICMS correspondente à região
        Icms icms = icmsFactory.calculatePerRegion(budget);

        // Resultado do icms
        BigDecimal icmsValue = icms.calculate(budget);

        // Exibição do resultado
        System.out.println("ICMS: " + icmsValue);

    }

}
