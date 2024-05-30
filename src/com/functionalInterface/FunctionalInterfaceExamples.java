package com.functionalInterface;

@FunctionalInterface  // We add this annotation when we are using Interface as a FI.
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
