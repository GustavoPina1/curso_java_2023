package curso_java_nelio;

import java.util.Scanner;

public class ex007 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 3 valores: ");
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		
		System.out.printf("TRIANGULO: %.3f\n",A*C/2);
		System.out.printf("CIRCULO: %.3f\n",Math.PI*Math.pow(C,2));
		System.out.printf("TRAPEZIO: %.3f\n",(A+B)*C/2);
		System.out.printf("QUADRADO: %.3f\n",B*B);
		System.out.printf("RETANGULO: %.3f\n",A*B);
			
	}

}
