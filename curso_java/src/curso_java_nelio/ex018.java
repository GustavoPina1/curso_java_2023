package curso_java_nelio;

import java.util.Scanner;

public class ex018 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor inteiro: ");
		int x= sc.nextInt();
		
		for(int i=1;i<=x;i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
		}
	}
}
