package lacosDeRepeticoes;

import java.util.Scanner;

public class Exerc10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int vetor[] = { 3, 5, 10, 8, 9 };
		int numeroBuscado=8;
		
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == numeroBuscado) {
				System.out.println("O número 8 encontra-se na posição " + i + " deste vetor");
			}
		}
	}
}
