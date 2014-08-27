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
package tempo.biblioteca.tempo;

import tempo.biblioteca.interfaces.Data;
import tempo.biblioteca.interfaces.Hora;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import tempo.biblioteca.enums.Values;
import tempo.biblioteca.enums.Feriados;

/**
 *
 * @author tulio.xcrtf
 */
public class Tempo implements Comparable<Tempo>, Hora, Data {

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
    @Override
    public void setSegundo(Integer segundo) {
        CALENDARIO.set(Calendar.SECOND, segundo);
    }

    /**
     * Descrição: Recebe um valor de minuto como parâmetro e seta o minuto como
     * sendo o atual ao objeto Calendário.
     *
     * @param minuto
     */
    @Override
    public void setMinuto(Integer minuto) {
        CALENDARIO.set(Calendar.MINUTE, minuto);
    }

    /**
     * Descrição: Recebe um valor de hora como parâmetro e seta a hora como
     * sendo a atual ao objeto Calendário.
     *
     * @param hora
     */
    @Override
    public void setHora(Integer hora) {
        CALENDARIO.set(Calendar.HOUR_OF_DAY, hora);
    }

    /**
     * Descrição: Recebe um dia como parâmetro e seta o dia como sendo o atual
     * ao objeto Calendário.
     *
     * @param dia
     */
    @Override
    public void setDia(Integer dia) {
        CALENDARIO.set(Calendar.DAY_OF_MONTH, dia);
    }

    /**
     * Descrição: Recebe um mês como parâmetro e seta o mês como sendo o atual
     * ao objeto Calendário.
     *
     * @param mes
     */
    @Override
    public void setMes(Integer mes) {
        CALENDARIO.set(Calendar.MONTH, mes);
    }

    /**
     * Descrição: Recebe um ano como parâmetro e seta o ano como sendo o atual
     * ao objeto Calendário.
     *
     * @param ano
     */
    @Override
    public void setAno(Integer ano) {
        CALENDARIO.set(Calendar.YEAR, ano);
    }

    /**
     * @return o segundo atual em formato numérico
     */
    @Override
    public Integer getSegundoAtual() {
        return CALENDARIO.get(Calendar.SECOND);
    }

    /**
     * @return o segundo atual em formato texto
     */
    @Override
    public String getSegundoAtualExtenso() {
        return Values.valueOf("VALUES_".concat((String.valueOf(CALENDARIO.get(Calendar.SECOND))))).getVALOR();
    }

    /**
     * @return o minuto atual em formato numérico
     */
    @Override
    public Integer getMinutoAtual() {
        return CALENDARIO.get(Calendar.MINUTE);
    }

    /**
     * @return o minuto atual em formato texto
     */
    @Override
    public String getMinutoAtualExtenso() {
        return Values.valueOf("VALUES_".concat((String.valueOf(CALENDARIO.get(Calendar.MINUTE))))).getVALOR();
    }

    /**
     * @return a hora atual em formato numérico
     */
    @Override
    public Integer getHoraAtual() {
        return CALENDARIO.get(Calendar.HOUR_OF_DAY);
    }

    /**
     * @return a hora atual em formato texto
     */
    @Override
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
    @Override
    public Integer getDiaAtualSemana() {
        return CALENDARIO.get(Calendar.DAY_OF_WEEK);
    }

    /**
     * 
     * @return o dia atual do mês em formato numérico
     */
    @Override
    public Integer getDiaAtualMes() {
        return CALENDARIO.get(Calendar.DAY_OF_MONTH);
    }
    

    /**
     * Descrição: 
     * ( Janeiro / January       - > 1 )
     * ( Fevereiro / February    - > 2 )
     * ( Março / March           - > 3 )
     * ( Abril / April           - > 4 )
     * ( Maio / May              - > 5 )
     * ( Junho / June            - > 6 )
     * ( Julho / July            - > 7 )
     * ( Agosto / August         - > 8 )
     * ( Setembro / September    - > 9 )
     * ( Outubro / October       - > 10 )
     * ( Novembro / November     - > 11 )
     * ( Dezembro / December     - > 12 )
     * 
     * @return o mês atual em formato numérico
     */
    @Override
    public Integer getMesAtual() {
        return CALENDARIO.get(Calendar.MONTH)+1;
    }

    /**
     * @return o ano atual em formato numérico
     */
    @Override
    public Integer getAnoAtual() {
        return CALENDARIO.get(Calendar.YEAR);
    }

    /**
     * @return o dia atual da semana em formato texto
     */
    @Override
    public String getDiaAtualExtensoSemana() {
        S_DATA.applyPattern("EEEEE");
        return S_DATA.format(DATA);
    }

    /**
     * @return o dia atual do mês em formato texto
     */
    @Override
    public String getDiaAtualMesExtenso() {
        return Values.valueOf("VALUES_".concat((String.valueOf(CALENDARIO.get(Calendar.DAY_OF_MONTH))))).getVALOR();
    }

    /**
     * @return o mês atual em formato texto
     */
    @Override
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

    /**
     * Descrição: Recebe por parâmetro ano, mês e dia e retorna o respectivo dia
     * da semana em formato texto.
     *
     * @param a ano
     * @param m mês
     * @param d dia
     * @param pattern padrão (opcional) a se utilizar na formatação do texto
     * @return dia da semana
     */
    @Override
    public String getDiaSemana(int a, int m, int d, String... pattern) {
        if (pattern != null) {
            if (pattern.length > 0) {
                S_DATA.applyPattern(pattern[0]);
            }
        } else {
            S_DATA.applyPattern("EEEEE");
        }
        CALENDARIO.set(a, m, d);
        return S_DATA.format(CALENDARIO.getTime());
    }

    /**
     * Descrição: Recebe um ano como parâmetro e verifica se o mesmo é bissexto
     *
     * @param ano
     * @return um booleano
     */
    @Override
    public boolean isBissexto(int ano) {
        return (((ano % 400 == 0) || (!(ano % 100 == 0) && (ano % 4 == 0))));
    }

    /**
     * Descrição: Recebe um ano por parâmetro em formato numérico e o retorna em
     * formato texto
     *
     * @param ano valor entre (-9999 a +9999)
     * @return um ano por extenso
     */
    @Override
    public String getAnoExtenso(int ano) {
        String s = String.valueOf(ano);
        final String CONJUNCAO_E = " e ", CONJUNCAO_MIL = " mil ", CONJUNCAO_MEN = "Menos ", CONJUNCAO_M = "m",
                STR_C = "Cento";
        StringBuilder sb = new StringBuilder();

        try {
            if (ano < -9999 || ano > 9999) {
                throw new IllegalArgumentException();
            }

            if (Integer.signum(ano) == -1) {
                sb.insert(0, CONJUNCAO_MEN);
                s = String.valueOf(Math.abs(ano));
            }

            switch (s.length()) {
                case 1:
                case 2:
                    sb.append(Values.values()[Integer.parseInt(s)].getVALOR()).toString();
                    break;
                case 3:
                    if (s.charAt(0) != '0') {
                        sb.append(Values.values()[Integer.parseInt(String.valueOf(s.charAt(0))) + 99].getVALOR()).toString();
                        if (!s.substring(1).equals("00")) {
                            sb.append(CONJUNCAO_E);
                            sb.append(Values.values()[Integer.parseInt(s.substring(1))].getVALOR());
                        } else {
                            sb.delete(2, sb.length());
                            sb.append("m");
                        }
                        break;
                    }
                case 4:
                    if (s.charAt(0) != '0') {
                        sb.append(Values.values()[Integer.parseInt(String.valueOf(s.charAt(0)))].getVALOR()).toString();
                        sb.append(CONJUNCAO_MIL);
                    }
                    if (s.charAt(1) != '0') {
                        sb.append(CONJUNCAO_E);
                        sb.append(Values.values()[Integer.parseInt(String.valueOf(s.charAt(1))) + 99].getVALOR());
                    }
                    if (!s.substring(2).equals("00")) {
                        sb.delete(sb.toString().indexOf(CONJUNCAO_E), sb.toString().indexOf(CONJUNCAO_E) + 3);
                        sb.append(CONJUNCAO_E);
                        sb.append(Values.values()[Integer.parseInt(s.substring(2))].getVALOR());
                    } else if (sb.toString().contains(STR_C)) {
                        sb.insert(sb.toString().indexOf(STR_C) + 5, CONJUNCAO_M);
                        sb.delete(sb.toString().indexOf(STR_C) + 2, sb.toString().indexOf(STR_C) + 5);
                        sb.replace(sb.indexOf("  "), sb.indexOf("  ") + 1, "");
                    }
                    break;
                default:
                    return "";
            }
        } catch (IllegalArgumentException iE) {
            throw new IllegalArgumentException("Insira um número entre -9999 e +9999");
        }
        return sb.toString();
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
     * @return uma String em formato HH:mm:ss - dd/MM/yyyy 
     * HH - > hora
     * mm - > minuto
     * ss - > segundo
     * dd - > dia
     * MM - > mês
     * yyyy - > ano
     */
    @Override
    public String toString() {
        return "Tempo: " + getHoraAtual()
                + ":" + getMinutoAtual()
                + ":" + getSegundoAtual()
                + " - " + getDiaAtualMes()
                + "/" + getMesAtual()
                + "/" + getAnoAtual();
    }

    /**
     * Método compareTo sobrescrito.
     *
     * @param t um Tempo
     * @return int
     */
    @Override
    public int compareTo(Tempo t) {
        long tempo = this.CALENDARIO.getTimeInMillis(), tempo2 = t.CALENDARIO.getTimeInMillis();
        return ((tempo > tempo2) ? 1 : ((tempo == tempo2)) ? 0 : -1);
    }
}