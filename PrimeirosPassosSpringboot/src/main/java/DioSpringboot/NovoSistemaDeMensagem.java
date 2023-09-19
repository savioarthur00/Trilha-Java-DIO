package DioSpringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class NovoSistemaDeMensagem implements CommandLineRunner {
	
	@Autowired
	private Usuario usuario;

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("Mensagem enviada por: " +usuario.getNome() + "\n" +
		"Email: " + usuario.getEmail() + "\n"+
		"Telefone: " + usuario.getTelefones());
		
		
	}
	

}
