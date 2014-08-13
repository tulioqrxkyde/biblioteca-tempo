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

}