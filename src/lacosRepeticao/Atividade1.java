package lacosRepeticao;
import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número:");
		int n1 = sc.nextInt();
		
		System.out.println("Digite o segundo número:");
		int n2 = sc.nextInt();
		
		
		if (n1 > n2) {
			System.out.println("Intervalo inválido!");
		} else {
			for(int i = n1; i < n2; i++) {
				if (i != 0 && i % 3 == 0 && i % 5 == 0) {
					System.out.println("O número " + i + " é multiplo de 3 e 5");
				}
				
				
			}
			
		}
							
		sc.close();
		

	}

}
