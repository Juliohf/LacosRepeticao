package lacosRepeticao;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		char n = 's';re
		int idatotal = 0; //idade total das respostas
		int totalresp= 0; //quantidade de gente que respondeu
		int be = 0; //desenvolvedores backend
		int mfe= 0; //desenvolvedores mulheres frontend
		int hme= 0;  //desenvolvedores homens mobile
		int nb = 0; //nao binarios
				
		
		while (n == 's' || n == 'S') {
			System.out.println("Qual sua idade?");
			int ida = sc.nextInt();
			idatotal += ida;
					
			System.out.println("Qual sua identidade de gênero?");
			System.out.println("1 – Mulher Cis");
			System.out.println("2 – Homem Cis");
			System.out.println("3 – Não Binário");
			System.out.println("4 – Mulher Trans");
			System.out.println("5 – Homem Trans");
			System.out.println("6 – Outros");
			int gen = sc.nextInt();
			
			
			System.out.println("Qual sua especialização?");
			System.out.println("1 – Backend");
			System.out.println("2 – FrontEnd");
			System.out.println("3 – Mobile");
			System.out.println("4 – FullStack");
			int esp = sc.nextInt();
			
			if (esp == 1) {
				be ++;
			}
			
			if ((gen == 1 || gen == 4) && esp == 2) {
				mfe++;
			}
			
			if ((gen == 2 || gen == 5) && esp == 3 && ida > 40){
				hme++;
			}
			
			if (gen == 3 && esp == 4 && ida < 30) {
				nb++;
			}		

				
			totalresp ++;
			
			System.out.println("Deseja continuar a leitura dos dados de um novo colaborador? Digite S para sim e N para não:");
			n = sc.next().charAt(0);
					
		}
		
		System.out.println("O número de pessoas desenvolvedoras Backend: " + be);
		System.out.println("O número de Mulheres Cis e Trans desenvolvedoras Frontend " +  mfe);
		System.out.println("O número de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + hme);		 
		System.out.println("O número de Não Binários desenvolvedores FullStack menores de 30 anos: " + nb);		 
		System.out.println("O número total de pessoas que responderam à pesquisa: " + totalresp);		 
		System.out.println("A média de idade das pessoas que responderam à pesquisa: " + idatotal / totalresp);
				
		sc.close();

	}

}
