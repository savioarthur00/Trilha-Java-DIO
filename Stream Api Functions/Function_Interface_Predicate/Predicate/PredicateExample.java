package Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Representa uma fun��o que aceita um argumento do tipo T e retorna um valor booleano (verdadeiro oufalso).
 * � comumente usada para filtrar os elementos do Stream com base em alguma condi��o.
 */

public class PredicateExample {
  public static void main(String[] args) {
	  
    // Criar uma lista de palavras
    List<String> palavras = Arrays.asList("java", "kotlin", "python", "javascript", "c", "go", "ruby");

    System.out.println("-------------1� FORMA -------------------");
 
    Predicate<String> maisDeCincoCaracteres1 = palavra -> palavra.length() > 5;

    palavras.stream()
        .filter(new Predicate<String>() {

			@Override
			public boolean test(String p) {
				
				return p.length()>5;
			}
		
        
        
        })
        .forEach(System.out::println);
    
    
    System.out.println("-------------2� FORMA -------------------");
    
    Predicate<String> maisDeCincoCaracteres2 = palavra -> palavra.length() > 5;

    palavras.stream()
        .filter (p-> p.length()>5)		
		.forEach(System.out::println);
    
    
    
    
    System.out.println("-------------3� FORMA -------------------");
    // Criar um Predicate que verifica se a palavra tem mais de 5 caracteres
    Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;

    // Usar o Stream para filtrar as palavras com mais de 5 caracteres e, em seguida,
    // imprimir cada palavra que passou no filtro
    palavras.stream()
        .filter(maisDeCincoCaracteres)
        .forEach(System.out::println);
  }
}