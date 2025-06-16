package tarefas;

import java.util.Scanner;

public class Media_Notas {
		public static void main (String[] args) {
			Scanner leitor = new Scanner (System.in);
			
			// Entrada de Dados
			
			System.out.println("Valor da 1° nota: ");
			double nota_1 = leitor.nextDouble();
			
			System.out.println("Valor da 2° nota: ");
			double nota_2 = leitor.nextDouble();
			
			System.out.println("Valor da 3° nota: ");
			double nota_3 = leitor.nextDouble();
			
			System.out.println("Valor da 4° nota: ");
			double nota_4 = leitor.nextDouble();
			
			leitor.close();
			
			// Processamento 
			
			double media = (nota_1 + nota_2 +  nota_3 + nota_4) / 4;
			
			// Saída de Dados 
			
			System.out.println("A média da nota é " + media);
		}
}
