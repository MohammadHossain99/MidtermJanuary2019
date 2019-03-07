package datastructure;

import java.util.*;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Queue<String> que = new LinkedList<>();
		que.add("Students");
		que.add("Employee");
		que.add("Employer");
		que.add("Adminestration");

		System.out.println(que.peek());
		System.out.println(que.size());
		System.out.println(que.remove());
		System.out.println(que.peek());
		System.out.println(que.element());

		System.out.println();
		System.out.println("********************************");
		System.out.println();

		Iterator<String> mp =  que.iterator();
		while(mp.hasNext()){
			System.out.println(mp.next());
		}

		Map<Integer,Queue<String>> db = new LinkedHashMap<>();
		db.put(1,que);


		for(Map.Entry<Integer,Queue<String>> jp: db.entrySet()){
			System.out.println(jp.getKey()+ "  ------->    "+jp.getValue());
		}

	}

}
