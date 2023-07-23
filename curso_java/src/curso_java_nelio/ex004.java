package curso_java_nelio;

import java.util.Scanner;

public class ex004 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 4 inteiros: ");
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		
		double resultado = (double)(A*B-C*D);
		System.out.printf("DIFERENCA = %.2f",resultado);
	}

}
