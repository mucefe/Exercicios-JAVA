package lacosDeRepeticoes;

import java.util.Arrays;
import java.util.Scanner;

public class Exerc16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] vetor = { 3, 4, 12, 8, 8, 7, 7, 15, 7, 23, 5 };
		int zeros = 0;

		Arrays.sort(vetor);
		for (int i = 0; i < vetor.length - 1; i++) {
			if (vetor[i] == vetor[i + 1]) {
				vetor[i] = 0;

			}

		}
		Arrays.sort(vetor);
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == 0) {
				zeros++;
			}
		}
		int[] novoVetor = new int[vetor.length - zeros];

		for (int i = 0; i < novoVetor.length; i++) {
			novoVetor[i] = vetor[i + zeros];
		}

		System.out.println(Arrays.toString(novoVetor));
		sc.close();
	}

}
