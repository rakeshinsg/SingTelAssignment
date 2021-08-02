package com.singtel.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.singtel.Chicken;

public class ChickenTest {
	
	Chicken chicken;

	@Before
	public void setUp() throws Exception {
		chicken = new Chicken();
	}

	@After
	public void tearDown() throws Exception {
		chicken = null;
	}

	@Test
	public void test() {
		chicken.fly();
	}

}
