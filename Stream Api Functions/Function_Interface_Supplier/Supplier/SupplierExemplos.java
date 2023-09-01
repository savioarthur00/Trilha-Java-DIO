package Supplier;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Representa uma opera��o que n�o aceita nenhum argumento e retorna um resultado do tipo T.
 * � comumente usada para criar ou fornecer novos objetos de um determinado tipo.
 */

public class SupplierExemplos {
  public static void main(String[] args) {
	  System.out.println("-------------1� FORMA -------------------");
	  List<String> listaSaudacoes1 = Stream.generate(
			  new Supplier<String>() {

				@Override
				public String get() {
					
					return "Supplier interno";
				}
				  
			  }
	  ) .limit(5).collect(Collectors.toList());
	  listaSaudacoes1.forEach(System.out::println);
	  
	  System.out.println("-------------2� FORMA -------------------");
	  
	  
	  List<String> listaSaudacoes2 = Stream.generate(
			 ()->"Supplier interno sem argumento").limit(5).collect(Collectors.toList());
	  
	  listaSaudacoes2.forEach(System.out::println);
	  
	  
	  
	  System.out.println("-------------3� FORMA -------------------");
	  
    // Usar o Supplier com express�o lambda para fornecer uma sauda��o personalizada
    Supplier<String> saudacao = () -> "Ol�, seja bem-vindo(a)!";   
    
    // Usar o Supplier para obter uma lista com 5 sauda��es
    List<String> listaSaudacoes = Stream.generate(saudacao).limit(5)
    .collect(Collectors.toList());

    // Imprimir as sauda��es geradas
    listaSaudacoes.forEach(System.out::println);
    
    
  }
}