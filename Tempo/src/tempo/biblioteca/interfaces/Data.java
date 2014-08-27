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
public interface Data {

    public void setDia(Integer dia);

    public void setMes(Integer mes);

    public void setAno(Integer ano);

    public Integer getDiaAtualSemana();

    public Integer getDiaAtualMes();

    public Integer getMesAtual();

    public Integer getAnoAtual();

    public String getDiaAtualExtensoSemana();

    public String getDiaAtualMesExtenso();

    public String getMesAtualExtenso();

    public boolean isBissexto(int ano);

    public String getAnoExtenso(int ano);

    public String getDiaSemana(int a, int m, int d, String... pattern);

}