package lacosDeRepeticoes;

import java.util.Scanner;

public class Exerc09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int tamanho = 0;
		int[] vetor = new int[tamanho];
		int maior = 0;
		System.out.println("Insira o tamanho do vetor");
		tamanho = sc.nextInt();

		
		for (int i = 0; i < vetor.length; i++) { // Por que está ignorando este laço?
			System.out.print("Insira o primeiro número: ");
			vetor[i] = sc.nextInt();
		}
		for (int j = 0; j < vetor.length; j++) {
			if (maior < vetor[j]) {
				maior = vetor[j];
			}
		}
		System.out.println("O maior elemento do vetor é: " + maior);
		sc.close();
	}
}
