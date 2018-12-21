package chapter3;

import java.util.Date;
import java.util.LinkedList;

public class AnimalShelter {

	LinkedList<Cat> catList = null;
	LinkedList<Dog> dogList = null;
	
	public AnimalShelter(){
		catList = new LinkedList<Cat>();
		dogList = new LinkedList<Dog>();
	}
	
	public Animal dequeueAny(){
		
		if(!dogList.isEmpty() && !catList.isEmpty()){
			Date dogDate = dogList.getFirst().getDate();
			Date catDate = catList.getFirst().getDate();
			
			if(dogDate.before(catDate)){
				return dogList.removeFirst();
			} else{
				return catList.removeFirst();
			}
		} else if(!catList.isEmpty()){
			return catList.removeFirst();
		} else if(!dogList.isEmpty()){
			return dogList.removeFirst();
		}
		
		return null; // if both lists are empty
	}
	
	public Dog dequeueDog(){
		return dogList.isEmpty()? null : dogList.removeFirst();
	}
	
	public Cat dequeueCat(){
		return catList.isEmpty()? null : catList.removeFirst();
	}
	
	public void enqueue(Animal animal){
		if(animal instanceof Cat){
			catList.addLast((Cat)animal);
		} else if(animal instanceof Dog){
			dogList.addLast((Dog)animal);
		} else{
			System.err.println("Incorrect animal for shelter");
		}
	}
	
	public class Cat extends Animal{
		private Date myDate;
		
		public Cat(){
			myDate = new Date();
		}
		
		public Date getDate(){
			return this.myDate;
		}
	}
	
	public class Dog extends Animal{
		private Date myDate;
		
		public Dog(){
			myDate = new Date();
		}
		
		public Date getDate(){
			return this.myDate;
		}
	}
	
	public class Animal{
		
	}
}

