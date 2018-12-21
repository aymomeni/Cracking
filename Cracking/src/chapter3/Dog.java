package chapter3;

import chapter3.Animal;

public class Dog extends Animal{
	
	private int position;
	private String name = null;
	
	public Dog(String name){
		this.name = name;
	}
	
	public int getPosition(){
		return this.position;
	}
	
	public void setPosition(int position){
		this.position = position;
	}
	
	public String getName(){
		return this.name;
	}
}