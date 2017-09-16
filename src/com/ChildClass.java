package com;

public class ChildClass extends ParentClass{
	
	ChildClass(){
		super("Hello from Child");
		System.out.println("Exited Child Default Constructor");
	}

	public static void main(String[] args) {
		new ChildClass();
	}

}
