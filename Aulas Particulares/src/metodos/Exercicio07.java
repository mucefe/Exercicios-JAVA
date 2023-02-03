/*O máximo divisor comum (MDC) de dois inteiros é o maior inteiro que é divisível por cada
um dos dois números. Escreva um método mdc que retorna o máximo divisor comum de dois
inteiros. [Dica: você poderia querer utilizar o algoritmo de Euclides] Incorpore o método a um
aplicativo que lê dois valores do usuário e exibe o resultado.*/

package metodos;

import java.util.Scanner;

public class Exercicio07 {
	private static int[] primos = { 2, 3, 5, 7, 11, 13, 17, 19 };

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
		int mdc = 1;
		if (n1<1||n2<1) {
			return -1;
		}
		for (int i = 0; i < primos.length;) {
			int contador=0;
		if (n1%primos[i]==0) {
			n1/=primos[i];
			contador++;
		}
		if (n2%primos[i]==0) {
			n2/=primos[i];
			contador++;
		}
		if (contador==2) {
			mdc*=primos[i];
		}
		if (contador==0) {
			i++;
			
		}
		if (n1==1 && n2==1) {
			break;
		}
		}
//		for (int i = 1; i < n1 || i < n2; i++) {
//			if (n1 % i == 0 && n2 % i == 0) {
//				mdc *= i;
//
//			}
//		}

		return mdc;
	}
}
