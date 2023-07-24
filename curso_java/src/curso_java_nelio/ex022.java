package curso_java_nelio;

import java.util.Scanner;

public class ex022 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int x=sc.nextInt();
		int fat=x;
		
		if(x==0) {
			fat=1;
		}else {
			for(int i=x-1;i>0;i--) {
				fat=fat*i;
			}
		}
		System.out.println(fat);
	}

}
