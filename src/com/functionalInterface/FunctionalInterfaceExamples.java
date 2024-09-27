package com.functionalInterface;

@FunctionalInterface  // We add this annotation when we are using Interface as a FI.
//If we remove this annotation, then there won't be any error.
//As long as a Interface consist only one abstract method, it is considered as FI.
//Adding annotation is optional and it is only used to indicate the compiler that we are using
//FI such that if we add more than one abstract method in the Interface, it will give compilation
//error.
//If we use above annotation and create more than one method inside abstract class, then it will give error.
public interface FunctionalInterfaceExamples {

	// String displayShape();

	int displayShape1(int length, int breadth);	//only one abstract method
	
	//int calculate();

	default String displayShape2() {  //non-abstract method

		return "Hi this is displayShape2";

	}

	static String displayShape4() { 	//non-abstract method

		return "Hi this is" + getName();

	}
	
	
	private static String getName() {	//non-abstract method
		return "Hi Suman";
	}

}

//Any interface with only one abstract method is called FI.
