package curso_java_nelio;

import java.util.Scanner;

public class ex013 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor de x e y do plano cartesiano: ");
		double x= sc.nextDouble();
		double y= sc.nextDouble();
		
		if(x>0 && y>0) {
			System.out.println("Q1");
		}
		else if(x>0 && y<0) {
			System.out.println("Q4");
		}
		else if(x<0 && y>0) {
			System.out.println("Q2");
		}
		else if(x<0 && y<0) {
			System.out.println("Q3");
		}
		else if(x==0 && y>0) {
			System.out.println("Eixo Y");
		}
		else if(x>0 && y==0) {
			System.out.println("Eixo X");
		}
		else if(x==0 && y==0) {
			System.out.println("Origem");
		}
	}

}
