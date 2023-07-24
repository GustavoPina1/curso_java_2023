package curso_java_nelio;

import java.util.Scanner;

public class ex020 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor inteiro: ");
		int x=sc.nextInt();
		
		for(int i=1;i<=x;i++) {
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();
			double media=(2*a+3*b+5*c)/10;
			System.out.printf("%.1f\n",media);
		}
	}
}
