package curso_java_nelio;

import java.util.Scanner;

public class ex021 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int x=sc.nextInt();
		
		for(int i=1;i<=x;i++) {
			double a=sc.nextDouble();
			double b=sc.nextDouble();
			if(b==0) {
				System.out.println("Divisao impossível");
			}
			else {
				System.out.printf("%.1f",a/b);
			}
		}
	}

}
