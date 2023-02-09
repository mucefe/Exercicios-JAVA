package testes;

import static org.junit.Assert.assertEquals; 
import org.junit.Test;

import metodos.Exercicio01;


public class TesteExercicio01 {

	@Test
	public void testeAnosParaDias(){
		assertEquals(1095,Exercicio01.anosParaDias(3));
}
	@Test 
	public void testeMesesParaDias() {
		assertEquals(360,Exercicio01.mesesParaDias(12)); //Não era pra ser 365?
	}
}
