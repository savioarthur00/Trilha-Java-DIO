package DioSpringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class PrimeirosPassosSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimeirosPassosSpringbootApplication.class, args);
	}
	
//	@Bean 
//	public CommandLineRunner run () throws Exception{
//		
//		return args -> {
////			String json = "{\"cep\": \"01001-000\", \"logradouro\": \"Praça da sé\" ,\"localidade\": \"Rio\"}";
////			ViaCepResponse response  = conversor.converter(json);
////			System.out.println("Dados: "+response);
//////			
////			mensagem.enviarConfirmacaoCadastro();
////			mensagem.enviarMensagemdeBoasVindas();
////			mensagem.enviarConfirmacaoCadastro();
//			
//		};
		
	}
	
	


