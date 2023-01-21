/*Escreva um programa que contenha um método estático que recebe um valor inteiro de 1 a 12
como argumento. O método deve imprimir o mês por extenso correspondente ao valor passado
como argumento. Caso seja passado um valor incorreto, deve imprimir uma mensagem de erro.*/

package funcoes;

import java.util.Scanner;

public class ExercFunc01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o número do mês");
		int numeroMes = sc.nextInt();
		if (numeroMes < 1 || numeroMes > 12) {
			System.out.println("Número inválido. Insira um número entre 1 e 12.");
		}
		nomeiaMes(numeroMes);
	sc.close();
	}

public static void nomeiaMes(int numeroMes) {
	String[] nomeMes = { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto",
			"Setembrto", "Outubro", "Novembro", "Dezembro" };

	System.out.println(nomeMes[numeroMes-1]);
}

}