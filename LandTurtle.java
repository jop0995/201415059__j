package com.sd.ch8;

//import com.sd.ch9.Turtle;

public class LandTurtle extends Turtle{
	public void walk() {
		System.out.println("A land turtle walks...");
	}
	public static void main(String[] args){
		LandTurtle lt = new LandTurtle();
		lt.setFood("Zucchini");
		lt.eat();
		lt.walk();
		System.out.println("Land turtle has "+lt.nLimbs+" limbs");
	}
}