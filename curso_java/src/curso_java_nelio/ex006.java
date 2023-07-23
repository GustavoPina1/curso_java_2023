package curso_java_nelio;

import java.util.Scanner;

public class ex006 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o código da peça 1: ");
		int cod_pec1=sc.nextInt();
		System.out.println("Digite a quantidade de peças 1: ");
		int qtd_pec1=sc.nextInt();
		System.out.println("Digite o valor unitário da peça 1: ");
		double valor_pc1=sc.nextDouble();
		
		System.out.println("Digite o código da peça 2: ");
		int cod_pec2=sc.nextInt();
		System.out.println("Digite a quantidade de peças 2: ");
		int qtd_pec2=sc.nextInt();
		System.out.println("Digite o valor unitário da peça 2: ");
		double valor_pc2=sc.nextDouble();
		
		double valor_total=qtd_pec1*valor_pc1+qtd_pec2*valor_pc2;
		System.out.printf("VALOR A PAGAR: %.2f",valor_total);
	}

}
