package datastructure;

import java.util.*;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */

		List<String> city = new ArrayList<>();
		city.add("New York");
		city.add("Los Angeles");
		city.add("DC");
		city.add("Paterson");

		List<String> state = new ArrayList<>();
		state.add("New York");
		state.add("Virginia");
		state.add("New Jersey");
		state.add("New Jersey");
		state.add("Floria");

		List<String> game = new LinkedList<>();
		game.add("Football");
		game.add("Basket Ball");
		game.add("Cricket");

		Map<String,List<String>> map = new HashMap<>();
		map.put("US City:",city);
		map.put("US State:",state);
		map.put("Game Name:",game);

		for(Map.Entry<String,List<String>> mp : map.entrySet()){
			System.out.println(mp.getKey()+" -------->  "+mp.getValue());

		}

	}

}
