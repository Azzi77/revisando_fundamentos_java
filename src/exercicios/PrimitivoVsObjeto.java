package exercicios;

public class PrimitivoVsObjeto {

	public static void main(String[] args) {
		
		String s = new String ("Texto");
		s.toUpperCase();
		
		
		// wrappers são a versão objeto dos tipos
		// primitivos!
		
		int a = 123;
		System.out.println(a);

	}

}
