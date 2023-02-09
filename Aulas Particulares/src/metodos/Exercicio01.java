/*Faça um método que receba a idade de uma pessoa expressa em anos, meses e dias e mostre-a
expressa em dias. Leve em consideraç˜ao o ano com 365 dias e o mês com 30. (Ex: 3 anos, 2
meses e 15 dias = 1170 dias.)*/

package metodos;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos anos? ");
		int anos=sc.nextInt();
		System.out.print("Quantos meses? ");
		int meses = sc.nextInt();
		System.out.print("Quantos dias? ");
		int dias = sc.nextInt();
		int diasTotais=anosParaDias(anos);
		diasTotais+=mesesParaDias(meses);
		diasTotais+=dias;
		System.err.println("Idade total em dias: "+diasTotais);
		
		sc.close();
	}

	public static int anosParaDias(int anos) {
		int dias=anos*365;
		return dias;
		
	
	}
	public static int mesesParaDias(int meses) {
		int dias=meses*30;
		return dias;
	}

}
