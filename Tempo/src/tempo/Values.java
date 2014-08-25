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
    VALUES_59("Cinqüenta e nove"),
    VALUES_60("Sessenta"),
    VALUES_61("Sessenta e um"),
    VALUES_62("Sessenta e dois"),
    VALUES_63("Sessenta e três"),
    VALUES_64("Sessenta e quatro"),
    VALUES_65("Sessenta e cinco"),
    VALUES_66("Sessenta e seis"),
    VALUES_67("Sessenta e sete"),
    VALUES_68("Sessenta e oito"),
    VALUES_69("Sessenta e nove"),
    VALUES_70("Setenta"),
    VALUES_71("Setenta e um"),
    VALUES_72("Setenta e dois"),
    VALUES_73("Setenta e três"),
    VALUES_74("Setenta e quatro"),
    VALUES_75("Setenta e cinco"),
    VALUES_76("Setenta e seis"),
    VALUES_77("Setenta e sete"),
    VALUES_78("Setenta e oito"),
    VALUES_79("Setenta e nove"),
    VALUES_80("Oitenta"),
    VALUES_81("Oitenta e um"),
    VALUES_82("Oitenta e dois"),
    VALUES_83("Oitenta e três"),
    VALUES_84("Oitenta e quatro"),
    VALUES_85("Oitenta e cinco"),
    VALUES_86("Oitenta e seis"),
    VALUES_87("Oitenta e sete"),
    VALUES_88("Oitenta e oito"),
    VALUES_89("Oitenta e nove"),
    VALUES_90("Noventa"),
    VALUES_91("Noventa e um"),
    VALUES_92("Noventa e dois"),
    VALUES_93("Noventa e três"),
    VALUES_94("Noventa e quatro"),
    VALUES_95("Noventa e cinco"),
    VALUES_96("Noventa e seis"),
    VALUES_97("Noventa e sete"),
    VALUES_98("Noventa e oito"),
    VALUES_99("Noventa e nove"),
    VALUES_100("Cento"),
    VALUES_200("Duzentos"),
    VALUES_300("Trezentos"),
    VALUES_400("Quatrocentos"),
    VALUES_500("Quinhentos"),
    VALUES_600("Seissentos"),
    VALUES_700("Setessentos"),
    VALUES_800("Oitossentos"),
    VALUES_900("Novessentos");
    
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