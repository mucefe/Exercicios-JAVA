package lacosDeRepeticoes;

import java.util.Scanner;

public class Exerc08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int soma=0;
		int tamanho;
		System.out.println("Digite o tamanho do vetor");
		tamanho=sc.nextInt();
		int[] vetor = new int[tamanho];
		
		for (int i=0;i<tamanho;i++) {
			System.out.println("Digite o próximo número");
			vetor[i]=sc.nextInt();
		}
		for (int i=0;i<vetor.length;i++) {
		soma+=vetor[i];
		
		}
		System.out.println(soma);
		
		
		sc.close();
	}


	}


