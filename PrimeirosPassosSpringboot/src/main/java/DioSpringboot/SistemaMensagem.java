package DioSpringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SistemaMensagem {
	
	@Autowired
	private Remetente noreply;
	
	@Autowired
	private Remetente financeiro;
	
	public void enviarConfirmacaoCadastro() {
		System.out.println(noreply.toString());
		System.out.println("Seu cadastro foi realizado");
	}
	
	public void enviarMensagemdeBoasVindas() {
		financeiro.setEmail("tech@dio.com");
		System.out.println(financeiro.toString());
		System.out.println("Bem vindo a Tech");
	}

}
