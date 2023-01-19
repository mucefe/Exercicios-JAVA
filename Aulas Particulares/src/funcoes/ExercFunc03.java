/*Escreva um programa com um método estático que receba dois números inteiros x e y. Essa
função deve verificar se x é divisível por y.*/

package funcoes;

import java.util.Scanner;

public class ExercFunc03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira o primeiro número inteiro: ");
		int numeroA = sc.nextInt();
		System.out.print("Insira o segundo número inteiro: ");
		int numeroB = sc.nextInt();
		
		if (verificaNumeros(numeroA,numeroB)==false) {
			System.out.println("O número "+numeroA+" NÃO é divisível por "+numeroB);
		} else {
			System.out.println("O número "+numeroA+" É divisível por "+numeroB);
		}

		sc.close();

	}

	public static boolean verificaNumeros(int a, int b) {
		boolean divisivel;
		if (a % b == 0) {
			divisivel = true;
		} else {
			divisivel = false;
		}
		return divisivel;
	}

}
