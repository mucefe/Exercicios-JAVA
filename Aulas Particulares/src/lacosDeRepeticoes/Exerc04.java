package lacosDeRepeticoes;
import java.util.Scanner;

public class Exerc04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int soma = 0;
		do {
		System.out.println("Insira um número positivo (-1 encerra a contagem).");
		num = sc.nextInt();
		if (num>0) {
			soma=soma+num;
		}
		} while (num!=-1);
		System.out.println(soma);
		sc.close();
	}
}
