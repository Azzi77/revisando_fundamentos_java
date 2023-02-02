package exercicios;

public class ConversaoPrimitivo {

	public static void main(String[] args) {
	// conversao tipo primitivo numerico
		
		double a = 1; //implicita
		System.out.println(a);
		
		float b = (float) 1.123456788888; // explicita CAST
		System.out.println(b);
		
		int c = 340;
		byte d = (byte) c; // explicita CAST
		
		System.out.println(d);
		
		double e = 1.9999999;
		int f = (int)e;      // explicita CAST
		System.out.println(f);
		
  // conversão tipo numerico para String
		
		Integer num1 = 10000;
		
		System.out.println(num1.toString().length());  // toString converte numero em string e o length faz a contagem da string nesse caso 5 caractere
	
	
	
	
	}

}
