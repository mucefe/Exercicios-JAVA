/*Crie um programa que contenha um método estático que desenhe um retângulo usando os 
 * caracteres +, − e —. Ela deve receber dois argumentos: linhas e colunas. O valor mínimo deve 
 * ser igual a 1 e o valor máximo é 100.*/

//Referência da internet. 
package funcoes;
public class ExercFunc04 {
	
	public static void main(String[] args) {
        desenhar(4, 7);
    }
	
    public static void desenhar(int linhas, int colunas) {
        if (linhas < 1 || linhas > 100 || colunas < 1 || colunas > 100) {
            System.out.println("Valores inválidos. Insira valores entre 1 e 100.");
            return;
        }

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (i == 0 || i == linhas - 1) {
                    System.out.print("-");
                } else if (j == 0 || j == colunas - 1) {
                    System.out.print("|");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    
}
