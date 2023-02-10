package testes;

import static org.junit.Assert.assertEquals;  
import org.junit.Test;

import metodos.Exercicio01;


public class TesteExercicio01 {

	@Test
	public void tudoParaDias(){
		assertEquals(1170,Exercicio01.tudoParaDias(3,2,15));
}
	@Test
	public void tudoParaDias2(){
		assertEquals(75,Exercicio01.tudoParaDias(0,2,15));
}
	@Test
	public void tudoParaDias3(){
		assertEquals(15,Exercicio01.tudoParaDias(0,0,15));
}
	@Test
	public void tudoParaDias4(){
		assertEquals(-1,Exercicio01.tudoParaDias(-1,0,0));
}
	@Test
	public void tudoParaDias5() {
		assertEquals(-1,Exercicio01.tudoParaDias(-1,-1,-1));
	}
}
	
