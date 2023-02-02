package exercicios;

public class NotacaoPonto {

	public static void main(String[] args) {
		
		String s = "Bom Dia X";
		s = s.replace("X", "Senhora"); // vai substituir o X por Senhora
		s = s.toUpperCase(); // vai transformar a String toda em maiuscula 
		s = s.concat("!!!!!");
		
		System.out.println(s);
		
		System.out.println("leo".toUpperCase()); /// posso colocar direto no print tambem

	}

}
