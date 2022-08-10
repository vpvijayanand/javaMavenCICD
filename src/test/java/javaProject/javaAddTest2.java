package javaProject;

import static org.junit.Assert.*;

import org.junit.Test;

public class javaAddTest2 {

	@Test
	public void testAdd() {
		javaAdd t=new javaAdd();
		int actual=t.add(10,20);
		int expected =30;
		assertEquals(expected,actual);
	}

}
