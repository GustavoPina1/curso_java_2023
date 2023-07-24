package curso_java_nelio;

import java.util.Scanner;

public class ex023 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro: ");
		int x=sc.nextInt();
		
		for(int i=1;i<=x;i++) {
			if(x%i==0) {
				System.out.println(i);
			}
		}
	}

}
