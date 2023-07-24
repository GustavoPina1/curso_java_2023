package curso_java_nelio;

import java.util.Scanner;

public class ex019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor inteiro: ");
		int x=sc.nextInt();
		int soma_in=0;
		int soma_out=0;
		
		for(int i=1;i<=x;i++) {
			int y=sc.nextInt();
			if(y>=10 && y<=20) {
				soma_in=soma_in+1;
			}
			else {
				soma_out=soma_out+1;
			}
		}
		System.out.printf("%d in\n",soma_in);
		System.out.printf("%d out\n",soma_out);
	}

}
