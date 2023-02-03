/*Escreva um método distance para calcular a distância entre dois pontos (x1, y1)  
 * e (x2, y2). Todos os números e valores de retorno devem ser do tipo double. Incorpore esse 
 * método a um aplicativo que permite que o usuário insira as coordenadas de pontos.*/

package metodos;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Insira x1: ");
        double x1 = sc.nextDouble();
        System.out.print("Insira y1: ");
        double y1 = sc.nextDouble();
        System.out.print("Insira x2: ");
        double x2 = sc.nextDouble();
        System.out.print("Insira y2: ");
        double y2 = sc.nextDouble();
        double distance = distance(x1, y1, x2, y2);
        System.out.println("Distância entre os dois pontos: " + distance);
sc.close();
	}
	
	public static double distance(double x1, double y1, double x2, double y2) {
	    double xDiff = x2 - x1;
	    double yDiff = y2 - y1;
	    return Math.sqrt(xDiff * xDiff + yDiff * yDiff); 
	}
}
