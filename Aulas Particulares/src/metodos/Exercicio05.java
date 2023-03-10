/*Escreva um método que recebe um valor inteiro e retorna o número com seus dígitos invertidos.  
Por exemplo, dado o número 7.631, o método deve retornar 1.367. Incorpore o método a um
aplicativo que lê um valor a partir da entrada fornecida pelo usuário e exibe o resultado.*/


package metodos;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	System.out.print("Digite a seguir o número a ser invertido: ");
	int numero = entrada.nextInt();

	inverteNumeros(numero);
	inverteString(numero);
	entrada.close();
	}
	
	public static String inverteString(int numero) {
		char[] caracteres=Integer.toString(numero).toCharArray();
		String numeroInvertido="";
		for (int i=caracteres.length-1;i>=0;i--) {
			numeroInvertido+=caracteres[i];
		}
		return numeroInvertido;
	}
	
	public static String inverteNumeros(int numero) {

		int i = 0;
		int contador=0;

		while (numero > 0) {
			i *= 10; 
			i += (numero % 10);
			numero /= 10;
			contador++;
		}

		return String.format("%0"+contador+"d",i);

	}

}
