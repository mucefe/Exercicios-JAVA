package testes;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


import metodos.Exercicio08;

public class TesteExercicio08 {
	@Test
	public void testeDistance() {
		assertEquals(1.4142,Exercicio08.distance(1,1,2,2),0.0001);
	}
	@Test
	public void testeDistance2() {
		assertEquals(2.8284,Exercicio08.distance(0,0,2,2),0.0001);
	}
	@Test
	public void testeDistance0() {
		assertEquals(0,Exercicio08.distance(0,0,0,0),0.0001);
	}
	@Test
	public void testeDistance1e2() {
		assertEquals(0,Exercicio08.distance(1,2,1,2),0.0001);
	}

}
