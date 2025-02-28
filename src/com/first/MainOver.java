package com.first;

sealed class Animal permits Dog,Cat{
	void sound() {
		System.out.println("Animals make sound");
	}
}

final class Dog extends Animal{
	void sound() {
		System.out.println("Barks");
	}
}

final class Cat extends Animal{
	void sound() {
		System.out.println("Meows");
	}
}



public class MainOver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Animal obj1 = new Animal();
		obj1.sound();

		Animal obj2 = new Dog();
		obj2.sound();
		
		Animal obj3 = new Cat();
		obj3.sound();
	}

}
