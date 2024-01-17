
package catalogodefilmes;

import Calculadora.Classificavel;

/**
 *
 * @author thiag
 */
public class Episodio  implements Classificavel{
    private int numero;
    private String nome;
    private Serie serie;
    private int totalDeVisualizao;

    public int getTotalDeVisualizao() {
        return totalDeVisualizao;
    }

    public void setTotalDeVisualizao(int totalDeVisualizao) {
        this.totalDeVisualizao = totalDeVisualizao;
    }
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }
    
    @Override
    public int getClassificacao(){
        if(totalDeVisualizao > 100){
            return 4;
        }else{
            return 2;

        }
    
    }
        
    
}
