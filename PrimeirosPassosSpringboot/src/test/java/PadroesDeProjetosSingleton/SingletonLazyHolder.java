package PadroesDeProjetosSingleton;

public class SingletonLazyHolder {
	
	private static class Holder{
	  public static SingletonLazyHolder instancia;
	}
	
	private SingletonLazyHolder() {
		super();
	}
	
	public static SingletonLazyHolder getInstancia() {
		
		return Holder.instancia;
		
	}
	

}
