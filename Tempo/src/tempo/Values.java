/* Este arquivo é parte da Biblioteca Tempo.
 * Copyright (C) 2014 (Túlio Vidal - tulio.xcrtf).
 *
 * Este projeto é um software livre; você pode redistribuí-lo e/ou  modificá-lo dentro dos termos da 
 * Licença Pública Geral GNU como publicada pela Fundação do Software Livre (FSF); na versão 2 da Licença,
 * ou (na sua opinião) qualquer versão.
 *
 * Este programa é distribuído na esperança de que possa ser útil, mas SEM NENHUMA GARANTIA; sem uma garantia 
 * implícita de ADEQUAÇÃO a qualquer MERCADO ou APLICAÇÃO EM PARTICULAR. Veja a Licença Pública Geral GNU
 * para maiores detalhes.
 */
package tempo;

/**
 *
 * @author tulio.xcrtf
 */
public enum Values {

    VALUES_00("Zero"),
    VALUES_01("Um"),
    VALUES_02("Dois"),
    VALUES_03("Três"),
    VALUES_04("Quatro"),
    VALUES_05("Cinco"),
    VALUES_06("Seis"),
    VALUES_07("Sete"),
    VALUES_08("Oito"),
    VALUES_09("Nove"),
    VALUES_10("Dez"),
    VALUES_11("Onze"),
    VALUES_12("Doze"),
    VALUES_13("Treze"),
    VALUES_14("Quatorze"),
    VALUES_15("Quinze"),
    VALUES_16("Dezesseis"),
    VALUES_17("Dezessete"),
    VALUES_18("Dezoito"),
    VALUES_19("Dezenove"),
    VALUES_20("Vinte"),
    VALUES_21("Vinte e um"),
    VALUES_22("Vinte e dois"),
    VALUES_23("Vinte e três"),
    VALUES_24("Vinte e quatro"),
    VALUES_25("Vinte e cinco"),
    VALUES_26("Vinte e seis"),
    VALUES_27("Vinte e sete"),
    VALUES_28("Vinte e oito"),
    VALUES_29("Vinte e nove"),
    VALUES_30("Trinta"),
    VALUES_31("Trinta e um"),
    VALUES_32("Trinta e dois"),
    VALUES_33("Trinta e três"),
    VALUES_34("Trinta e quatro"),
    VALUES_35("Trinta e cinco"),
    VALUES_36("Trinta e seis"),
    VALUES_37("Trinta e sete"),
    VALUES_38("Trinta e oito"),
    VALUES_39("Trinta e nove"),
    VALUES_40("Quarenta"),
    VALUES_41("Quarenta e um"),
    VALUES_42("Quarenta e dois"),
    VALUES_43("Quarenta e três"),
    VALUES_44("Quarenta e quatro"),
    VALUES_45("Quarenta e cinco"),
    VALUES_46("Quarenta e seis"),
    VALUES_47("Quarenta e sete"),
    VALUES_48("Quarenta e oito"),
    VALUES_49("Quarenta e nove"),
    VALUES_50("Cinqüenta"),
    VALUES_51("Cinqüenta e um"),
    VALUES_52("Cinqüenta e dois"),
    VALUES_53("Cinqüenta e três"),
    VALUES_54("Cinqüenta e quatro"),
    VALUES_55("Cinqüenta e cinco"),
    VALUES_56("Cinqüenta e seis"),
    VALUES_57("Cinqüenta e sete"),
    VALUES_58("Cinqüenta e oito"),
    VALUES_59("Cinqüenta e nove");

    private final String VALOR;

    Values(String valor) {
        this.VALOR = valor;
    }

    /**
     * @return o VALOR em String
     */
    public String getVALOR() {
        return VALOR;
    }
   
}