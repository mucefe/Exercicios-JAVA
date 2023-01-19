/*Crie um programa que contenha um método estático que desenhe um retângulo usando os 
 * caracteres +, − e —. Ela deve receber dois argumentos: linhas e colunas. O valor mínimo deve 
 * ser igual a 1 e o valor máximo é 100.*/

//Referência da internet. Dúvidas: Em que ponto o programa recebe o no. de linhas(4) e colunas (7)?
// Não deveria haver um 'nextInt()' em algum lugar?
package funcoes;
public class ExercFunc04 {
    public static void draw(int rows, int columns) {
        if (rows < 1 || rows > 100 || columns < 1 || columns > 100) {
            System.out.println("Valores inválidos. Insira valores entre 1 e 100.");
            return;
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (i == 0 || i == rows - 1) {
                    System.out.print("-");
                } else if (j == 0 || j == columns - 1) {
                    System.out.print("|");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        draw(4, 7);
    }
}
