package GerenciadorAlunos;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;



public class GerenciadorAluno {
	
	private Set<Aluno> alunosSet;

	  public GerenciadorAluno() {
	    this.alunosSet = new HashSet<>();
	  }

	  public void adicionarAluno(String nome, Long matricula, double media) {
	    alunosSet.add(new Aluno(nome, matricula, media));
	  }
	
	
	
	  public void removerAlunoPorMatricula(long matricula) {
		    Aluno alunoParaRemover = null;
		    if (!alunosSet.isEmpty()) {
		      for (Aluno a : alunosSet) {
		        if (a.getMatricula() == matricula) {
		          alunoParaRemover = a;
		          break;
		        }
		      }
		      alunosSet.remove(alunoParaRemover);
		    } else {
		      throw new RuntimeException("O conjunto est� vazio!");
		    }

		    if (alunoParaRemover == null) {
		      System.out.println("Matricula n�o encontrada!");
		    }
		  }

		  public void exibirAlunosPorNome() {
		    Set<Aluno> alunosPorNome = new TreeSet<>(alunosSet);
		    if (!alunosSet.isEmpty()) {
		      System.out.println(alunosPorNome);
		    } else {
		      System.out.println("O conjunto est� vazio!");
		    }
		  }

		  public void exibirAlunosPorNota() {
		    Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorNota());
		    if (!alunosSet.isEmpty()) {
		      alunosPorNota.addAll(alunosSet);
		      System.out.println(alunosPorNota);
		    } else {
		      System.out.println("O conjunto est� vazio!");
		    }
		  }

		  public static void main(String[] args) {
		   
			  GerenciadorAluno gerenciadorAlunos = new GerenciadorAluno();

		   
		    gerenciadorAlunos.adicionarAluno("Jo�o", 123456L, 7.5);
		    gerenciadorAlunos.adicionarAluno("Maria", 123457L, 9.0);
		    gerenciadorAlunos.adicionarAluno("Hendrick", 123458L, 5.0);
		    gerenciadorAlunos.adicionarAluno("Ana", 123459L, 6.8);

		  
		    System.out.println("Alunos no gerenciador:");
		    System.out.println(gerenciadorAlunos.alunosSet);

		    
		    gerenciadorAlunos.removerAlunoPorMatricula(123458L);
		    gerenciadorAlunos.removerAlunoPorMatricula(123457L);
		    System.out.println(gerenciadorAlunos.alunosSet);

		    
		    gerenciadorAlunos.exibirAlunosPorNome();

		    
		    gerenciadorAlunos.exibirAlunosPorNota();
		  }
	
	
	
	
	
	
	
	
	class ComparatorNota implements Comparator<Aluno> {
		  @Override
		  public int compare(Aluno o1, Aluno o2) {
		    return Double.compare(o1.getMedia(), o2.getMedia());
		  }
	}

}
