package com.singtel.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.singtel.Duck;

public class DuckTest {
	
	Duck duck;
	@Before
	public void setUp() throws Exception {
		duck = new Duck();
	}

	@After
	public void tearDown() throws Exception {
		duck = null;
	}

	@Test
	public void testSing() {
		duck.sing();
	}

	@Test
	public void testSwim() {
		duck.swim();
	}

	@Test
	public void testFly() {
		duck.fly();
	}

}
