package testes;

import static org.junit.Assert.assertEquals; 
import org.junit.Test;

import metodos.Exercicio05;

public class TesteExercicio05 {

	@Test
	public void inverteString() {
		assertEquals(4321, Exercicio05.inverteString(1234));
	}

	@Test
	public void inverteNumeros() {
		assertEquals(4321, Exercicio05.inverteNumeros(1234));
	}
}
