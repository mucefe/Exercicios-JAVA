package testes;

import static org.junit.Assert.assertEquals; 
import org.junit.Test;

import metodos.Exercicio03;

public class TesteExercicio03 {

	@Test
	public void testeDisplayDigits() {
		assertEquals("7 8 2 4",Exercicio03.displayDigits(7824)); //Acho q ñ funciona pq é String, mas n sei como consertar
	}
	@Test
	public void testeDisplayDigits2() {
		assertEquals("O número deve estar entre 1 e 99999.",Exercicio03.displayDigits(0));
	}
	@Test
	
	public void testeDisplayDigits3() {
		assertEquals("O número deve estar entre 1 e 99999.",Exercicio03.displayDigits(100000));
	}
	@Test
	public void testeDisplayDigits4() {
		assertEquals("1",Exercicio03.displayDigits(1));
	}
}
