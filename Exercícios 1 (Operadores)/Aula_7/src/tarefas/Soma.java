package tarefas;

import java.util.Scanner;

public class Soma {
	public static void main (String[] args) {
		Scanner leitor = new Scanner (System.in);
		
		// Entrada de Dados
		
		System.out.println("Digite um valor: ");
		int valor_1 = leitor.nextInt();
		
		System.out.println("Digite mais um valor: ");
		int valor_2 = leitor.nextInt();
		
		leitor.close();
		
		// Processamento
		
		int total = valor_1 + valor_2;
		
		// Saída de Dados
		
		System.out.println("A soma de " + valor_1 + " e " + valor_2 + " resulta em " + total + ".");
	}
}
