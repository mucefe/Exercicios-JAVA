/*Um número inteiro positivo é primo se for divisível apenas por 1 e por ele mesmo. Por exemplo,
2, 3, 5 e 7 s˜ao primos, mas 4, 6, 8 e 9 n˜ao s˜ao. O número 1, por definiç˜ao, n˜ao é primo.
a) Escreva um método que determina se um número é primo.
b) Utilize esse método em um aplicativo que determina e exibe todos os números primos menores
que 10.000. Quantos números até 10.000 você precisa testar a fim de assegurar que encontrou
todos os primos?*/

package metodos;

public class Exercicio04 {

	public static void main(String[] args) {
		int testados=0;
		for (int i=2;i<10000;i++) {
			testados++;
			verificaPrimo(i);
			if (verificaPrimo(i)==true) {
				System.out.println(i);
			}
		}
		System.out.println("Números testados: "+testados);

	}
	public static boolean verificaPrimo (int num) {
		for (int j = 2; j < num; j++) {
	        if (num % j == 0)
	            return false;   
	    }
	    return true;
	}

}
