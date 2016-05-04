package cl.ubb.agil.test;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Before;

import cl.ubb.agil.java.StackTDD;

public class StackTestTDD {
	private StackTDD stack;

	@Before
	public void setup() {
		stack = new StackTDD(3);
	}

	@Test
	public void StackEstaVacio() {
		// StackTDD stack = new StackTDD();
		boolean result = stack.EstaVaciaPila();
		assertThat(result, is(true));
	}

	@Test
	public void InsertarUnoEnPila() {
		// StackTDD stack =new StackTDD();
		boolean result = stack.InsertarPila(1);
		assertThat(result, is(true));

	}

	@Test
	public void InsertaUnoYDosNoVacia() {
		boolean res1 = stack.InsertarPila(1);
		assertThat(res1, is(true));
		boolean res2 = stack.InsertarPila(2);
		assertThat(res2, is(true));
	}

	@Test
	public void InsertaUnoYDosTamañoEs2() {
		boolean res1 = stack.InsertarPila(1);
		assertThat(res1, is(true));
		boolean res2 = stack.InsertarPila(2);
		assertThat(res2, is(true));
		int tam = stack.Tamaño();
		assertThat(tam, is(2));
	}

}
