package testes;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import metodos.Exercicio06;

public class TesteExercicio06 {

	@Test
	public void qualityPoints90a100() {
		assertEquals(4, Exercicio06.qualityPoints(90));
		assertEquals(4, Exercicio06.qualityPoints(100));
	
	}
	@Test
	public void qualityPoints80a89() {
		assertEquals(3, Exercicio06.qualityPoints(80));
		assertEquals(3, Exercicio06.qualityPoints(89));
	}
	@Test
	public void qualityPoints70a79() {
		assertEquals(2, Exercicio06.qualityPoints(70));
		assertEquals(2, Exercicio06.qualityPoints(79));
	}
	@Test
	public void qualityPoints60a69() {
		assertEquals(1, Exercicio06.qualityPoints(60));
		assertEquals(1, Exercicio06.qualityPoints(69));
	}
	@Test
	public void qualityPoints0a59() {
		assertEquals(0, Exercicio06.qualityPoints(0));
		assertEquals(0, Exercicio06.qualityPoints(59));
	}
	@Test
	public void qualityPointsNegativo() {
		assertEquals(-1, Exercicio06.qualityPoints(-1));
	}
	@Test
	public void qualityPoints101() {
		assertEquals(-1, Exercicio06.qualityPoints(101));
	}

}
