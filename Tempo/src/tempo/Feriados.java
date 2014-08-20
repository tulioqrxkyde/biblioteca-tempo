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
public enum Feriados {

    NACIONAL(new Object[][][]{
        {
            {
                "Confraternização Universal",
                "Paixão de Cristo",
                "Tiradentes",
                "Dia Mundial do Trabalho",
                "Independência do Brasil",
                "Nossa Senhora Aparecida",
                "Finados",
                "Proclamação da República",
                "Natal"
            }
        },
        {
            {
                1,
                18,
                21,
                1,
                7,
                12,
                2,
                15,
                25
            }
        },
        {
            {
                1,
                4,
                4,
                5,
                9,
                10,
                11,
                11,
                12
            }
        }
    }),
    
    CEARA(new Object[][][]{
        {
            {
                "Dia de São José Padroeiro do Ceará",
                "Abolição da Escravidão do Ceará"
            }
        },
        {
            {
                19,
                25
            }
        },
        {
            {
                3,
                3
            }
        }
    });

    private final Object[][][] feriados;

    Feriados(Object[][][] feriados) {
        this.feriados = feriados;
    }

    /**
     * Descrição: Retorna uma array tridimensional contendo os feriados
     * 
     * @return Object[][][]
     */
    public Object[][][] getFeriados() {
        return feriados;
    }
}