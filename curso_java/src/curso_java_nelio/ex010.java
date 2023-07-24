package curso_java_nelio;

import java.util.Scanner;

public class ex010 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 2 inteiros: ");
		int x =sc.nextInt();
		int y =sc.nextInt();
		
		if(x>y && x%y==0) {
			System.out.println("Sao Multiplos");
		}
		else if(x>y && x%y !=0) {
			System.out.println("Nao sao Multiplos");
		}
		else if(y>x && y%x==0) {
			System.out.println("Sao Multiplos");
		}
		else {
			System.out.println("Nao sao Multiplos");
		}
	}

}
