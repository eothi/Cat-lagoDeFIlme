
 
package Principal;

import catalogodefilmes.Filme;
import catalogodefilmes.Serie;
import catalogodefilmes.Titulo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


public class Principal_Lista {
    public static void main(String[] args) {
             Filme meuFilme = new Filme("O poderoso chefão",1970);
             meuFilme.avalia(7);
             Serie lost = new Serie("lost",2000);
                    lost.avalia(8);
             Filme outroFilme = new Filme("avatar", 2023);
                outroFilme.avalia(9);
             var filmeDoThiago = new Filme("Dogville", 2003);
                filmeDoThiago.avalia(10);
        
             ArrayList<Titulo> lista = new ArrayList<>();
    
            lista.add(filmeDoThiago);
            lista.add(meuFilme);
            lista.add(outroFilme);
            lista.add(lost);
            
          for(Titulo item:lista){
              System.out.println(item.getNome());
              if( item instanceof Filme filme){
              System.out.println("Classsificação " + filme.getClassificacao());

              }
              
          }
          
          
       ArrayList<String> buscaPorArtista = new ArrayList<>();
       buscaPorArtista.add("Adam Sandler");
       buscaPorArtista.add("Thiago");
       buscaPorArtista.add("Paulo");
        System.out.println(buscaPorArtista);
        Collections.sort(buscaPorArtista);
        System.out.println(buscaPorArtista);
        System.out.println("Lista de Titulos ordenados");
        Collections.sort(lista);
        System.out.println(lista);
          
    }
}
