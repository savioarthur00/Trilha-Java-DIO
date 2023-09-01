package Consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Representa uma opera��o que aceita um argumento do tipo T e n�o retorna nenhum resultado.
 * � utilizada principalmente para realizar a��es, ou efeitos colaterais nos elementos do Stream sem modificar, ou
 * retornar um valor.
 */


public class ConsumerExemplos {
  public static void main(String[] args) {
    
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
    
    System.out.println("-------------1� FORMA -------------------");
    // Usar o Consumer com express�o lambda para imprimir n�meros pares
    Consumer<Integer> imprimirNumeroPar = numero -> {
      if (numero % 2 == 0) {
        System.out.println(numero);
      }
    };
    
    numeros.stream().forEach(imprimirNumeroPar);
       
    System.out.println("-------------2� FORMA -------------------");
    // Usando o new Consumer dentro do forEach 
    numeros.stream().forEach(new Consumer<Integer>() {

		@Override
		public void accept(Integer n) {
			
			if(n % 2 == 0) {
				System.out.println(n);
			}
			
		}
	});
    
    
    System.out.println("-------------3� FORMA - LAMBDA -------------------");
    // Usar o Consumer para imprimir n�meros pares no Stream com lambda com forEach 
    numeros.stream().forEach(n -> {
    		if(n % 2 == 0) {
    				System.out.println(n);
    		}
    	}
    );
    
    
    System.out.println("-------------4� FORMA - LAMBDA -------------------");
    // Usar o Consumer para imprimir n�meros pares no Stream com lambda com filter 
    numeros.stream().filter(n -> n % 2 == 0)
        .forEach(System.out::println);
    
  }
  
  
  
}