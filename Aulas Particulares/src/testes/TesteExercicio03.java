package testes;

import static org.junit.Assert.assertEquals; 
import org.junit.Test;

import metodos.Exercicio03;

public class TesteExercicio03 {

	@Test
	public void testeDisplayDigits() {
		assertEquals("7 8 2 4",Exercicio03.displayDigits(7824)); //Acho q ñ funciona pq é String, mas n sei como consertar
	}
}
