package collectionTypes;

import java.util.Random;
import java.util.TreeMap;

public class treeMap {

	public static void main(String[] args) {
		//This program shows how to store, manipulate, remove, copy, sort, and show random elements in TreeMap collections
		//Note- TreeMap cannot contain duplicate
		//Note- TreeMap is used to store key and value pairs just like HashMap but it is in sorted order
		
		TreeMap<Integer, String> treeMapMovies = new TreeMap<>();
		//add elements or key-value pairs
		treeMapMovies.put(0, "Star Wars");
		treeMapMovies.put(1, "Avengers");		
		treeMapMovies.put(2, "Hunger Games");
		treeMapMovies.put(3, "Star Trek: Into Darkness");
		//replace a specific key-value pair
		treeMapMovies.put(0, "Star Wars: The Force Awakens");
		treeMapMovies.put(1, "Avengers: Endgame");
		//remove element
		treeMapMovies.remove(2);
		
		System.out.println("Movies: " + treeMapMovies);
		
		//print a specific value by key
		String getMovie = treeMapMovies.get(1);
		System.out.println("My favorite movie is " + getMovie + ".\n");
		
		TreeMap<Integer, String> treeMapStarWars = new TreeMap<>();
		//add elements or key-value pairs
		treeMapStarWars.put(10, "Adam Driver");
		treeMapStarWars.put(11, "Daisy Ridley");
		//add elements or key-value pairs
		System.out.println("Star Wars Actors: " + treeMapStarWars);
		
		TreeMap<Integer, String> treeMapAvengers = new TreeMap<>();
		//add elements or key-value pairs
		treeMapAvengers.put(2, "Robert Downey Jr.");
		treeMapAvengers.put(3, "Christ Evans");
		//print elements
		System.out.println("Avengers Actors: " + treeMapAvengers);
		
		TreeMap<Integer, String> treeMapStarTrek = new TreeMap<>();
		//add elements or key-value pairs
		treeMapStarTrek.put(4, "Chris Pine");
		treeMapStarTrek.put(5, "Benedict Cumberbatch");
		//print elements
		System.out.println("Avengers Actors: " + treeMapStarTrek);
		
		//Copy elements of existing collections to the end of a new collection
		TreeMap<Integer, String> treeMapActors = new TreeMap<>();
		treeMapActors.putAll(treeMapStarWars);
		treeMapActors.putAll(treeMapAvengers);
		treeMapActors.putAll(treeMapStarTrek);
		System.out.println("\nALL ACTORS (keys sorted): " + treeMapActors);	
		
				
		//HashMap allows random access to elements
			Object[] obj = treeMapActors.keySet().toArray();
			Object key = obj[new Random().nextInt(obj.length)];
			
	        // take a random element from list and print them 
			System.out.printf("\nRandom Actor selected is ");
	        System.out.println(treeMapActors.get(key)); 

	}

}
