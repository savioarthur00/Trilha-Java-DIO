package List_CarrinhoCompra;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	
	private List<Item> itens;
	
	
	
	private CarrinhoDeCompras() {
		 itens = new ArrayList<Item>();
	}

	public void adicionarItem(String nome, double preco, int quantidade) {
		itens.add(new Item(nome,preco,quantidade));
	}
	
	public void removerItem(String nome) {
		List<Item>listaRemovidos = new ArrayList<Item>();
		
		for (Item item :itens ) {
			if(item.getName().equalsIgnoreCase(nome)) {
				listaRemovidos.add(item);
			}
			
		}
		itens.removeAll(listaRemovidos);
	}
	
	public int calcularValorTotal() {
		int valorTotal =0;
		
		for (Item item : itens) {
			valorTotal += item.getQuantidade()* item.getPreco();
		}
		return valorTotal;
		
	}
	
	public void exibirItens() {
		System.out.println(itens);
	}
	
	public static void main(String[] args) {
		CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
		carrinhoDeCompras.adicionarItem("Bola", 10, 2);
		carrinhoDeCompras.adicionarItem("Calculadora", 8, 3);
		
		System.out.println(carrinhoDeCompras.calcularValorTotal());
		
		carrinhoDeCompras.exibirItens();
		
		
		
		
	}

}
