package curso_java_nelio;

import java.util.Scanner;

public class ex016 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor da coordenada x e y: ");
		int x=sc.nextInt();
		int y=sc.nextInt();
		
		while(x!=0 && y!=0) {
			
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
			x=sc.nextInt();
			y=sc.nextInt();
		}
	}

}
