package aulas;

import java.util.Arrays;
import java.util.Scanner;

public class FuncoesVetores {

	public static void main(String[] args) {
//		int[] vetor=leVetor();
		int[] vetor2= {3,5,2,9};
//		System.out.println(somaVetor(vetor));
//		System.out.println(Arrays.toString(subtraiVetor(vetor,3)));
//		System.out.println(somaVetor(vetor));
//		System.out.println(Arrays.toString(somaVetores(vetor,vetor2)));
		imprime(vetor2,0);
		System.out.println(somaRecursao(vetor2,0));
		

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
	public static int somaVetor(int[]vetor) {
		int soma=0;
		for (int i=0;i<vetor.length;i++) {
			soma+=vetor[i];
		}
		return soma;
	}
	public static int[] subtraiVetor(int[]vetor,int numero) {
		int[] vetorSubtraido = new int[vetor.length];
		for (int i =0;i<vetor.length;i++) {
		vetorSubtraido[i]=vetor[i]-numero;	
		}
		return vetor;
	}
	public static int[] somaVetores(int[] vetorA,int[] vetorB) {
		int[] vetorSoma = new int[vetorA.length];
		for (int i=0;i<vetorA.length;i++) {
			vetorSoma[i]=vetorA[i]+vetorB[i];
		}
		return vetorSoma;
	}
	public static void imprime(int[] vetor,int posicao) {
		
		if (posicao<vetor.length) {
			System.out.println(vetor[posicao]);
			imprime(vetor,posicao+1);
		}
		
	}
	public static int somaRecursao(int[] vetor,int posicao) {
		if (posicao==vetor.length-1) {
		return vetor[posicao];
		} 
		return vetor[posicao]+somaRecursao(vetor,posicao+1);
	}
	
}
