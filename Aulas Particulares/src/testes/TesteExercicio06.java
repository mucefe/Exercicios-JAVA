package testes;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import metodos.Exercicio06;

public class TesteExercicio06 {

	@Test
	public void qualityPoints() {
		assertEquals(4, Exercicio06.qualityPoints(95));
	}

}
