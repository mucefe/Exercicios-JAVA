package lacosDeRepeticoes;
import java.util.Scanner;

public class Exerc03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double nota = 0;

		do {
			System.out.print("Digite uma nota entre 0 e 10:");
			nota = sc.nextDouble();

			if (nota >= 0 && nota <= 10) {
				System.out.println("Valor válido.");
			} else {
				System.out.println("Valor inválido. Digite um número válido!");
			}
		} while (nota < 0 || nota > 10);
		sc.close();
	}
}
