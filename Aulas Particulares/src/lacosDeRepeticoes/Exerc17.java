package lacosDeRepeticoes;
import java.util.Arrays;


public class Exerc17 {
	
	public static void main(String[] args) {
		boolean continuar = false;
		int[] numeros = new int[] { 20, 2, 8, 19, 100, 5, 1, 6, 13 };

		do {
			continuar = false;
			for (int i = 0; i < numeros.length - 1; i++) {
				if (numeros[i] > numeros[i + 1]) {
					int auxiliar = numeros[i];
					numeros[i] = numeros[i + 1];
					numeros[i + 1] = auxiliar;
					continuar = true;
				}

			}
		} while (continuar == true);
		System.out.println(Arrays.toString(numeros));


	}
}
