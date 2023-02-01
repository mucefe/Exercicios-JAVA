package aulas;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("===== MEU VETOR =====");
		int[] vetor = new int[8];
		System.out.println("Insira o primeiro número inteiro do vetor: ");
		vetor[0] = sc.nextInt();
		System.out.println("Insira o segundo número inteiro do vetor: ");
		vetor[1] = sc.nextInt();
		System.out.println("Insira o terceiro número do vetor: ");
		vetor[2] = sc.nextInt();
		System.out.println("Insira o quarto número do vetor: ");
		vetor[3] = sc.nextInt();
		System.out.println("Insira o quinto número do vetor: ");
		vetor[4] = sc.nextInt();
		System.out.println("Insira o sexto número do vetor: ");
		vetor[5] = sc.nextInt();
		System.out.println("Insira o sétimo número do vetor: ");
		vetor[6] = sc.nextInt();
		System.out.println("Insira o oitavo e último número do vetor: ");
		vetor[7] = sc.nextInt();
		

		int resp = 0;
		System.out.println("O que você gostaria de fazer?: ");
		System.out.println("1 - Somar os componentes do vetor criado;");
		System.out.println("2 - Identificar o maior elemento do vetor criado; ");
		System.out.println("3 - Identificar o menor elemento do vetor criado; ");
		System.out.println("4 - Somar, subtrair um número ou dividir os elementos por um número; ");
		System.out.println("5 - Identificar quantos números pares ou ímpares existem no vetor criado; ");

		System.out.print("Digite o número da sua opção: ");
		resp = sc.nextInt();

		switch (resp) {

		case 1:
			int soma = vetor[0] + vetor[1] + vetor[2] + vetor[3] + vetor[4] + vetor[5] + vetor[6] + vetor[7];
			System.out.println("A soma dos elementos do vetor é: " + soma);
			break;
		case 2:
			if (vetor[0] > vetor[1] && vetor[0] > vetor[2] && vetor[0] > vetor[3] && vetor[0] > vetor[4]
					&& vetor[0] > vetor[5] && vetor[0] > vetor[6] && vetor[0] > vetor[7]) {
				System.out.println("O maior elemento do vetor é " + vetor[0]);
			}
			if (vetor[1] > vetor[0] && vetor[1] > vetor[2] && vetor[1] > vetor[3] && vetor[1] > vetor[4]
					&& vetor[1] > vetor[5] && vetor[1] > vetor[6] && vetor[1] > vetor[7]) {
				System.out.println("O maior elemento do vetor é " + vetor[1]);
			}
			if (vetor[2] > vetor[0] && vetor[2] > vetor[1] && vetor[2] > vetor[3] && vetor[2] > vetor[4]
					&& vetor[2] > vetor[5] && vetor[2] > vetor[6] && vetor[2] > vetor[7]) {
				System.out.println("O maior elemento do vetor é " + vetor[2]);
			}
			if (vetor[3] > vetor[0] && vetor[3] > vetor[1] && vetor[3] > vetor[2] && vetor[3] > vetor[4]
					&& vetor[3] > vetor[5] && vetor[3] > vetor[6] && vetor[3] > vetor[7]) {
				System.out.println("O maior elemento do vetor é " + vetor[3]);
			}
			if (vetor[4] > vetor[0] && vetor[4] > vetor[1] && vetor[4] > vetor[2] && vetor[4] > vetor[3]
					&& vetor[4] > vetor[5] && vetor[4] > vetor[6] && vetor[4] > vetor[7]) {
				System.out.println("O maior elemento do vetor é " + vetor[4]);
			}
			if (vetor[5] > vetor[0] && vetor[5] > vetor[1] && vetor[5] > vetor[2] && vetor[5] > vetor[3]
					&& vetor[5] > vetor[4] && vetor[5] > vetor[6] && vetor[5] > vetor[7]) {
				System.out.println("O maior elemento do vetor é " + vetor[5]);
			}
			if (vetor[6] > vetor[0] && vetor[6] > vetor[1] && vetor[6] > vetor[2] && vetor[6] > vetor[3]
					&& vetor[6] > vetor[4] && vetor[6] > vetor[5] && vetor[6] > vetor[7]) {
				System.out.println("O maior elemento do veytor é " + vetor[6]);
			}
			if (vetor[7] > vetor[0] && vetor[7] > vetor[1] && vetor[7] > vetor[2] && vetor[7] > vetor[3]
					&& vetor[7] > vetor[4] && vetor[7] > vetor[5] && vetor[7] > vetor[6]) {
				System.out.println("O maior elemento do vetor é " + vetor[7]);
			}
			break;
		case 3:
			if (vetor[0] < vetor[1] && vetor[0] < vetor[2] && vetor[0] < vetor[3] && vetor[0] < vetor[4]
					&& vetor[0] < vetor[5] && vetor[0] < vetor[6] && vetor[0] < vetor[7]) {
				System.out.println("O menor elemento do vetor é " + vetor[0]);
			}
			if (vetor[1] < vetor[0] && vetor[1] < vetor[2] && vetor[1] < vetor[3] && vetor[1] < vetor[4]
					&& vetor[1] < vetor[5] && vetor[1] < vetor[6] && vetor[1] < vetor[7]) {
				System.out.println("O menor elemento do vetor é " + vetor[1]);
			}
			if (vetor[2] < vetor[0] && vetor[2] < vetor[1] && vetor[2] < vetor[3] && vetor[2] < vetor[4]
					&& vetor[2] < vetor[5] && vetor[2] < vetor[6] && vetor[2] < vetor[7]) {
				System.out.println("O menor elemento do vetor é " + vetor[2]);
			}
			if (vetor[3] < vetor[0] && vetor[3] < vetor[1] && vetor[3] < vetor[2] && vetor[3] < vetor[4]
					&& vetor[3] < vetor[5] && vetor[3] < vetor[6] && vetor[3] < vetor[7]) {
				System.out.println("O menor elemento do vetor é " + vetor[3]);
			}
			if (vetor[4] < vetor[0] && vetor[4] < vetor[1] && vetor[4] < vetor[2] && vetor[4] < vetor[3]
					&& vetor[4] < vetor[5] && vetor[4] < vetor[6] && vetor[4] < vetor[7]) {
				System.out.println("O menor elemento do vetor é " + vetor[4]);
			}
			if (vetor[5] < vetor[0] && vetor[5] < vetor[1] && vetor[5] < vetor[2] && vetor[5] < vetor[3]
					&& vetor[5] < vetor[4] && vetor[5] < vetor[6] && vetor[5] < vetor[7]) {
				System.out.println("O menor elemento do vetor é " + vetor[5]);
			}
			if (vetor[6] < vetor[0] && vetor[6] < vetor[1] && vetor[6] < vetor[2] && vetor[6] < vetor[3]
					&& vetor[6] < vetor[4] && vetor[6] < vetor[5] && vetor[6] < vetor[7]) {
				System.out.println("O menor elemento do veytor é " + vetor[6]);
			}
			if (vetor[7] < vetor[0] && vetor[7] < vetor[1] && vetor[7] < vetor[2] && vetor[7] < vetor[3]
					&& vetor[7] < vetor[4] && vetor[7] < vetor[5] && vetor[7] < vetor[6]) {
				System.out.println("O menor elemento do vetor é " + vetor[7]);
			}
			break;
		case 4:
			int resp1 = 0;

			System.out.println("===== ESCOLHA UMA OPÇÃO =====");
			System.out.println("1 - Somar um número aos elementos do vetor;");
			System.out.println("2 - Subtrair um número dos elementos do vetor;");
			System.out.println("3 - Dividir todos os elementos do vetor por um número;");
			System.out.print("Digite o número da sua opção: ");
			resp1 = sc.nextInt();

			switch (resp1) {
			case 1:
				System.out.print("Digite o número a ser somado aos elementos do vetor: ");
				int numeroA = sc.nextInt();
				vetor[0] += numeroA;
				vetor[1] += numeroA;
				vetor[2] += numeroA;
				vetor[3] += numeroA;
				vetor[4] += numeroA;
				vetor[5] += numeroA;
				vetor[6] += numeroA;
				vetor[7] += numeroA;
				System.out.println("Os novos elementos do vetor são: " + vetor[0] + ", " + vetor[1] + ", " + vetor[2]
						+ ", " + vetor[3] + ", " + vetor[4] + ", " + vetor[5] + ", " + vetor[6]);
				break;
			case 2:
				System.out.print("Digite o número a ser subtreaído dos elementos do vetor: ");
				int numeroB = sc.nextInt();
				vetor[0] -= numeroB;
				vetor[1] -= numeroB;
				vetor[2] -= numeroB;
				vetor[3] -= numeroB;
				vetor[4] -= numeroB;
				vetor[5] -= numeroB;
				vetor[6] -= numeroB;
				vetor[7] -= numeroB;
				System.out.println("Os novos elementos do vetor são: " + vetor[0] + ", " + vetor[1] + ", " + vetor[2]
						+ ", " + vetor[3] + ", " + vetor[4] + ", " + vetor[5] + ", " + vetor[6]);
				break;
			case 3:
				System.out.print("Insira o número pelo qual serão divididos os elementos do vetor: ");
				double numeroC = sc.nextDouble();
				double[] vetorDouble = new double[8];
				vetorDouble[0] = vetor[0]/numeroC;
				vetorDouble[1] = vetor[1]/numeroC;
				vetorDouble[2] = vetor[2]/numeroC;
				vetorDouble[3] = vetor[3]/numeroC;
				vetorDouble[4] = vetor[4]/numeroC;
				vetorDouble[5] = vetor[5]/numeroC;
				vetorDouble[6] = vetor[6]/numeroC;
				vetorDouble[7] = vetor[7]/numeroC;
				System.out.println("Os novos elementos do vetor são: " + vetorDouble[0] + ", " + vetorDouble[1] + ", "
						+ vetorDouble[2] + ", " + vetorDouble[3] + ", " + vetorDouble[4] + ", " + vetorDouble[5] + ", "
						+ vetorDouble[6]);
				// não entendi os resultados
			}
			break;
		case 5:
			System.out.println("===== O QUE VOCÊ DESEJA FAZER =====");
			System.out.println("1 - Identificar os números pares;");
			System.out.println("2 - Identificar os números ímpares;");
			int respCase5 = sc.nextInt();
			if (respCase5 == 1) {
				int pares = 0;
				for (int i = 0; i <= vetor.length; i++) {
					if (i % 2 == 0) {

						pares++;
					}
				}
				System.out.println("O vetor contém " + pares + " números pares.");

			}
			if (respCase5 == 2) {
				int impares = 0;
				for (int i = 0; i <= vetor.length; i++) {
					if (i % 2 == 0) {

						impares++;
					}

				}
				System.out.println("O vetor contém " + impares + " números ímpares.");

			}
		}
		sc.close();
	}
}
