package oopPractise;

public class Person {

	
//	2.Create parent class Person (name, age).
//	Create child class Employee (salary).
//	Call parent constructor using super()
//	Child should print all details
//	Create one object and display data
	
	
	 String name;
	 int age;
	
	public Person(String name, int age) {
		this.age=age;
		this.name=name;
		System.out.println("parent classs constructor");
	}
}
