package com.singtel.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.singtel.Cat;
import com.singtel.Dog;
import com.singtel.Parrot;
import com.singtel.Rooster;

public class ParrotTest {
	Parrot parrotWithDog;
	Parrot parrotWithCat;
	Parrot parrotWithRooster;
	@Before
	public void setUp() throws Exception {
		parrotWithDog = new Parrot(new Dog());
		parrotWithCat = new Parrot(new Cat());
		parrotWithRooster = new Parrot(new Rooster());
	}

	@After
	public void tearDown() throws Exception {
		parrotWithDog = null;
		parrotWithCat = null;
		parrotWithRooster = null;
	}

	@Test
	public void singTest() {
		parrotWithDog.sing();
		parrotWithCat.sing();
		parrotWithRooster.sing();
	}

}
