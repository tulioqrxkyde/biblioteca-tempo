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

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/**
 *
 * @author tulio.xcrtf
 */
public class Tempo implements Comparable<Tempo> {

    private final Calendar CALENDARIO = Calendar.getInstance();
    private final Date DATA = new Date();
    private final SimpleDateFormat S_DATA = new SimpleDateFormat();
    private TimeZone zona;
    private Locale local;
    private Integer segundo;
    private Integer minuto;
    private Integer hora;
    private Integer dia;
    private Integer mes;
    private Integer ano;

    /**
     * 
     * @param minuto
     * @param hora 
     */
    public Tempo(Integer hora, Integer minuto) {
        this.minuto = minuto;
        this.hora = hora;
        setHora(hora);
        setMinuto(minuto);
    }
    
    /**
     *
     * @param zona
     * @param local
     */
    public Tempo(TimeZone zona, Locale local) {
        this.zona = zona;
        this.local = local;
    }

    /**
     * 
     * @param ano
     * @param mes
     * @param dia
     * @param hora
     * @param minuto
     * @param segundo 
     */
    public Tempo(Integer ano, Integer mes, Integer dia, Integer hora, Integer minuto, Integer segundo) {
        this.ano = ano;
        this.mes = mes;
        this.dia = dia;
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
        setAno(ano);
        setMes(mes);
        setDia(dia);
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }

    /**
     *
     * @param dia
     * @param mes
     * @param ano
     */
    public Tempo(Integer dia, Integer mes, Integer ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    /**
     * Construtor default.
     */
    public Tempo() {

    }

    /**
     * Descrição: Recebe um valor de segundo como parâmetro e seta o segundo
     * como sendo o atual ao objeto Calendário.
     *
     * @param segundo
     */
    public void setSegundo(Integer segundo) {
        CALENDARIO.set(Calendar.SECOND, segundo);
    }

    /**
     * Descrição: Recebe um valor de minuto como parâmetro e seta o minuto como
     * sendo o atual ao objeto Calendário.
     *
     * @param minuto
     */
    public void setMinuto(Integer minuto) {
        CALENDARIO.set(Calendar.MINUTE, minuto);
    }

    /**
     * Descrição: Recebe um valor de hora como parâmetro e seta a hora como
     * sendo a atual ao objeto Calendário.
     *
     * @param hora
     */
    public void setHora(Integer hora) {
        CALENDARIO.set(Calendar.HOUR_OF_DAY, hora);
    }

    /**
     * Descrição: Recebe um dia como parâmetro e seta o dia como sendo o atual
     * ao objeto Calendário.
     *
     * @param dia
     */
    public void setDia(Integer dia) {
        CALENDARIO.set(Calendar.DAY_OF_MONTH, dia);
    }

    /**
     * Descrição: Recebe um mês como parâmetro e seta o mês como sendo o atual
     * ao objeto Calendário.
     *
     * @param mes
     */
    public void setMes(Integer mes) {
        CALENDARIO.set(Calendar.MONTH, mes);
    }

    /**
     * Descrição: Recebe um ano como parâmetro e seta o ano como sendo o atual
     * ao objeto Calendário.
     *
     * @param ano
     */
    public void setAno(Integer ano) {
        CALENDARIO.set(Calendar.YEAR, ano);
    }

    /**
     * @return o segundo atual em formato numérico
     */
    public Integer getSegundoAtual() {
        return CALENDARIO.get(Calendar.SECOND);
    }

    /**
     * @return o segundo atual em formato texto
     */
    public String getSegundoAtualExtenso() {
        return Values.valueOf("VALUES_".concat((String.valueOf(CALENDARIO.get(Calendar.SECOND))))).getVALOR();
    }

    /**
     * @return o minuto atual em formato numérico
     */
    public Integer getMinutoAtual() {
        return CALENDARIO.get(Calendar.MINUTE);
    }

    /**
     * @return o minuto atual em formato texto
     */
    public String getMinutoAtualExtenso() {
        return Values.valueOf("VALUES_".concat((String.valueOf(CALENDARIO.get(Calendar.MINUTE))))).getVALOR();
    }

    /**
     * @return a hora atual em formato numérico
     */
    public Integer getHoraAtual() {
        return CALENDARIO.get(Calendar.HOUR_OF_DAY);
    }

    /**
     * @return a hora atual em formato texto
     */
    public String getHoraAtualExtenso() {
        return Values.valueOf("VALUES_".concat((String.valueOf(CALENDARIO.get(Calendar.HOUR_OF_DAY))))).getVALOR();
    }

    /**
     *  Descrição: 
     * ( Domingo / Sunday         - > 1 )
     * ( Segunda-feira / Monday   - > 2 )
     * ( Terça-feira / Tuesday    - > 3 )
     * ( Quarta-feira / Wednesday - > 4 )
     * ( Quinta-feira / Thursday  - > 5 )
     * ( Sexta-feira / Friday     - > 6 )
     * ( Sábado / Saturday        - > 7 ).
     * 
     * @return o dia atual da semana em formato numérico
     */
    public Integer getDiaAtualSemana() {
        return CALENDARIO.get(Calendar.DAY_OF_WEEK);
    }

    /**
     * 
     * @return o dia atual do mês em formato numérico
     */
    public Integer getDiaAtualMes() {
        return CALENDARIO.get(Calendar.DAY_OF_MONTH);
    }

    /**
     * Descrição: 
     * ( Janeiro / January       - > 0 )
     * ( Fevereiro / February    - > 1 )
     * ( Março / March           - > 2 )
     * ( Abril / April           - > 3 )
     * ( Maio / May              - > 4 )
     * ( Junho / June            - > 5 )
     * ( Julho / July            - > 6 )
     * ( Agosto / August         - > 7 )
     * ( Setembro / September    - > 8 )
     * ( Outubro / October       - > 9 )
     * ( Novembro / November     - > 10 )
     * ( Dezembro / December     - > 11 )
     * 
     * @return o mês atual em formato numérico:
     */
    public Integer getMesAtual() {
        return CALENDARIO.get(Calendar.MONTH);
    }

    /**
     * @return o ano atual em formato numérico
     */
    public Integer getAnoAtual() {
        return CALENDARIO.get(Calendar.YEAR);
    }

    /**
     * @return o dia atual da semana em formato texto
     */
    public String getDiaAtualExtensoSemana() {
        S_DATA.applyPattern("EEEEE");
        return S_DATA.format(DATA);
    }

    /**
     * @return o dia atual do mês em formato texto
     */
    public String getDiaAtualMesExtenso() {
        return Values.valueOf("VALUES_".concat((String.valueOf(CALENDARIO.get(Calendar.DAY_OF_MONTH))))).getVALOR();
    }

    /**
     * @return o mês atual em formato texto
     */
    public String getMesAtualExtenso() {
        S_DATA.applyPattern("MMMMM");
        return S_DATA.format(DATA);
    }

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
    public String getDiaFeriado(Integer uf, Integer dia, Integer mes) {
        int indiceDia = -1, indiceMes, indice = -1, z = 0;
        /* Percorre todos os dias para saber se o dia passado por parâmetro é um feriado. */
        for (Object it : Feriados.values()[uf].getFeriados()[1][0]) {
            if (dia.equals(Integer.parseInt(it.toString()))) {
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

    /**
     * @return um objeto Calendar
     */
    public Calendar getCALENDARIO() {
        return CALENDARIO;
    }

    /**
     * @return um objeto Date
     */
    public Date getDATA() {
        return DATA;
    }

    /**
     * @return a zona
     */
    public TimeZone getZona() {
        return zona;
    }

    /**
     * @param zona que deseja definir
     */
    public void setZona(TimeZone zona) {
        this.zona = zona;
    }

    /**
     * @return o local
     */
    public Locale getLocal() {
        return local;
    }

    /**
     * @param local que deseja definir
     */
    public void setLocal(Locale local) {
        this.local = local;
    }

    /**
     * Método toString() sobrescrito.
     *
     * @return uma String em formato dd/MM/yyyy dd - > dia MM - > mês yyyy - >
     * ano
     */
    @Override
    public String toString() {
        return "Tempo: " + getDiaAtualMes()
                + "/" + getMesAtual()
                + "/" + getAnoAtual()
                + " " + getDATA()
                + "";
    }

    /**
     * Método compareTo sobrescrito.
     *
     * @param t um Tempo
     * @return int
     */
    @Override
    public int compareTo(Tempo t) {
        if ((this.getDiaAtualMes() > t.getDiaAtualMes() && this.getMesAtual() > t.getMesAtual()
                && this.getAnoAtual() > t.getAnoAtual())
                || (this.getDiaAtualMes() > t.getDiaAtualMes() && this.getMesAtual() > t.getMesAtual()
                && this.getAnoAtual().equals(t.getAnoAtual()))
                || (this.getDiaAtualMes() > t.getDiaAtualMes() && this.getMesAtual().equals(t.getMesAtual())
                && this.getAnoAtual().equals(t.getAnoAtual()))
                || (this.getMesAtual() > t.getMesAtual() && this.getAnoAtual() > t.getAnoAtual())
                || (this.getAnoAtual() > t.getAnoAtual())
                ) {
            return 1;
        } else if (this.getDiaAtualMes().equals(t.getDiaAtualMes())
                && this.getMesAtual().equals(t.getMesAtual())
                && this.getAnoAtual().equals(t.getAnoAtual())) {
            return 0;
        } else {
            return -1;
        }
    }
}