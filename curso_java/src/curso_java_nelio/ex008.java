package curso_java_nelio;

import java.util.Scanner;

public class ex008 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um inteiro: ");
		int x = sc.nextInt();
		
		if(x<0) {
			System.out.println("NEGATIVO");
		}else {
			System.out.println("POSITIVO");		
		}
	}
}
