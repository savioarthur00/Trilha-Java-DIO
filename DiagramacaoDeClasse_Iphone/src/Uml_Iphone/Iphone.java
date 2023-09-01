package Uml_Iphone;

public class Iphone implements Internet, Telefone,ReprodutorMusical {

	@Override
	public void tocar() {
		System.out.println("Tocando Musica");
		
	}

	@Override
	public void pausar() {
		System.out.println("Pausando Musica");	
		
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Selecionando Musica");	
		
	}

	@Override
	public void ligar() {
		System.out.println("Fazendo uma ligação");	
		
	}

	@Override
	public void atender() {
		System.out.println("Atendendo uma ligação");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando uma ligação");
	}

	@Override
	public void exibirPagina() {
		System.out.println("Exibindo uma página");
	}

	@Override
	public void adicionarNovaPagina() {
		System.out.println("Adicionando uma nova página");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando uma página");
		
	}
	
	

}
