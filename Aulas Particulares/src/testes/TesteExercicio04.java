package testes;

import static org.junit.Assert.assertEquals; 
import org.junit.Test;


import metodos.Exercicio04;
public class TesteExercicio04 {

	@Test
	public void testeVerificaPrimo() {
		assertEquals(true,Exercicio04.verificaPrimo(5));
		assertEquals(true,Exercicio04.verificaPrimo(3));
		assertEquals(true,Exercicio04.verificaPrimo(2));
		assertEquals(true,Exercicio04.verificaPrimo(7));
		assertEquals(true,Exercicio04.verificaPrimo(11));
		assertEquals(true,Exercicio04.verificaPrimo(13));
	}
	@Test
	public void testeVerificaNaoPrimo2() {
		assertEquals(false,Exercicio04.verificaPrimo(4));
		assertEquals(false,Exercicio04.verificaPrimo(1));
		assertEquals(false,Exercicio04.verificaPrimo(6));
		assertEquals(false,Exercicio04.verificaPrimo(8));
		assertEquals(false,Exercicio04.verificaPrimo(9));
	}
	@Test
	public void testeVerificaZero() {
		assertEquals(false,Exercicio04.verificaPrimo(0));
	}
	@Test
	public void testeNegativo() {
		assertEquals(false,Exercicio04.verificaPrimo(-1));
	}


}
