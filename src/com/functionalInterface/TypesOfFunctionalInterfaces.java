package com.functionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import com.hasmaphashcode.Person;

public class TypesOfFunctionalInterfaces {
	
	public static int addOneToEachvalue(int x){
		return x + 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
		System.out.println();
		arr.forEach((n) -> System.out.println(n));  //forEach in this uses Consumer FI.

		// Consumer functional interface - this FI states that it can only take input
		// and it does'nt return any thing

		Consumer<String> consumer = (c) -> {  //here it will take c as String Format.
//The type parameter <String> specifies that the Consumer will operate on String objects.
//Datatype of c will depend upon datatype that we are specifying in Consumer. We can other 
//datatypes also like Integer, Decimal by specifying them as "Consumer<Integer>".			
			String val = "";
			for (int i = 0; i < 4; i++) {
				val = val + c;
			}
			System.out.println("Val " + val);
		};
		//accept(T t) is the abstract method in consumer FI.
		consumer.accept("Q"); //o/p - QQQQ    

		//Supplier FI - IT ONLY RETURNS SOMETHING and does'nt take any input.
		//get is the abstract method in Supplier FI.
		Supplier<String> supplier = () -> "This is the value from supplier FI";
		System.out.println(supplier.get()); //o/p - "This is the value from supplier FI"

		Supplier<String> supplier2 = () -> UUID.randomUUID().toString();
		System.out.println("supplier2 " + supplier2.get()); //o/p - "supplier2 anyRandomId";

		// Find the summation of the given element in the array list.

		ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
		int sumEven = 0;
		int sumOdd = 0;
		for (Integer e : arr2) {

			if (e % 2 == 0) {
				sumEven += e;
			}else {
				sumOdd +=e;
			}

		}
		System.out.println("Value of the arr is " + sumEven + "Odd value " +  sumOdd);
		
		//Stream is a Pipeline of data
		
//		The Stream API in Java was introduced in Java 8 and is part of the java.util.stream 
//		package. It is used to process collections of data in a functional and declarative 
//		style. The Stream API allows you to perform complex data manipulations such as 
//		filtering, mapping, and reducing on collections (like List, Set, Map, etc.) in a clean
//		and readable manner. It supports operations like map, filter, reduce, collect, etc., 
//		and enables parallel and sequential execution of operations.
		
		//here forEach is used to print the data in streams.
		arr2.stream().forEach(x -> System.out.println(x));
		
		//here filter method is used to filter the data w.r.t some condition.
		//Predicate is a FI having test as abstract method.
		//This below stream code will produce the even numbers as o/p from the array.
		arr2.stream().filter(new Predicate<Integer>() {

			@Override
			public boolean test(Integer t) {
				// TODO Auto-generated method stub
				return t%2 == 0;
			}
			
		}).forEach(x -> System.out.println("Even number from FI " + x));
		//o/p of above code - "Even number from FI 2"
		//					  "Even number from FI 4"						
		
		
		arr2.stream().filter((n)-> (n%2 == 0)).forEach(t -> System.out.println(t));
		//Gives all numbers divisible by 2 in the array.
		
		arr2.stream().filter((n)-> (n%2 !=0)).forEach(t -> System.out.println(t));
		//Gives all numbers not divisible by 2 in the array.
		
		//ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
	
		//Adding 1 to all the integers of arr2
		//OUTPUT 
//		arr2.stream().map((x)->(x+1)).forEach((x)->System.out.println(x));
//		List<Integer> arr3=arr2.stream().map((x)->(x+1)).collect(Collectors.toList());
//		List<Integer> arr3=arr2.stream().map(x -> {return addOneToEachvalue(x);}).collect(Collectors.toList());
//		This will create list while below stream will print list.		
		System.out.println(arr2.stream().map(x -> {return addOneToEachvalue(x);}).collect(Collectors.toList()));
		
		//Adding 1 to all the integers of arr2 and counting them.
		System.out.println(arr2.stream().map(x -> {return addOneToEachvalue(x);}).count());
		
		
		///arr2.stream().fil
		
		//arr2.stream().sorted();
		
		
		List<Person> people  = Arrays.asList( new Person(1,20,"Bikesh","Delhi"),new Person(2,21,"Ana","Delhi2"),
				new Person(3,22,"Bikesh3","Delhi3"),new Person(4,23,"Bikesh4","Delhi4"),new Person(5,25,"Bikesh5","Delhi5"),
				new Person(6,26,"Ana","Delhi6"));
		
		System.out.println("Size of the people object " + people.size());
		
		//Find the first value of occurence if there are people whose name is Ana
		//findFirst() is a method in Java's Stream API that is used to retrieve the first element of a stream. 
		//findFirst is dependent on type of stream ordered or not;
//		get(): Gets the value from the Optional returned by findFirst(). This assumes that the filter will 
//		always find at least one matching element.		
//		System.out.println("First value of ana -  " + people.stream().filter(x-> x.getName().equals("Anaa"))
//																			.findFirst().get().getName());
		//the above stream gives o/p as : No Value Present.
		
//		System.out.println("First value of ana -  " + people.stream().filter(x-> x.getName().equals("Ana"))
//		.findFirst().get().getName());		
//		First value of Ana -  Ana		
//		
		Person person3 = new Person(6,26,"Default","Default");
		
		Optional op = Optional.of(person3);
		
		System.out.println("First value of ana -  " + people.stream().filter(x-> x.getName().equals("Anaa"))
				.findFirst().orElse( new Person(6,26,"Default","Default")));
		//Find the second highest number 
		ArrayList<Integer> arr4 = new ArrayList<>(Arrays.asList(1000, 2000, 3000, 4000));
		
		System.out.println(arr4.stream().sorted(Collections.reverseOrder()).skip(1).findFirst());
		//try with resources with examples and interview
		// try exception handle inheritance 	
		
//		Examples using streams and then Method References
		
//		List<String> names = Arrays.asList("John", "Jane", "Jack", "Doe");
//		streams in Java are often used with lambda expressions, but they are not inherently
//		dependent on them but we can also use method reference 
		//Using Method Reference
//		List<String> upperCaseNames = names.stream()
//                .map(String::toUpperCase)
//                .collect(Collectors.toList());
//		System.out.println(upperCaseNames);
		
		//Using Streams
//		List<String> upperCaseNames = names.stream()
//                .map(name -> name.toUpperCase())
//                .collect(Collectors.toList());
//		System.out.println(upperCaseNames);
		
		//Using Method Reference
//		List<String> filteredNames = names.stream()
//                .filter(StreamExample::startsWithJ)
//                .collect(Collectors.toList());
//		System.out.println(filteredNames);
		
		//Using Streams
//		List<String> filteredNames = names.stream()
//                .filter(name -> name.startsWith("J"))
//                .collect(Collectors.toList());
//		System.out.println(filteredNames);

	}
}
