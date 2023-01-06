package lacosDeRepeticoes;

import java.util.Scanner;

public class Exerc06 {

	public static void main(String[] args) {

		int num1, num2 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o primeiro número inteiro:");
		num1 = sc.nextInt();
		System.out.println("Insira o segundo número inteiro:");
		num2 = sc.nextInt();
		System.out.println(num1);
		for (int i=num1;i<=num2;i++ )
			System.out.println(i);
		sc.close();
	}
}
