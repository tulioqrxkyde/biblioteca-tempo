/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tempo.biblioteca.unidadetempo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author tulio.xcrtf
 */
public abstract class UnidadeTempo {

    protected Calendar CALENDARIO = Calendar.getInstance();
    protected final Date DATA = new Date();
    protected final SimpleDateFormat S_DATA = new SimpleDateFormat();

}