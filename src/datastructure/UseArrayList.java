package datastructure;

import java.awt.*;
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 *
		 */
		ArrayList<String> array = new ArrayList<String>();
		//add elements to the ArrayList
		array.add("JAVA");
		array.add("C++");
		array.add("PERL");
		array.add("PHP");
		array.add("BASIC");
		array.add("COBOL");
		array.add("C");

		System.out.println("List of all elements:");
		System.out.println(array);
		//get elements by index
		System.out.println("Element at index 1: "+array.get(1));
		System.out.println("Does list contains JAVA? "+array.contains("JAVA"));
		//add elements at a specific index
		System.out.println("Adding new element - PASCAL at index 2:");
		array.add(2,"PASCAL");
		System.out.println("New list after the addition:");
		System.out.println(array);
		System.out.println("Is arraylist empty? "+array.isEmpty());
		System.out.println("Index of PERL is "+array.indexOf("PERL"));
		System.out.println("Size of the arraylist is: "+array.size());

		/*Unsorted List*/
		System.out.println("Before Sorting: (using for loop)");
		for(String counter: array){
			System.out.println(counter);
		}

		/* Sort statement*/
		Collections.sort(array);

		/* Sorted List*/
		System.out.println("After Sorting:");
		for(String counter: array){
			System.out.println(counter);
		}

		//Removing an element at index 6
		array.remove(6);
		System.out.println("List after removing element at index 6");
		for(String counter: array){
			System.out.println(counter);
		}

		array.remove("COBOL");
		System.out.println("List after removing element 'COBOL': using Iterator and while loop");
		// Display element by element using Iterator
		Iterator it = array.iterator();
		while (it.hasNext())
			System.out.println(it.next());


	}

}
