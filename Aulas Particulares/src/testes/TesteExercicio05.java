package testes;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import metodos.Exercicio05;

public class TesteExercicio05 {

	@Test
	public void inverteTudo() {
		assertEquals("4321", Exercicio05.inverteString(1234));
		assertEquals("4321", Exercicio05.inverteNumeros(1234));
	}

	@Test
	public void inverte1() {
		assertEquals("1", Exercicio05.inverteNumeros(1));
		assertEquals("1", Exercicio05.inverteString(1));
	}
	@Test
	public void inverte100() {
		assertEquals("001", Exercicio05.inverteNumeros(100));
		assertEquals("001", Exercicio05.inverteString(100));
	}
	@Test
	public void inverte120() {
		assertEquals("021", Exercicio05.inverteNumeros(120));
		assertEquals("021", Exercicio05.inverteString(120));
	}
}
