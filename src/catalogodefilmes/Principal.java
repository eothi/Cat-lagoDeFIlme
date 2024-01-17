
package catalogodefilmes;

import Calculadora.CalculadoraDeTempo;
import Calculadora.FiltroRecomencao;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());
        //meuFilme.somaDasAvaliacoes = 10;
        //meuFilme.totalDeAvaliacoes = 1;
        //System.out.println(meuFilme.pegaMedia());

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());

        Filme outroFilme = new Filme();
        outroFilme.setNome("Avatar");
        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());
        
        FiltroRecomencao filtro = new FiltroRecomencao();
            filtro.filtra(outroFilme);
            
       Episodio episodio = new Episodio();
       
       episodio.setNumero(1);
       episodio.setSerie(lost);
       episodio.setTotalDeVisualizao(400);
       filtro.filtra(episodio);
       
       
      var filmeDoThiago = new Filme();
     filmeDoThiago.setNome("Dogville");
     filmeDoThiago.setDuracaoEmMinutos(200);
     filmeDoThiago.setAnoDeLancamento(2003);
     filmeDoThiago.avalia(8);
    
    ArrayList<Filme> listaDeFilmes = new ArrayList<>();
    
    listaDeFilmes.add(filmeDoThiago);
    listaDeFilmes.add(meuFilme);
    listaDeFilmes.add(outroFilme);
    
        System.out.println("Tamanho da lista " + listaDeFilmes.size());
        System.out.println("Prmieor Filme " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
                System.out.println("ToString do filme " + listaDeFilmes.get(0).toString());

    }       
    
}