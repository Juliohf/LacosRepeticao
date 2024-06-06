package lacosRepeticao;

import java.util.Scanner;

public class Atividade5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int soma = 0;
		int n1;
				
		do { System.out.println("Digite um numero:");
			n1 = sc.nextInt();
			if (n1 > 0) {
				soma += n1;
			}
					
				} while (n1 > 0);
		
		System.out.println("A soma dos numeros é: " + soma);
		
		
		
		
		sc.close();

	}

}
