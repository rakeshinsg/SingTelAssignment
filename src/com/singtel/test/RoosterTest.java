package com.singtel.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.singtel.Rooster;

public class RoosterTest {
	
	Rooster rooster;
	@Before
	public void setUp() throws Exception {
		rooster = new Rooster();
	}

	@After
	public void tearDown() throws Exception {
		rooster = null;
	}

	@Test
	public void testSing() {
		rooster.sing();
	}

}
