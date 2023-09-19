package PadroesDeProjetosStrategy;

public class App {
	public static void main(String[] args) {
		
		Comportamento normal  = new ComportamentoNormal();
		Comportamento defensivo  = new ComportamentoDefensivamente();
		Comportamento agressivo  = new ComportamentoAgressivamente();
		
		
		Robo robo = new Robo();
		robo.setComportamento(normal);
		
		robo.mover();
		
	}

}
