/*O máximo divisor comum (MDC) de dois inteiros é o maior inteiro que é divisível por cada
um dos dois números. Escreva um método mdc que retorna o máximo divisor comum de dois
inteiros. [Dica: você poderia querer utilizar o algoritmo de Euclides] Incorpore o método a um
aplicativo que lê dois valores do usuário e exibe o resultado.*/


package metodos;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira o primeiro número: ");
		int num1 = sc.nextInt();
		System.out.print("Insira o segundo número: ");
		int num2 = sc.nextInt();
		System.out.println("O Máximo Divisor Comum (MDC) de " + num1 + " e " + num2 + " é: " + mdc(num1, num2));
		sc.close();
	}

	public static int mdc(int n1, int n2) {
		int mdc = 0;
		if (n1 > n2) {
			for (int i = 1; i < n1; i++) {
				if (i % n1 == 0 && i % n2 == 0 && i > mdc) {
					mdc += i;

				}
			}
		}
		if (n2 > n1) {
			for (int i = 1; i < n2; i++) {
				if (i % n1 == 0 && i % n2 == 0 && i > mdc) {
					mdc += i;

				}
			}

		}
		return mdc;
	}
}
