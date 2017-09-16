package com;

public class ParentClass {
	
	// Default Constructor
	ParentClass(){
		this("Hello");				// Calling Same class parameterized constructor
		System.out.println("Exited Parent Default Constructor");
	}
	
	ParentClass(String value){		// Parameterized Constructor
		System.out.println("Parent Constructor with parameter value - " + value);
	}

	// Main Function
	public static void main(String[] args) {
		new ParentClass();
	}

}
