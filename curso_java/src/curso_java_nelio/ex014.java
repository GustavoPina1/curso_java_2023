package curso_java_nelio;

import java.util.Scanner;

public class ex014 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o salario: ");
		double x = sc.nextDouble();
		
		if(x>=0 && x<=2000) {
			System.out.println("Isento");
		}
		else if(x>2000 && x<=3000) {
			System.out.printf("R$ %.2f",(x-2000)*0.08);
		}
		else if(x>3000 && x<=4500) {
			System.out.printf("R$ %.2f",(x-3000)*0.18+((x-2000)-(x-3000))*0.08);
		}
		else if(x>4500) {
			System.out.printf("R$ %.2f",(x-4500)*0.28+((x-3000)-(x-4500))*0.18+(((x-2000)-(x-3000))*0.08));
		}
	}

}
