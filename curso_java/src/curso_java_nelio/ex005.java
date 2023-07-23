package curso_java_nelio;

import java.util.Scanner;

public class ex005 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número do funcionário: ");
		int nr_funcionario=sc.nextInt();
		
		System.out.println("Digite o valor que recebe por hora: ");
		double valor_hora=sc.nextDouble();
		
		System.out.println("Digite as horas trabalhadas: ");
		int horas_trabalhadas=sc.nextInt();
		
		double salario = (double) horas_trabalhadas*valor_hora;
		
		System.out.printf("NUMBER: %d\n",nr_funcionario);
		System.out.printf("SALARY: U$ %.2f\n",salario);
		
	}
}
