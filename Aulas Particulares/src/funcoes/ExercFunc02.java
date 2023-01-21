/*Escreva um programa que contenha um método estático chamado hipotenusa. O método deve
receber dois argumentos lado1 e lado2, calcular a hipotenusa de um triângulo com os argumentos
e retornar o resultado.*/

package funcoes;

import java.util.Scanner;

public class ExercFunc02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira o primeiro lado do triângulo: ");
		double ladoA = sc.nextDouble();
		System.out.print("Insira o segundo lado do triângulo: ");
		double ladoB = sc.nextDouble();

		System.out.println("A hipotenusa do triângullo é: " + hipotenusa(ladoA, ladoB));

		sc.close();
	}

	public static double hipotenusa(double lado1, double lado2) {
		double hipotenusa = Math.sqrt((Math.pow(lado1,2)+Math.pow(lado2, 2)));
		return hipotenusa;
	}

}
