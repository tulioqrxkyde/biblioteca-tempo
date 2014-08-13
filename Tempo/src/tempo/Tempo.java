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

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/**
 *
 * @author tulio.xcrtf
 */
public class Tempo {

    private final Calendar CALENDARIO = Calendar.getInstance();
    private final Date DATA = new Date();
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
     *
     * @param dia
     *
     * Recebe um dia como parâmetro e seta o dia como sendo o atual ao
     * Calendário.
     */
    public void setDia(Integer dia) {
        CALENDARIO.set(Calendar.DAY_OF_MONTH, dia);
    }

    /**
     *
     * @param mes
     *
     * Recebe um mês como parâmetro e seta o mês como sendo o atual ao
     * Calendário.
     */
    public void setMes(Integer mes) {
        CALENDARIO.set(Calendar.MONTH, mes);
    }

    /**
     *
     * @param ano
     *
     * Recebe um ano como parâmetro e seta o ano como sendo o atual ao
     * Calendário.
     */
    public void setAno(Integer ano) {
        CALENDARIO.set(Calendar.YEAR, ano);
    }

    /**
     * @return o objeto Calendar
     */
    public Calendar getCALENDARIO() {
        return CALENDARIO;
    }

    /**
     * @return a o objeto Date
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
     * @param zona a zona que deseja definir
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
     * @param local o local que deseja definir
     */
    public void setLocal(Locale local) {
        this.local = local;
    }

}