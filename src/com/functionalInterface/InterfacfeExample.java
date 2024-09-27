package com.functionalInterface;
import java.util.ArrayList;
import java.util.Arrays;

public class InterfacfeExample{

	//Functional interfaces are introduced to support lambda expressions and 
	//method references in Java.
	//Using functional interfaces, you can write more concise and readable code 
	//with lambda expressions.
	//Code using lambda expressions and method references is often easier to read 
	//and understand, especially for simple functional behaviors.
	
	//Many methods in the Java Stream API are designed to work with functional 
	//interfaces, making it easier to work with collections and perform bulk 
	//operations.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Anonymous Inner Class implementation of a functional interface.
		
//		FunctionalInterfaceExamples obj = new FunctionalInterfaceExamples() {
//
//			@Override
//			public String displayShape() {
//				// TODO Auto-generated method stub
//				return "This is a rectangle";
//			}
//		}; 
		
// This is another way of providing implementation of Functional Interface
// Through this we are creating object of Interface but implementation is defined in 
// anonymous Inner class.		
		
// By this way, we cannot override the non-abstract	methods in this Anonymous Inner Class.
//	This Anonymous Inner class we can implement more than 1 abstract methods but Interface used should not be FI.
//	System.out.println(obj.displayShape());
		
// Another way of creating object of interface is:
//	FunctionalInterfaceExamples obj = new InterfacfeExample();// where MyInterface is a Interface and MyClass is implementing
// method of MyInterface.		
//		MyInterface obj is a reference of type MyInterface.
//		Thus, obj is a reference to an object of type MyClass, but it is treated as an instance 
//	of MyInterface. This practice leverages polymorphism, allowing for more flexible and maintainable code.		
//

		
		
		
		
		//Lambda expression is also known as anonymous functions bcoz we are'nt mentioning
		//any method in lambda expression.These functions do not need a name or a class to
		//be used. Lambda expressions are added in Java 8. Lambda expressions basically 
		//express instances of functional interfaces.
		
		//It reduces the boiler plate code used in above scenario of Anonymous Inner Class.
		//help to make code more readble
		//it doesnot executes on its own, we have to call it to execute.
		//We cannot implement lambda Expression without functional Interface.
		//Lambda Expression will only map to the abstract method that is present in FI.
		
// Purpose of Lambda expression is to define inline implementation of a functional interface.		
//		Breakdown of the Lambda Expression
//		In the lambda expression s -> System.out.println(s):
//
//		s is the parameter passed to the lambda expression.
//		-> is the lambda operator used to separate the parameter(s) from the body.
//		System.out.println(s) is the body of the lambda expression which prints the parameter.
		
//		Benefits of Lambda Expressions
//		Conciseness: Lambda expressions reduce boilerplate code.
//		Readability: Code becomes easier to read and understand.
//		Flexibility: Easily pass behavior as arguments to methods
		
		
//		FunctionalInterfaceExamples obj = () -> "this is to display ROSE";
		
//		FunctionalInterfaceExamples obj = () -> System.out.println("this is to display ROSE");
//		Using anyone of above will give same result.		
//		System.out.println(obj.displayShape());
		
		
//		FunctionalInterfaceExamples obj = (a,b) -> (a*b);
//		System.out.println(obj.displayShape1());
		
		FunctionalInterfaceExamples obj = (a,b) -> {
			System.out.println("Length is " + a + "Breadth is " + b);
			
			return (a*b);  //this approach is used to return data.
			};
		System.out.println(obj.displayShape1(5, 6));
		System.out.println(obj.displayShape2());
		
		
		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4));
		
		
//		Lambda Expressions: Focus on behavior.
//		Streams: Focus on data processing.
		
		
//		ArrayList<Integer> arr2 = new ArrayList<>();
//		arr.add(null);
		
		System.out.println();
		arr.forEach((n)->System.out.println(n));
	}
}
