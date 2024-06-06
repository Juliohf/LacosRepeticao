package lacosRepeticao;

import java.util.Scanner;

public class Atividade6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float media = 0.0f;
		int ns = 0;
		float n1;
				
		do { System.out.println("Digite um numero:");
			n1 = sc.nextFloat();
			if (n1 > 0 && n1 % 3 == 0) {
				media += n1;
				ns++;
			}
					
				} while (n1 != 0);
		
		System.out.println("A média dos numeros multiplos de 3 é: " + media / ns);
		
		
		
		
		
		sc.close();

	}

}
