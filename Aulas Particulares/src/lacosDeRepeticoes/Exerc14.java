package lacosDeRepeticoes;

public class Exerc14 {
	  public static void main(String[] args) {
	    
	    int[][] matriz1 = {{1, 2, 3}, {4, 5, 6}};
	    int[][] matriz2 = {{7, 8, 9}, {10, 11, 12}};
	    int[][] matriz3 = new int[2][3];

	    
	    for (int i = 0; i < matriz1.length; i++) {
	      for (int j = 0; j < matriz1[i].length; j++) {
	        matriz3[i][j] = matriz1[i][j] + matriz2[i][j];
	      }
	    }

	    
	    for (int i = 0; i < matriz3.length; i++) {
	      for (int j = 0; j < matriz3[i].length; j++) {
	        System.out.print(matriz3[i][j] + " ");
	      }
	      System.out.println();
	    }
	  }
	}
