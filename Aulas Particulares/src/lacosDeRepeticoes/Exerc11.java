package lacosDeRepeticoes;
import java.util.Scanner;

public class Exerc11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira o tamanho do vetor: ");
		int tamanho=sc.nextInt();
		System.out.print("Insira o número inteiro que será somado aos elementos do vetor: ");
		int numero = sc.nextInt();
		int[] vetor = new int[tamanho];
		
		for (int i=0;i<vetor.length;i++) {
			System.out.println("Insira o número inteiro que ficará na posição: "+i);
			vetor[i]=sc.nextInt();
		}
		
		for (int i=0;i < vetor.length;i++) {
			vetor[i]+=numero;
			System.out.println(vetor[i]);
		}
		
		
	}

}
