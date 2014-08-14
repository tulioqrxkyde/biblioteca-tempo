/* Este arquivo é parte da API Tempo.
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
     * @param dia
     *
     * Recebe um dia como parâmetro e seta o dia como sendo o atual ao
     * Calendário.
     */
    public void setDia(Integer dia) {
        CALENDARIO.set(Calendar.DAY_OF_MONTH, dia);
    }

    /**
     * @param mes
     *
     * Recebe um mês como parâmetro e seta o mês como sendo o atual ao
     * Calendário.
     */
    public void setMes(Integer mes) {
        CALENDARIO.set(Calendar.MONTH, mes);
    }

    /**
     * @param ano
     *
     * Recebe um ano como parâmetro e seta o ano como sendo o atual ao
     * Calendário.
     */
    public void setAno(Integer ano) {
        CALENDARIO.set(Calendar.YEAR, ano);
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
        return Dias.valueOf("DIA_".concat((String.valueOf(CALENDARIO.get(Calendar.DAY_OF_MONTH))))).getNome();

    }
    
    /**
     * @return o mês atual em formato texto
     */
    public String getMesAtualExtenso() {
        S_DATA.applyPattern("MMMMM");
        return S_DATA.format(DATA);
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
}