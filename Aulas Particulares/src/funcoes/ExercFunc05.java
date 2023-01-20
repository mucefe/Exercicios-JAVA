/*Implemente um programa que lê um vetor de inteiros e um método estático que recebe esse vetor
como parâmetro e ordena esse vetor (tente n˜ao usar Arrays.sort()).*/
//Está ordenando os vetores errado. Por que?
package funcoes;

import java.util.Scanner;

public class ExercFunc05 {
	static int[] vetor = new int[4]; // Não sei pq do 'static'. Só coloquei o que o Eclipse sugeriu

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira o primeiro dos 4 números inteiros do vetor: ");
		vetor[0] = sc.nextInt();
		System.out.print("Insira o segundo dos 4 números inteiros do vetor: ");
		vetor[1] = sc.nextInt();
		System.out.print("Insira o terceiro dos 4 números inteiros do vetor: ");
		vetor[2] = sc.nextInt();
		System.out.print("Insira o último número inteiro do vetor: ");
		vetor[3] = sc.nextInt();
		System.out.println("Os números inseridos no vetor são: " + vetor[0] + ", " + vetor[1] + ", " + vetor[2] + ", "
				+ vetor[3] + ".");
		ordenaVetor();
		System.out.println("Números ordenados: "+vetor[0]+", "+vetor[1]+", "+vetor[2]+", "+vetor[3]+".");
	}

	public static int[] ordenaVetor() {
		boolean trocar = false;
		int auxiliar = 0;
		for (int i = 0; i < vetor.length - 1; i++) {
			trocar = false;
			for (int j = 0; j < vetor.length - i - 1; j++) {
				if (vetor[j] > vetor[j + 1]) {
					auxiliar = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = auxiliar;
					trocar = true;
				}
			}
			if (trocar = true) {
				break;
			}
		}
		return vetor;
	}
	

}
