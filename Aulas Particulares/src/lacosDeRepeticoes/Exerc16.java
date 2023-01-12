package lacosDeRepeticoes;

import java.util.Scanner;

public class Exerc16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] vetor = {3,4,12,8,8,7,7,7,15,23,5};
		
		
		
		for (int i=0; i<vetor.length;i++)
			if (vetor[i]>0) {
				if (vetor[i]==vetor[i-1]) {
					vetor[i]=0;
					System.out.println(vetor[i]);
				}
			}
			
			
	sc.close();
	}

}
