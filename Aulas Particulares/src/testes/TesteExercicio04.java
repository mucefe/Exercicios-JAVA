package testes;

import static org.junit.Assert.assertEquals; 
import org.junit.Test;


import metodos.Exercicio04;
public class TesteExercicio04 {

	@Test
	public void testeVerificaPrimo() {
		assertEquals(true,Exercicio04.verificaPrimo(5));
	}

}
