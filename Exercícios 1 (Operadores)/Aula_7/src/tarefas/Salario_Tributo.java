package tarefas;

import java.util.Scanner;

public class Salario_Tributo {
	public static void main (String[] args) {
		Scanner leitor = new Scanner (System.in);
		
//		Entrada de Dados
		
		System.out.println("Digite o valor ganho por hora: ");
		double salario = leitor.nextDouble();
		
		System.out.println("Digites as quantidade de horas por mês: ");
		double horas = leitor.nextDouble();
		
		leitor.close();
		
//		Processamento
		
		double sal_bruto = salario * horas;
		double inss = sal_bruto * 0.08;
		double sindicato = sal_bruto * 0.05;
		double imposto_renda = sal_bruto * 0.11;
		double sal_liquido = sal_bruto - (imposto_renda + inss + sindicato);
		
//		Saída de Dados 
		
		System.out.println("Salário [valor bruto]: " + sal_bruto);
		System.out.println("O valor descontado do imposto de renda (11%): " + imposto_renda);
		System.out.println("O valor descontado do sindicato (5%): " + sindicato);
		System.out.println("O valor descontado do INSS (8%): " + inss);
		System.out.println("Salário [valor líquido]: " + sal_liquido);
		
	}
}
