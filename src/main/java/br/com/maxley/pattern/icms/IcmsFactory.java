package br.com.maxley.pattern.icms;

import br.com.maxley.pattern.icms.*;
import br.com.maxley.pattern.icms.regions.*;
import br.com.maxley.pattern.model.Budget;
import br.com.maxley.pattern.model.Region;

public class IcmsFactory {

    public Icms calculatePerRegion(Budget budget) {
        Region region = budget.getRegion();

        switch (region) {
            case ACRE:
                return new IcmsAcre();
            case ALAGOAS:
                return new IcmsAlagoas();
            case AMAPA:
                return new IcmsAmapa();
            case AMAZONAS:
                return new IcmsAmazonas();
            case BAHIA:
                return new IcmsBahia();
            case CEARA:
                return new IcmsCeara();
            case DISTRITO_FEDERAL:
                return new IcmsDistritoFederal();
            case ESPIRITO_SANTO:
                return new IcmsEspiritoSanto();
            case GOIAS:
                return new IcmsGoias();
            case MARANHAO:
                return new IcmsMaranhao();
            case MATO_GROSSO:
                return new IcmsMatoGrosso();
            case MATO_GROSSO_DO_SUL:
                return new IcmsMatoGrossoDoSul();
            case MINAS_GERAIS:
                return new IcmsMinasGerais();
            case PARA:
                return new IcmsPara();
            case PARAIBA:
                return new IcmsParaiba();
            case PARANA:
                return new IcmsParana();
            case PERNAMBUCO:
                return new IcmsPernambuco();
            case PIAUI:
                return new IcmsPiaui();
            case RIO_DE_JANEIRO:
                return new IcmsRioDeJaneiro();
            case RIO_GRANDE_DO_NORTE:
                return new IcmsRioGrandeDoNorte();
            case RIO_GRANDE_DO_SUL:
                return new IcmsRioGrandeDoSul();
            case RONDONIA:
                return new IcmsRondonia();
            case RORAIMA:
                return new IcmsRoraima();
            case SANTA_CATARINA:
                return new IcmsSantaCatarina();
            case SAO_PAULO:
                return new IcmsSaoPaulo();
            case SERGIPE:
                return new IcmsSergipe();
            case TOCANTINS:
                return new IcmsTocantins();
            default:
                return null;
        }

    }

}
