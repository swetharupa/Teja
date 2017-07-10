package org.calc;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AppTest {
	App app;

	@Before
	public void setUp() throws Exception {
		app = new App();
	}

	@Test
	public void testCalculateAddition() {
		//fail("Not yet implemented");
		long expected = 30;
		long actual=app.calculateAddition(10, 20);
		assertEquals(expected, actual);
	}

	@Test
	public void testCalculateSubtraction() {
		//fail("Not yet implemented");
		long expected = 10;
		long actual=app.calculateSubtraction(30, 20);
		assertEquals(expected, actual);
	}
	
	@After
	public void tearDown() throws Exception {
	}

}
