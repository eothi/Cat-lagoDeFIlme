
package Calculadora;


public class FiltroRecomencao {
    
    
    public void filtra(Classificavel classificavel){
        if(classificavel.getClassificacao() >=4){
            System.out.println("Esta entre os preferido do momento");
        }else if (classificavel.getClassificacao() >= 2){
            System.out.println("Está ok");
        }else{
            System.out.println("Coloque na sua lista para assistir depois");
        }
            
    }
}
