package Function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Representa uma fun��o que aceita um argumento do tipo T e retorna um resultado do tipo R.
 * � utilizada para transformar, ou mapear os elementos do Stream em outros valores, ou tipos.
 */

public class FunctionExemplos {
  public static void main(String[] args) {
	// Criar uma lista de n�meros inteiros
	List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
	
	System.out.println("-------------1� FORMA -------------------");
	 
	List<Integer>numerosdobrados1 = numeros.stream().
			map(
			new Function<Integer,Integer> (){
				@Override
				public Integer apply(Integer n) {					
					return n*3;
				}				
			}).collect(Collectors.toList());    
	
	  numerosdobrados1.forEach(System.out::println);
	  
	System.out.println("-------------2� FORMA -------------------");
	
	List<Integer>numerosdobrados2 = numeros.stream().
			map(n -> n*4)			
			.collect(Collectors.toList());   
	
	  numerosdobrados2.forEach(System.out::println);
	
	
	System.out.println("-------------3� FORMA -------------------");
	    
    // Usar a Function com express�o lambda para dobrar todos os n�meros
    Function<Integer, Integer> dobrar = numero -> numero * 2;
    
   
    // Usar a fun��o para dobrar todos os n�meros no Stream e armazen�-los em outra lista
    List<Integer> numerosDobrados = numeros.stream()
        .map(n -> n * 2).collect(Collectors.toList());       

    // Imprimir a lista de n�meros dobrados
    numerosDobrados.forEach(System.out::println);
    
    
    
  }
}