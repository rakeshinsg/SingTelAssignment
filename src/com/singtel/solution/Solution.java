package com.singtel.solution;

import com.singtel.Animal;
import com.singtel.Bird;
import com.singtel.Cat;
import com.singtel.Chicken;
import com.singtel.Dog;
import com.singtel.Duck;
import com.singtel.Parrot;
import com.singtel.Rooster;
import com.singtel.b.Dolphin;
import com.singtel.b.Fish;
import com.singtel.c.Butterfly;

public class Solution {
	
	public static void main(String[] args) {
		
	//Section A Starts	
/*		Bird duck = new Duck();
		duck.walk();
		duck.fly();
		duck.sing();
		
		
	 Bird chicken = new Chicken();
	 chicken.walk();
	 chicken.sing();
	 
	 Chicken rooster = new Rooster();
	 rooster.walk();
	 rooster.sing();
	 
	 Parrot parrot1 = new Parrot(new Dog());
	 parrot1.sing();
	 Parrot parrot2 = new Parrot(new Cat());
	 parrot2.sing();
	 Parrot parrot3 = new Parrot(new Rooster());
	 parrot3.sing();*/
	 
	//Section A End
	 
	 
	 Animal[] animals = new Animal[]{
			 new Duck(),
			 new Chicken(),
			 new Rooster(),
			 (Animal) new Parrot(new Dog()),
			 (Animal) new Parrot(new Cat()),
			 (Animal) new Parrot(new Rooster()),
			 (Animal) new Fish("Shark", "Large", "Grey"),
			 (Animal) new Fish("Clownfish", "Small", "Orange"),
			 (Animal) new Dolphin(new Fish("Clownfish", "Small", "Orange")),
			 new Dog(),
			 new Butterfly(),
			 new Cat()
			 };
	 
	 System.out.println("Animal size : "+ animals.length);
	}
	 
}
