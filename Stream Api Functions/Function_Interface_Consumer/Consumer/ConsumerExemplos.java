package Consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Representa uma operação que aceita um argumento do tipo T e não retorna nenhum resultado.
 * É utilizada principalmente para realizar ações, ou efeitos colaterais nos elementos do Stream sem modificar, ou
 * retornar um valor.
 */


public class ConsumerExemplos {
  public static void main(String[] args) {
    
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
    
    System.out.println("-------------1º FORMA -------------------");
    // Usar o Consumer com expressão lambda para imprimir números pares
    Consumer<Integer> imprimirNumeroPar = numero -> {
      if (numero % 2 == 0) {
        System.out.println(numero);
      }
    };
    
    numeros.stream().forEach(imprimirNumeroPar);
       
    System.out.println("-------------2º FORMA -------------------");
    // Usando o new Consumer dentro do forEach 
    numeros.stream().forEach(new Consumer<Integer>() {

		@Override
		public void accept(Integer n) {
			
			if(n % 2 == 0) {
				System.out.println(n);
			}
			
		}
	});
    
    
    System.out.println("-------------3º FORMA - LAMBDA -------------------");
    // Usar o Consumer para imprimir números pares no Stream com lambda com forEach 
    numeros.stream().forEach(n -> {
    		if(n % 2 == 0) {
    				System.out.println(n);
    		}
    	}
    );
    
    
    System.out.println("-------------4º FORMA - LAMBDA -------------------");
    // Usar o Consumer para imprimir números pares no Stream com lambda com filter 
    numeros.stream().filter(n -> n % 2 == 0)
        .forEach(System.out::println);
    
  }
  
  
  
}