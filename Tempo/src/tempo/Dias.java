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
public enum Dias {

    DIA_01("Um"),
    DIA_02("Dois"),
    DIA_03("Três"),
    DIA_04("Quatro"),
    DIA_05("Cinco"),
    DIA_06("Seis"),
    DIA_07("Sete"),
    DIA_08("Oito"),
    DIA_09("Nove"),
    DIA_10("Dez"),
    DIA_11("Onze"),
    DIA_12("Doze"),
    DIA_13("Treze"),
    DIA_14("Quatorze"),
    DIA_15("Quinze"),
    DIA_16("Dezesseis"),
    DIA_17("Dezessete"),
    DIA_18("Dezoito"),
    DIA_19("Dezenove"),
    DIA_20("Vinte"),
    DIA_21("Vinte e um"),
    DIA_22("Vinte e dois"),
    DIA_23("Vinte e três"),
    DIA_24("Vinte e quatro"),
    DIA_25("Vinte e cinco"),
    DIA_26("Vinte e seis"),
    DIA_27("Vinte e sete"),
    DIA_28("Vinte e oito"),
    DIA_29("Vinte e nove"),
    DIA_30("Trinta"),
    DIA_31("Trinta e um");

    private final String NOME;

    Dias(String nome) {
        this.NOME = nome;
    }

    /**
     * @return o nome
     */
    public String getNome() {
        return this.NOME;
    }

}