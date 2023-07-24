package curso_java_nelio;

import java.util.Scanner;

public class ex011 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o código do produto: ");
		int x=sc.nextInt();
		
		System.out.println("Digite a quantidade desejada: ");
		int y=sc.nextInt();
		
		if(x==1) {
			System.out.printf("TOTAL: R$ %.2f",(double)4*y);
		}
		else if(x==2) {
			System.out.printf("TOTAL: R$ %.2f",(double)4.5*y);
		}
		else if(x==3) {
			System.out.printf("TOTAL: R$ %.2f",(double)5*y);
		}
		else if(x==4) {
			System.out.printf("TOTAL: R$ %.2f",(double)2*y);
		}
		else if(x==5) {
			System.out.printf("TOTAL: R$ %.2f",(double)1.5*y);
		}
	}

}
