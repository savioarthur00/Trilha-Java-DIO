package BinaryOperator;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

/**
 * Representa uma opera��o que combina dois argumentos do tipo T e retorna um resultado do mesmo tipo T.
 * � usada para realizar opera��es de redu��o em pares de elementos, como somar n�meros ou combinar objetos.
 */


public class BinaryOperatorExample {
  public static void main(String[] args) {
	  
	  System.out.println("-------------1� FORMA -------------------");
    // Criar uma lista de n�meros inteiros
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

    // Usar o BinaryOperator com express�o lambda para somar dois n�meros inteiros
    BinaryOperator<Integer> somar = Integer::sum;

    // Usar o BinaryOperator para somar todos os n�meros no Stream
    int resultado = numeros.stream()
        .reduce(0, Integer::sum);

    // Imprimir o resultado da soma
    System.out.println("A soma dos n�meros �: " + resultado);
  }
}