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
package tempo.biblioteca.feriado;

import java.util.Arrays;
import tempo.biblioteca.enums.Feriados;

/**
 *
 * @author tulio.xcrtf
 */
public class Feriado {

    /**
     * 
     * Unidades Federativas:
     * 0  -> Brasil / Nacionais (BR)
     * 1  -> Acre (AC)
     * 2  -> Alagoas (AL)
     * 3  -> Amapá (AP)
     * 4  -> Amazonas (AM)
     * 5  -> Bahia (BA)
     * 6  -> Ceará (CE)
     * 7  -> Distrito Federal (DF)
     * 8  -> Espírito Santo (ES)
     * 9  -> Goiás (GO)
     * 10 -> Maranhão (MA)
     * 11 -> Mato Grosso (MT)
     * 12 -> Mato Grosso do Sul (MS)
     * 13 -> Minas Gerais (MG)
     * 14 -> Pará (PA)
     * 15 -> Paraíba (PB)
     * 16 -> Paraná (PR)
     * 17 -> Pernambuco (PE)
     * 18 -> Piauí (PI)
     * 19 -> Rio de Janeiro (RJ)
     * 20 -> Rio Grande do Norte (RN)
     * 21 -> Rio Grande do Sul (RS)
     * 22 -> Rondônia (RO)
     * 23 -> Roraima (RR)
     * 24 -> Santa Catarina (SC)
     * 25 -> São Paulo (SP)
     * 26 -> Sergipe (SE)
     * 27 -> Tocantins (TO)
     * 
     * @param uf
     * @return um Object[][][] contendo feriados e suas informações
     */
    public Object[][][] getFeriadosEstadual(int uf) {
        switch (uf) {
            case 0:
                return Feriados.NACIONAL.getFeriados();
            case 1:
                return Feriados.ACRE.getFeriados();
            case 2:
                return Feriados.ALAGOAS.getFeriados();
            case 3:
                return Feriados.AMAPA.getFeriados();
            case 4:
                return Feriados.AMAZONAS.getFeriados();
            case 5:
                return Feriados.BAHIA.getFeriados();
            case 6:
                return Feriados.CEARA.getFeriados();
            case 7:
                return Feriados.DISTRITO_FEDERAL.getFeriados();
            case 8:
                return Feriados.ESPIRITO_SANTO.getFeriados();
            case 9:
                return Feriados.GOIAS.getFeriados();
            case 10:
                return Feriados.MARANHAO.getFeriados();
            case 11:
                return Feriados.MATO_GROSSO.getFeriados();
            case 12:
                return Feriados.MATO_GROSSO_DO_SUL.getFeriados();
            case 13:
                return Feriados.MINAS_GERAIS.getFeriados();
            case 14:
                return Feriados.MINAS_GERAIS.getFeriados();
            case 15:
                return Feriados.PARA.getFeriados();
            case 16:
                return Feriados.PARAIBA.getFeriados();
            case 17:
                return Feriados.PARANA.getFeriados();
            case 18:
                return Feriados.PERNAMBUCO.getFeriados();
            case 19:
                return Feriados.PIAUI.getFeriados();
            case 20:
                return Feriados.RIO_DE_JANEIRO.getFeriados();
            case 21:
                return Feriados.RIO_GRANDE_DO_NORTE.getFeriados();
            case 22:
                return Feriados.RIO_GRANDE_DO_SUL.getFeriados();
            case 23:
                return Feriados.RONDONIA.getFeriados();
            case 24:
                return Feriados.RORAIMA.getFeriados();
            case 25:
                return Feriados.SANTA_CATARINA.getFeriados();
            case 26:
                return Feriados.SAO_PAULO.getFeriados();
            case 27:
                return Feriados.SERGIPE.getFeriados();
            case 28:
                return Feriados.TOCANTINS.getFeriados();
            default:
                return new Object[][][]{{{}}};
        }
    }

    /**
     * Descrição: Recebe uma UF(Unidade Federativa), um dia e um mês como
     * parâmetros para retornar o feriado que ocorrer aquele dia e aquele mês.
     *
     * Unidades Federativas:
     * 0  -> Brasil / Nacionais (BR)
     * 1  -> Acre (AC)
     * 2  -> Alagoas (AL)
     * 3  -> Amapá (AP)
     * 4  -> Amazonas (AM)
     * 5  -> Bahia (BA)
     * 6  -> Ceará (CE)
     * 7  -> Distrito Federal (DF)
     * 8  -> Espírito Santo (ES)
     * 9  -> Goiás (GO)
     * 10 -> Maranhão (MA)
     * 11 -> Mato Grosso (MT)
     * 12 -> Mato Grosso do Sul (MS)
     * 13 -> Minas Gerais (MG)
     * 14 -> Pará (PA)
     * 15 -> Paraíba (PB)
     * 16 -> Paraná (PR)
     * 17 -> Pernambuco (PE)
     * 18 -> Piauí (PI)
     * 19 -> Rio de Janeiro (RJ)
     * 20 -> Rio Grande do Norte (RN)
     * 21 -> Rio Grande do Sul (RS)
     * 22 -> Rondônia (RO)
     * 23 -> Roraima (RR)
     * 24 -> Santa Catarina (SC)
     * 25 -> São Paulo (SP)
     * 26 -> Sergipe (SE)
     * 27 -> Tocantins (TO)
     * 
     * @param uf
     * @param dia
     * @param mes
     * @return um feriado em formato texto
     */
    public String getDiaFeriado(int uf, int dia, int mes) {
        int indiceDia = -1, indiceMes, indice = -1, z = 0;
        /* Percorre todos os dias para saber se o dia passado por parâmetro é um feriado. */
        for (Object it : Feriados.values()[uf].getFeriados()[1][0]) {
            if (dia == Integer.parseInt(it.toString())) {
                indiceDia = z;
                break;
            }
            z++;
        }
        indiceMes = Arrays.binarySearch(Feriados.values()[uf].getFeriados()[2][0], mes);
        if (indiceDia > -1 && indiceMes > -1) {
                indice = indiceDia == indiceMes ? indiceMes: indiceDia;
        }
        return ((indice > -1) ? Feriados.values()[uf].getFeriados()[0][0][indice].toString()
                : null);
    }
}