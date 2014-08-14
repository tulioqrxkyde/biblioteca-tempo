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
public enum MinSegs {

    MINSEGS_00("Zero"),
    MINSEGS_01("Um"),
    MINSEGS_02("Dois"),
    MINSEGS_03("Três"),
    MINSEGS_04("Quatro"),
    MINSEGS_05("Cinco"),
    MINSEGS_06("Seis"),
    MINSEGS_07("Sete"),
    MINSEGS_08("Oito"),
    MINSEGS_09("Nove"),
    MINSEGS_10("Dez"),
    MINSEGS_11("Onze"),
    MINSEGS_12("Doze"),
    MINSEGS_13("Treze"),
    MINSEGS_14("Quatorze"),
    MINSEGS_15("Quinze"),
    MINSEGS_16("Dezesseis"),
    MINSEGS_17("Dezessete"),
    MINSEGS_18("Dezoito"),
    MINSEGS_19("Dezenove"),
    MINSEGS_20("Vinte"),
    MINSEGS_21("Vinte e um"),
    MINSEGS_22("Vinte e dois"),
    MINSEGS_23("Vinte e três"),
    MINSEGS_24("Vinte e quatro"),
    MINSEGS_25("Vinte e cinco"),
    MINSEGS_26("Vinte e seis"),
    MINSEGS_27("Vinte e sete"),
    MINSEGS_28("Vinte e oito"),
    MINSEGS_29("Vinte e nove"),
    MINSEGS_30("Trinta"),
    MINSEGS_31("Trinta e um"),
    MINSEGS_32("Trinta e dois"),
    MINSEGS_33("Trinta e três"),
    MINSEGS_34("Trinta e quatro"),
    MINSEGS_35("Trinta e cinco"),
    MINSEGS_36("Trinta e seis"),
    MINSEGS_37("Trinta e sete"),
    MINSEGS_38("Trinta e oito"),
    MINSEGS_39("Trinta e nove"),
    MINSEGS_40("Quarenta"),
    MINSEGS_41("Quarenta e um"),
    MINSEGS_42("Quarenta e dois"),
    MINSEGS_43("Quarenta e três"),
    MINSEGS_44("Quarenta e quatro"),
    MINSEGS_45("Quarenta e cinco"),
    MINSEGS_46("Quarenta e seis"),
    MINSEGS_47("Quarenta e sete"),
    MINSEGS_48("Quarenta e oito"),
    MINSEGS_49("Quarenta e nove"),
    MINSEGS_50("Cinqüenta"),
    MINSEGS_51("Cinqüenta e um"),
    MINSEGS_52("Cinqüenta e dois"),
    MINSEGS_53("Cinqüenta e três"),
    MINSEGS_54("Cinqüenta e quatro"),
    MINSEGS_55("Cinqüenta e cinco"),
    MINSEGS_56("Cinqüenta e seis"),
    MINSEGS_57("Cinqüenta e sete"),
    MINSEGS_58("Cinqüenta e oito"),
    MINSEGS_59("Cinqüenta e nove");

    private final String MINSEGS;

    MinSegs(String minsegs) {
        this.MINSEGS = minsegs;
    }

    /**
     * @return valor numérico em formato texto
     */
    public String getMINSEGS() {
        return MINSEGS;
    }

}