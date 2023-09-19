package ProjetoPessoal.SociedadeCampestreapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class SociedadeCampestreApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SociedadeCampestreApiApplication.class, args);
	}

}
