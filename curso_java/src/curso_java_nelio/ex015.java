package curso_java_nelio;

import java.util.Locale;
import java.util.Scanner;

public class ex015 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a senha: ");
		int x= sc.nextInt();
		
		while(x!=2002) {
			System.out.println("Senha Invalida");
			x= sc.nextInt();
		}
		System.out.println("Acesso Permitido");
	}
}
