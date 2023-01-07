package lacosDeRepeticoes;

public class Exerc12 {
	public static void main(String[] args) {
		int[] vetorA = { 6, 12, 3, 8 };
		int[] vetorB = { 1, 2, 4, 7 };
		int[] vetorC = new int[4];
		
		for (int i=0;i<vetorC.length;i++) {
			vetorC[i]=vetorA[i]+vetorB[i];
			System.out.println(vetorC[i]);
		}
		
	}
}
