/*Utilize métodos desenvolvidos nas partes (a) e (b) para escrever um método displayDigits que 
recebe um inteiro entre 1 e 99999 e o exibe como uma seqüência de dígitos, separando cada par
de dígitos por dois espaços. Por exemplo, o inteiro 4562 deve aparecer como ”4 5 6 2”.*/

package metodos;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira um número entre 1 e 99999.");
		int n = sc.nextInt();
		displayDigits(n);
		sc.close();
	}

	public static void displayDigits(int num) {
		if (num >= 1 && num <= 99999) {
			String numeros = Integer.toString(num);

			for (int i = 0; i < numeros.length(); i++) {
				System.out.print(numeros.charAt(i) + " ");
			}

		} else {
			System.out.println("O número deve estar entre 1 e 99999.");
		}
	}
}
