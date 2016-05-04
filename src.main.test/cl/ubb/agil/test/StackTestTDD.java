package cl.ubb.agil.test;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Before;

import cl.ubb.agil.java.StackTDD;

public class StackTestTDD {
	
	@Test
	public void StackEstaVacio(){
		StackTDD stack = new StackTDD();
		boolean result=stack.EstaVaciaPila();
		assertThat(result,is(true));
	}
	

}
