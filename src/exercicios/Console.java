package exercicios;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		System.out.print("Bom");
		System.out.print(" dia!\n\n");
		
		System.out.println("Bom");
		System.out.println("dia!!");
		System.out.printf("MegaSena: %d  %d  %d  %d  %d  %d \n", 1,2,3,4,5,6);
		
		System.out.printf("Salario:  %.1f", 1234.5678);
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digire o seu sobrenome");
		String sobrenome = entrada.nextLine();
		
		System.out.print("Digire o seu sobrenome");
		String idade = entrada.nextLine();
		
		System.out.printf("%s %s tem %d anos.%n",
				nome, sobrenome, idade);
		
		
   entrada.close();

	}

}
