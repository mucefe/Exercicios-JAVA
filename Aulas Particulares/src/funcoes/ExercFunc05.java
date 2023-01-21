/*Implemente um programa que lê um vetor de inteiros e um método estático que recebe esse vetor
como parâmetro e ordena esse vetor (tente n˜ao usar Arrays.sort()).*/

//Está ordenando os vetores errado. Por que?

package funcoes;

import java.util.Arrays;
import java.util.Scanner;

public class ExercFunc05 {
	

	public static void main(String[] args) {
		int[] vetor = new int[4]; // Não sei pq do 'static'. Só coloquei o que o Eclipse sugeriu
		Scanner sc = new Scanner(System.in);
		
		for (int i=0;i<vetor.length;i++) {
			System.out.print("Insira um número: ");
			vetor[i] = sc.nextInt();
		}
		System.out.println("Os números inseridos no vetor são: "+Arrays.toString(vetor));
		ordenaVetor(vetor);
		System.out.println("Números ordenados: "+Arrays.toString(vetor));
		int n=2;
		recebeInt(n);
		System.out.println(n);
		n=recebeInt(n);
		System.out.println(n);
sc.close();
	}

	public static int[] ordenaVetor(int[] vetor) {
		boolean trocar;
		int auxiliar = 0;
		do {
			trocar=false;
			for (int j = 0; j < vetor.length - 1; j++) {
				if (vetor[j] > vetor[j + 1]) {
					auxiliar = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = auxiliar;
					trocar = true;
				}
			}
			
		}while (trocar==true);
		
		return vetor;
	}
	public static int recebeInt(int e) {
	
		return e+1;
	}
	

}
