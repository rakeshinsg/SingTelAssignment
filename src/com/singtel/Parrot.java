package com.singtel;

public class Parrot implements Animal{
	
	private Object livesWith;
	
	public Parrot(){
	}
	
	public Parrot(Object livesWith){
		this.livesWith=livesWith;
	}
	
	public void sing() {
		if(livesWith instanceof Dog) {
			System.out.println("Woof, woof");
		}else if(livesWith instanceof Cat) {
			System.out.println("Me ow");
		}else if(livesWith instanceof Rooster) {
			System.out.println("Cock-a-doodle-doo");
		}
	}

}
