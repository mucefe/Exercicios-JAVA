/*Escreva um método qualityPoints que insere a média de um aluno e retorna 4 se for 90 a 100, 3 
se 80 a 89, 2 se 70 a 79, 1 se 60 a 69 e 0 se menor que 60. Incorpore o método a um aplicativo
que lê um valor a partir do usuário e exibe o resultado*/
package metodos;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira a média do aluno (XX,XX): ");
		double media = sc.nextDouble();
		System.out.println(qualityPoints(media));
sc.close();
	}

	public static int qualityPoints (double media) {
		if (media>=90 && media<=100) {
		 return 4;
		} else if (media>=80 && media <=89) {
			 return 3;
		 } else if (media >=70 && media<=79) {
			 return 2;
		 
		 } else if (media>=60 && media <=69) {
			 return 1;
		} else if (media <60) {
			return 0;
		} else if (media>100) {
			System.out.println("Excedido o valor máximo da média. Insira um número entre 0.0 e 100.0;");
		}
		return 0;
		

}
}
