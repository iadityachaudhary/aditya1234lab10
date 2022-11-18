package jUnitTestpackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddString {

	@Test
	public void test() {
		jUnitFunctions junit = new jUnitFunctions();
		String result = junit.AddStrings("Hello", " World");
		assertEquals("Hello World",result);
	}

}