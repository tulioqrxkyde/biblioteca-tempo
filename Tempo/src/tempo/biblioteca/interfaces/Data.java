/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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