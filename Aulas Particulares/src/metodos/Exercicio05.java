/*Escreva um método que recebe um valor inteiro e retorna o número com seus dígitos invertidos.
Por exemplo, dado o número 7.631, o método deve retornar 1.367. Incorpore o método a um
aplicativo que lê um valor a partir da entrada fornecida pelo usuário e exibe o resultado.*/

/*Peguei o exercício da internet, mas não consegui entender a resolução*/
package metodos;

import java.util.Scanner;

public class Exercicio05 {

	Scanner entrada = new Scanner(System.in);

	public void pegaNumero() {

		System.out.print("Digite a seguir o número a ser invertido: ");
		int numero = entrada.nextInt();

		inverte(numero);

	}

	private void inverte(int numero) {

		int i = 0;

		while (numero > 0) {
			i *= 10; // Por que *10?
			i += (numero % 10);
			numero /= 10;
		}

		System.out.printf("O número invertido é: %d.\n", i);
//Não executa
	}

}
