package com;

public class ParentClass {
	
	ParentClass(){
		this("Hello");
		System.out.println("Exited Parent Default Constructor");
	}
	
	ParentClass(String value){
		System.out.println("Parent Constructor with parameter value - " + value);
	}

	public static void main(String[] args) {
		new ParentClass();
	}

}
