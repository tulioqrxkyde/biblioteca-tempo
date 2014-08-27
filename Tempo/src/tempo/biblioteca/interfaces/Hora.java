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
package tempo.biblioteca.interfaces;

/**
 *
 * @author tulio.xcrtf
 */
public interface Hora {

    public void setSegundo(Integer segundo);

    public void setMinuto(Integer minuto);

    public void setHora(Integer hora);

    public Integer getSegundoAtual();
            
    public String getSegundoAtualExtenso();

    public Integer getMinutoAtual();

    public String getMinutoAtualExtenso();

    public Integer getHoraAtual();

    public String getHoraAtualExtenso();

}