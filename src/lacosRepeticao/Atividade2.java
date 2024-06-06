package lacosRepeticao;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int par = 0;
		int impar = 0;
		
		
		
		for (int i = 1; i < 11; i++) {
			System.out.println("Digite o " + i + "° número");
			int cont = sc.nextInt();
			
				if (cont%2 == 0) {
					par++;
				} else {
					impar++;
				}
		}
		
		System.out.println("Total de numeros pares: " + par + " Total de números impares: " + impar);
		
		
		
		sc.close();
				
	}

}
