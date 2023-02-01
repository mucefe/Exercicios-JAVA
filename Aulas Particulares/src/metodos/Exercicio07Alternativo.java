//Solução tirada da internet.

package metodos;

public class Exercicio07Alternativo {

	public static void main(String[] args) {
		int num1 = 100;
		int num2 = 8;
		System.out.println(mdc(num1, num2));

	}
	


	public static void Main(String[] args) {
		int num1 = 100;
		int num2 = 8;
		System.out.println(mdc(num1, num2));
	}
	public static int mdc(int a, int b) {
	    while (b != 0) {
	        int temp = b;
	        b = a % b; //Não entendi essa parte. Pq a%b?
	        a = temp;
	    }
	    return a;
	}
	}


