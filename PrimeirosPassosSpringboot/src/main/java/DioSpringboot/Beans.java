package DioSpringboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.google.gson.Gson;

@Configuration
public class Beans {
	
	@Bean 
	public Gson gson() {
		return new Gson();
	}
	
	@Bean 
	@Scope ("prototype")
	public Remetente remetente () {
		System.out.println("Criando objeto remetente");
		Remetente remetente = new Remetente();
		remetente.setEmail("norely@reply.com");
		remetente.setNome("Digital One");
		return remetente;
	}

}
