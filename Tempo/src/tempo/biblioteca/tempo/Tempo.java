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

import java.util.Calendar;
import tempo.biblioteca.enums.Values;
import tempo.biblioteca.interfaces.Data;
import tempo.biblioteca.interfaces.Horario;
import tempo.biblioteca.unidadetempo.UnidadeTempo;

/**
 *
 * @author tulio.xcrtf
 * @version 1.0
 */
public class Tempo extends UnidadeTempo implements Comparable<Tempo>, Data, Horario {

    /**
     * 
     * @param minuto
     * @param hora 
     */
    public Tempo(Integer hora, Integer minuto) {
        setHora(hora);
        setMinuto(minuto);
    }
    
    /**
     *
     * @param dia
     * @param mes
     * @param ano
     */
    public Tempo(Integer dia, Integer mes, Integer ano) {
        setDia(dia);
        setMes(mes);
        setAno(ano);
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
        setAno(ano);
        setMes(mes);
        setDia(dia);
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
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
     * Descrição: Obtém o segundo atual em formato numérico
     * @return segundo atual
     */
    @Override
    public Integer getSegundoAtual() {
        return CALENDARIO.get(Calendar.SECOND);
    }

    /**
     * Descrição: Obtém o segundo atual em formato texto
     * 
     * @return o segundo atual
     * @see Values
     */
    @Override
    public String getSegundoAtualExtenso() {
        return Values.valueOf("VALUES_".concat((String.valueOf(CALENDARIO.get(Calendar.SECOND))))).getVALOR();
    }

    /**
     * Descrição: Obtém o minuto atual em formato numérico
     * 
     * @return o minuto atual
     */
    @Override
    public Integer getMinutoAtual() {
        return CALENDARIO.get(Calendar.MINUTE);
    }

    /**
     * Descrição: Obtém o minuto atual em formato texto
     * 
     * @return o minuto atual
     * @see Values
     */
    @Override
    public String getMinutoAtualExtenso() {
        return Values.valueOf("VALUES_".concat((String.valueOf(CALENDARIO.get(Calendar.MINUTE))))).getVALOR();
    }

    /**
     * Descrição: Obtém a hora atual em formato numérico
     * 
     * @return a hora atual
     */
    @Override
    public Integer getHoraAtual() {
        return CALENDARIO.get(Calendar.HOUR_OF_DAY);
    }

    /**
     * Descrição: Obtém a hora atual em formato texto
     * 
     * @return a hora atual
     * @see Values
     */
    @Override
    public String getHoraAtualExtenso() {
        return Values.valueOf("VALUES_".concat((String.valueOf(CALENDARIO.get(Calendar.HOUR_OF_DAY))))).getVALOR();
    }

    /**
     *  Descrição: Obtém o dia da semana atual em formato numérico
     * 
     * ( Domingo / Sunday         - > 1 )
     * ( Segunda-feira / Monday   - > 2 )
     * ( Terça-feira / Tuesday    - > 3 )
     * ( Quarta-feira / Wednesday - > 4 )
     * ( Quinta-feira / Thursday  - > 5 )
     * ( Sexta-feira / Friday     - > 6 )
     * ( Sábado / Saturday        - > 7 ).
     * 
     * @return o dia atual da semana
     */
    @Override
    public Integer getDiaAtualSemana() {
        return CALENDARIO.get(Calendar.DAY_OF_WEEK);
    }

    /**
     * Descrição: Obtém o dia atual do mês em formato numérico
     * 
     * @return o dia atual do mês
     */
    @Override
    public Integer getDiaAtualMes() {
        return CALENDARIO.get(Calendar.DAY_OF_MONTH);
    }
    

    /**
     * Descrição: Obtém o mês atual em formato numérico
     * 
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
     * @return o mês atual
     */
    @Override
    public Integer getMesAtual() {
        return CALENDARIO.get(Calendar.MONTH)+1;
    }

    /**
     * Descrição: Obtém o ano atual em formato numérico
     * @return o ano atual
     */
    @Override
    public Integer getAnoAtual() {
        return CALENDARIO.get(Calendar.YEAR);
    }

    /**
     * Descrição: Obtém o dia atual da semana em formato texto
     * 
     * @return o dia atual da semana
     */
    @Override
    public String getDiaAtualExtensoSemana() {
        S_DATA.applyPattern("EEEEE");
        return S_DATA.format(DATA);
    }

    /**
     * Descrição: Obtém o dia atual do mês formato texto
     * 
     * @return o dia atual do mês
     * @see Values
     */
    @Override
    public String getDiaAtualMesExtenso() {
        return Values.valueOf("VALUES_".concat((String.valueOf(CALENDARIO.get(Calendar.DAY_OF_MONTH))))).getVALOR();
    }

    /**
     * Descrição: Obtém o mês atual em formato texto
     * 
     * @return o mês atual
     */
    @Override
    public String getMesAtualExtenso() {
        S_DATA.applyPattern("MMMMM");
        return S_DATA.format(DATA);
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
     * @see Values
     */
    @Override
    public String getAnoExtenso(int ano) throws IllegalArgumentException {
        String s = String.valueOf(ano);
        final String CONJUNCAO_E = " e ", CONJUNCAO_MIL = " mil ", CONJUNCAO_MEN = "Menos ", CONJUNCAO_M = "m",
                STR_C = "Cento";
        StringBuilder sb = new StringBuilder();

        if (ano < -9999 || ano > 9999) {
            throw new IllegalArgumentException("Insira um número entre -9999 e +9999");
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
                    if (sb.indexOf(CONJUNCAO_E) > -1) {
                        sb.delete(sb.indexOf(CONJUNCAO_E), sb.toString().indexOf(CONJUNCAO_E) + 3);
                    }
                    sb.append(CONJUNCAO_E);
                    sb.append(Values.values()[Integer.parseInt(s.substring(2))].getVALOR());
                } else if (sb.toString().contains(STR_C)) {
                    sb.insert(sb.toString().indexOf(STR_C) + 5, CONJUNCAO_M);
                    sb.delete(sb.toString().indexOf(STR_C) + 2, sb.toString().indexOf(STR_C) + 5);
                }
                if (sb.toString().contains("  ")) {
                    sb.replace(sb.indexOf("  "), sb.indexOf("  ") + 1, "");
                }
                break;
            default:
                return "";
        }
        return sb.toString();
    }

    /**
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
     * @param t um Tempo
     * @return int
     */
    @Override
    public int compareTo(Tempo t) {
        long tempo = this.CALENDARIO.getTimeInMillis(), tempo2 = t.CALENDARIO.getTimeInMillis();
        return ((tempo > tempo2) ? 1 : ((tempo == tempo2)) ? 0 : -1);
    }
}