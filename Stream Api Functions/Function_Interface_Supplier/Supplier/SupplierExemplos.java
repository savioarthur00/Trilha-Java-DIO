package Supplier;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Representa uma operação que não aceita nenhum argumento e retorna um resultado do tipo T.
 * É comumente usada para criar ou fornecer novos objetos de um determinado tipo.
 */

public class SupplierExemplos {
  public static void main(String[] args) {
	  System.out.println("-------------1º FORMA -------------------");
	  List<String> listaSaudacoes1 = Stream.generate(
			  new Supplier<String>() {

				@Override
				public String get() {
					
					return "Supplier interno";
				}
				  
			  }
	  ) .limit(5).collect(Collectors.toList());
	  listaSaudacoes1.forEach(System.out::println);
	  
	  System.out.println("-------------2º FORMA -------------------");
	  
	  
	  List<String> listaSaudacoes2 = Stream.generate(
			 ()->"Supplier interno sem argumento").limit(5).collect(Collectors.toList());
	  
	  listaSaudacoes2.forEach(System.out::println);
	  
	  
	  
	  System.out.println("-------------3º FORMA -------------------");
	  
    // Usar o Supplier com expressão lambda para fornecer uma saudação personalizada
    Supplier<String> saudacao = () -> "Olá, seja bem-vindo(a)!";   
    
    // Usar o Supplier para obter uma lista com 5 saudações
    List<String> listaSaudacoes = Stream.generate(saudacao).limit(5)
    .collect(Collectors.toList());

    // Imprimir as saudações geradas
    listaSaudacoes.forEach(System.out::println);
    
    
  }
}