package collectionTypes;

import java.util.HashMap;
import java.util.Random;

public class hashMap {

	public static void main(String[] args) {
		//This program shows how to store, manipulate, remove, copy, and show random elements in HashMap collections
		//Note- HashMap cannot contain duplicate and ordering is undefined.
		//Note- HashMap is used to store key and value pairs
		
		HashMap<Integer, String> hashMapMovies = new HashMap<>();
		//add elements or key-value pairs
		hashMapMovies.put(0, "Star Wars");
		hashMapMovies.put(1, "Avengers");		
		hashMapMovies.put(2, "Hunger Games");
		hashMapMovies.put(3, "Star Trek: Into Darkness");
		//replace a specific key-value pair
		hashMapMovies.put(0, "Star Wars: The Force Awakens");
		hashMapMovies.put(1, "Avengers: Endgame");
		//remove element
		hashMapMovies.remove(2);
		
		System.out.println("Movies: " + hashMapMovies);
		
		//print a specific value by key
		String getMovie = hashMapMovies.get(1);
		System.out.println("My favorite movie is " + getMovie + ".\n");
		
		HashMap<Integer, String> hashMapStarWars = new HashMap<>();
		//add elements or key-value pairs
		hashMapStarWars.put(0, "Adam Driver");
		hashMapStarWars.put(1, "Daisy Ridley");
		//add elements or key-value pairs
		System.out.println("Star Wars Actors: " + hashMapStarWars);
		
		HashMap<Integer, String> hashMapAvengers = new HashMap<>();
		//add elements or key-value pairs
		hashMapAvengers.put(2, "Robert Downey Jr.");
		hashMapAvengers.put(3, "Christ Evans");
		//print elements
		System.out.println("Avengers Actors: " + hashMapAvengers);
		
		HashMap<Integer, String> hashMapStarTrek = new HashMap<>();
		//add elements or key-value pairs
		hashMapStarTrek.put(4, "Chris Pine");
		hashMapStarTrek.put(5, "Benedict Cumberbatch");
		//print elements
		System.out.println("Avengers Actors: " + hashMapStarTrek);
		
		//Copy elements of existing collections to the end of a new collection
		HashMap<Integer, String> hashMapActors = new HashMap<>();
		hashMapActors.putAll(hashMapStarWars);
		hashMapActors.putAll(hashMapAvengers);
		hashMapActors.putAll(hashMapStarTrek);
		System.out.println("\nALL ACTORS (undefined order): " + hashMapActors);	
		
				
		//HashMap allows random access to elements
			Object[] obj = hashMapActors.keySet().toArray();
			Object key = obj[new Random().nextInt(obj.length)];
			
	        // take a random element from list and print them 
			System.out.printf("\nRandom Actor selected is ");
	        System.out.println(hashMapActors.get(key)); 
		
	}

}
