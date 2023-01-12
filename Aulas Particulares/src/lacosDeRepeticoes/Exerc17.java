package lacosDeRepeticoes;
import java.util.Arrays;
public class Exerc17 {
//Código copiado da internet
public static void main(String[] args) {
int[] numeros = new int[]{20,2, 8, 19, 100, 5, 1, 6, 13};
System.out.println("Números não ordenados:");
for(int numero : numeros)
System.out.println(numero);
System.out.println();
Arrays.sort(numeros);
System.out.println("Números ordenados:");
for(int numero : numeros) //o que significa essa linha?
System.out.println(numero);
System.out.println();
}
}

