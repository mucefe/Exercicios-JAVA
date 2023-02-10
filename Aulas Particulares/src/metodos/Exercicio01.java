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
		
		System.out.println("Idade total em dias: "+tudoParaDias(anos,meses,dias));
		
		sc.close();
	}
	public static int tudoParaDias(int anos,int meses,int dias) {
		if (anos<0||meses<0||dias<0) {
			return-1;
		}
		int diasTotais=anosParaDias(anos);
		diasTotais+=mesesParaDias(meses);
		diasTotais+=dias;
		return diasTotais;
	}

	private static int anosParaDias(int anos) {
		int dias=anos*365;
		return dias;
		
	
	}
	private static int mesesParaDias(int meses) {
		int dias=meses*30;
		return dias;
	}

}
