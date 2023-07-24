package curso_java_nelio;

import java.util.Scanner;

public class ex017 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite: 1.Álcool 2.Gasolina 3.Diesel\r\n"
				+ "4.Fim");
		
		int x=sc.nextInt();
		int soma_alcool=0;
		int soma_gasolina=0;
		int soma_diesel=0;
		
		while(x!=4) {
			if(x==1) {
				soma_alcool+=1;
			}
			else if(x==2) {
				soma_gasolina+=1;
			}
			else if(x==3) {
				soma_diesel+=1;
			}
			x=sc.nextInt();
		}
		System.out.println("MUITO OBRIGADO");
		System.out.printf("Alcool: %d\n",soma_alcool);
		System.out.printf("Gasolina: %d\n",soma_gasolina);
		System.out.printf("Diesel: %d\n",soma_diesel);
	}
}
