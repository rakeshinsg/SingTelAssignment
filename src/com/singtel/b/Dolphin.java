package com.singtel.b;

import com.singtel.Animal;

public class Dolphin implements Animal{
	private Fish fish;
	
	public Dolphin (){
	}

	
	public Dolphin (Fish fish){
		this.fish = fish;
	}

	public Fish getFish() {
		return fish;
	}

	public void setFish(Fish fish) {
		this.fish = fish;
	}
	
	
	
}
