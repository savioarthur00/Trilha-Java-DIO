package DioSpringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Myapp implements CommandLineRunner{
	
	@Autowired
	private Calculadora calculadora;
	
	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("O resultado �: " + calculadora.somar(10, 8));
		
	}

}
