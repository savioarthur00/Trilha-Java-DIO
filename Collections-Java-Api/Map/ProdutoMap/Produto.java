package ProdutoMap;

import java.util.Objects;

public class Produto {
	
	private String nome;
	private int quantidade;
	private double preco;
	private Long codigo;

	
	
	public Produto(String nome, int quantidade, double preco) {
		super();
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
	}


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	
	


	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Produto))
			return false;
		Produto other = (Produto) obj;
		return Objects.equals(codigo, other.codigo);
	}


	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", quantidade=" + quantidade + ", preco=" + preco + ", codigo=" + codigo + "]";
	}
	
	
	
	

}
