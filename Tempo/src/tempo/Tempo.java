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
     *
     * @param zona
     * @param local
     */
    public Tempo(TimeZone zona, Locale local) {
        this.zona = zona;
        this.local = local;
    }

    /**
     * Construtor default.
     */
    public Tempo() {

    }

    /**
     * @param segundo
     *
     * Recebe um valor de segundo como parâmetro e seta o segundo como sendo o atual ao
     * objeto Calendário.
     */
    public void setSegundo(Integer segundo) {
        CALENDARIO.set(Calendar.SECOND, segundo);
    }
    
    /**
     * @param minuto
     *
     * Recebe um valor de minuto como parâmetro e seta o minuto como sendo o atual ao
     * objeto Calendário.
     */
    public void setMinuto(Integer minuto) {
        CALENDARIO.set(Calendar.MINUTE, minuto);
    }
    
    /**
     * @param hora
     *
     * Recebe um valor de hora como parâmetro e seta a hora como sendo a atual ao
     * objeto Calendário.
     */
    public void setHora(Integer hora) {
        CALENDARIO.set(Calendar.HOUR_OF_DAY, hora);
    }
    
    /**
     * @param dia
     *
     * Recebe um dia como parâmetro e seta o dia como sendo o atual ao
     * objeto Calendário.
     */
    public void setDia(Integer dia) {
        CALENDARIO.set(Calendar.DAY_OF_MONTH, dia);
    }

    /**
     * @param mes
     *
     * Recebe um mês como parâmetro e seta o mês como sendo o atual ao
     * objeto Calendário.
     */
    public void setMes(Integer mes) {
        CALENDARIO.set(Calendar.MONTH, mes);
    }

    /**
     * @param ano
     *
     * Recebe um ano como parâmetro e seta o ano como sendo o atual ao
     * objeto Calendário.
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
     * @return o dia atual da semana em formato numérico:
     * 
     * ( Domingo / Sunday         - > 1 )
     * ( Segunda-feira / Monday   - > 2 )
     * ( Terça-feira / Tuesday    - > 3 )
     * ( Quarta-feira / Wednesday - > 4 )
     * ( Quinta-feira / Thursday  - > 5 )
     * ( Sexta-feira / Friday     - > 6 )
     * ( Sábado / Saturday        - > 7 )
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
     * @return o mês atual em formato numérico:
     * 
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
     * Valores de parâmetro / Param values:
     * 0 -> Brasil / Nacionais
     * 1 -> 
     * 2 -> 
     * 3 -> 
     * 4 -> 
     * 5 -> 
     * 6 -> Ceará
     *
     * @param uf 
     * @return um Object[][][] contendo feriados e suas informações
     */
    public Object[][][] getFeriadosEstadual(int uf) {
            switch(uf) {
                case 0:
                    return Feriados.NACIONAL.getFeriados();
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    return Feriados.CEARA.getFeriados();
                default:
                    break;
            }
       return new Object[][][]{{{}}};
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
     * @return uma String em formato dd/MM/yyyy
     * dd   - > dia
     * MM   - > mês
     * yyyy - > ano
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
        if((this.getDiaAtualMes() > t.getDiaAtualMes() && this.getMesAtual() > t.getMesAtual() 
                && this.getAnoAtual() > t.getAnoAtual())
                || (this.getDiaAtualMes() > t.getDiaAtualMes() && this.getMesAtual() > t.getMesAtual() 
                && this.getAnoAtual().equals(t.getAnoAtual()))
                || (this.getDiaAtualMes() > t.getDiaAtualMes() && this.getMesAtual().equals(t.getMesAtual())
                && this.getAnoAtual().equals(t.getAnoAtual()))
                || (this.getMesAtual() > t.getMesAtual() && this.getAnoAtual() > t.getAnoAtual())
                || (this.getAnoAtual() > t.getAnoAtual())) {
          return 1;
        }
        else if(this.getDiaAtualMes().equals(t.getDiaAtualMes())
                && this.getMesAtual().equals(t.getMesAtual())
                && this.getAnoAtual().equals(t.getAnoAtual())) {
            return 0;
        }
        else
            return -1;
    }
    
    public static void main(String[] args) {
        Tempo t = new Tempo();
        System.out.println(t.getFeriadosEstadual(6)[0][0][0]);
    }
}