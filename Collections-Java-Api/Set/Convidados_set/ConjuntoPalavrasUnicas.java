package Convidados_set;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

  private Set<String> palavrasUnicasSet;

  public ConjuntoPalavrasUnicas() {
    this.palavrasUnicasSet = new HashSet<>();
  }

  public void adicionarPalavra(String palavra) {
    palavrasUnicasSet.add(palavra);
  }

  public void removerPalavra(String palavra) {
    if (!palavrasUnicasSet.isEmpty()) {
      if (palavrasUnicasSet.contains(palavra)) {
        palavrasUnicasSet.remove(palavra);
      } else {
        System.out.println("Palavra n�o encontrada no conjunto!");
      }
    } else {
      System.out.println("O conjunto est� vazio!");
    }
  }

  public boolean verificarPalavra(String palavra) {
    return palavrasUnicasSet.contains(palavra);
  }

  public void exibirPalavrasUnicas() {
    if(!palavrasUnicasSet.isEmpty()) {
      System.out.println(palavrasUnicasSet);
    } else {
      System.out.println("O conjunto est� vazio!");
    }
  }

  public static void main(String[] args) {
   
    ConjuntoPalavrasUnicas conjuntoLinguagens = new ConjuntoPalavrasUnicas();

   
    conjuntoLinguagens.adicionarPalavra("Java");
    conjuntoLinguagens.adicionarPalavra("Python");
    conjuntoLinguagens.adicionarPalavra("JavaScript");
    conjuntoLinguagens.adicionarPalavra("Python");
    conjuntoLinguagens.adicionarPalavra("C++");
    conjuntoLinguagens.adicionarPalavra("Ruby");

  
    conjuntoLinguagens.exibirPalavrasUnicas();
    
    conjuntoLinguagens.removerPalavra("Python");
    conjuntoLinguagens.exibirPalavrasUnicas();

   
    conjuntoLinguagens.removerPalavra("Swift");

   
    System.out.println("A linguagem 'Java' est� no conjunto? " + conjuntoLinguagens.verificarPalavra("Java"));
    System.out.println("A linguagem 'Python' est� no conjunto? " + conjuntoLinguagens.verificarPalavra("Python"));

   
    conjuntoLinguagens.exibirPalavrasUnicas();
  }
}