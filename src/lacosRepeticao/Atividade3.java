package lacosRepeticao;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int ida1 = 0;
		int ida2 = 0;
		
		
		System.out.println("Digite uma idade ou digite um número negativo para sair:");
		int n1 = sc.nextInt();
		

	
		while (n1 > 0) {
			if (n1 >= 21 && n1 < 50) {
				ida1++;			
			} else if (n1 >= 50) {
				ida2++;
				ida1++;
			} else if (n1 < 0 ) {
				System.out.println("O programa terminou");
			}
			n1 = sc.nextInt();
		}
		System.out.println("Total de pessoas menores de 21 anos: " + ida1 + " Total de pessoas maiores de 50 anos: " + ida2);
	
		sc.close();
		
			
	}

}
