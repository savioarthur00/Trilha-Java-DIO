package Ordenacao_Numeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ordenacao_Numeros  {
	
	public List<Integer> numeros;

	public Ordenacao_Numeros() {
		numeros = new ArrayList<Integer>();
	}
	
	
	public void adicionarNumero(int numero) {
		numeros.add(numero);
	}
	
	public List<Integer> ordenarAscendente() {
		List<Integer> listaAscendente  = new ArrayList<Integer>(this.numeros);
		
		if(!numeros.isEmpty()) {
		Collections.sort(listaAscendente);
		}else {throw new RuntimeException("A lista está vazia!");}
		
		return listaAscendente;
				
	}
	
	 public List<Integer> ordenarDescendente(){
		 List<Integer> listaDescendente  = new ArrayList<Integer>(this.numeros);
			
			if(!numeros.isEmpty()) {
				listaDescendente.sort(Collections.reverseOrder());		
			
			}else {throw new RuntimeException("A lista está vazia!");}
			
			return listaDescendente;
	 }
	 
	 
	 public void exibirNumeros() {
		    if (!numeros.isEmpty()) {
		      System.out.println(this.numeros);
		    } else {
		      System.out.println("A lista está vazia!");
		    }
		  }

		  public static void main(String[] args) {
		    
		    Ordenacao_Numeros numeros = new Ordenacao_Numeros();

		   
		    numeros.adicionarNumero(2);
		    numeros.adicionarNumero(5);
		    numeros.adicionarNumero(4);
		    numeros.adicionarNumero(1);
		    numeros.adicionarNumero(99);
		    numeros.adicionarNumero(22);
		    numeros.adicionarNumero(13);
		    numeros.adicionarNumero(20);

		    System.out.println("Lista por inserção:");
		    numeros.exibirNumeros();


		    System.out.println("Lista ordenada ascendente:");
		    System.out.println(numeros.ordenarAscendente());

		    
		    

		    System.out.println("Lista ordenada descendente:");
		    System.out.println(numeros.ordenarDescendente());

		    
		    
		  }
	
	
	

}
