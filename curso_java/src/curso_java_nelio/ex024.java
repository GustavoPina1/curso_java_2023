package curso_java_nelio;

import java.util.Scanner;

public class ex024 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um inteiro: ");
		int x=sc.nextInt();
		
		for(int i=1;i<=x;i++) {
			System.out.printf("%d %d %d\n",i,(int)Math.pow(i, 2),(int)Math.pow(i, 3));
		}
	}
}
