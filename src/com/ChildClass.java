package com;

public class ChildClass extends ParentClass{
	
	// Child default Constructor
	ChildClass(){
		super("Hello from Child");			// Calling Parent Parameterized Constructor
		System.out.println("Exited Child Default Constructor");
	}

	// Main Function
	public static void main(String[] args) {
		new ChildClass();
	}

}
