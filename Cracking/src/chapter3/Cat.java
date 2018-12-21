package chapter3;
import chapter3.Animal;

public class Cat extends Animal{
	private int position;
	private String name = null;
	
	public Cat(String name){
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
