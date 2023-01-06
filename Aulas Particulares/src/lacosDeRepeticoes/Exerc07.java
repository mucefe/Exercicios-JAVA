package lacosDeRepeticoes;

public class Exerc07 {

	public static void main(String[] args) {

		int vetor[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int pares = 0;
		int impares = 0;
		
		for (int i=0;i<vetor.length;i++) {
			System.out.println(vetor[i]);
			if (vetor[i]%2==0) {
				pares++;
			} else {
				impares++;
			}
		}
		System.out.println("O vetor possui "+pares+" números pares e "+impares+" números ímpares");
		
	}
}
