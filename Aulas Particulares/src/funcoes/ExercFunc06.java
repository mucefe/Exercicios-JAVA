package funcoes;

import java.util.Arrays;
import java.util.Scanner;

public class ExercFunc06 {

	
	public static void main(String[] args) {
		int[] novoVetor=leVetor();
		System.out.println(Arrays.toString(novoVetor));
		int posicao=procura(novoVetor,5);
		System.out.println(posicao);
		System.out.println(buscaBinaria(novoVetor,5));

	}
	public static int[] leVetor() {
		Scanner sc = new Scanner(System.in);
		int[] vetor = new int[4];
		for (int i=0;i<vetor.length;i++) {
			System.out.print("Insira um número: ");
			vetor[i]=sc.nextInt();		}
	sc.close();
		return vetor;
		
	
	}
	public static int procura(int[] novoVetor,int numero) {
		for (int i=0;i<novoVetor.length;i++) {
			if(novoVetor[i]==numero) {
				return i;
			}
		}
		return -1;
	}
	public static int buscaBinaria(int[] novoVetor, int numero) {
		final int NOT_FOUND=-1;
		int low =0;
		int high = novoVetor.length-1;
		int middle;
		while (low<=high) {
			middle=(low+high)/2;
			if (novoVetor[middle]<numero) {
				low = middle+1;
				
			}else if (novoVetor[middle]>numero) {
				high=middle-1;
			} else {
				return middle;
			}
			
		}
		return NOT_FOUND;
	}

}
