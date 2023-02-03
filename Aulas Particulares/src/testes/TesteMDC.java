package testes;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import metodos.Exercicio07;

public class TesteMDC {
@Test
public void testeMDC(){
	assertEquals(6,Exercicio07.mdc(18,60));
}
@Test
public void testeMDC2() {
	assertEquals(4,Exercicio07.mdc(20,24));
}
@Test
public void testeMDC3() {
	assertEquals(20,Exercicio07.mdc(20,20));
}
@Test
public void testeMDC4() {
	assertEquals(-1,Exercicio07.mdc(20,0));
}
}
