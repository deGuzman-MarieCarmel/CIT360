package collectionTypes;

import java.util.Collections;
import java.util.LinkedList;

public class linkedList {

	public static void main(String[] args) {
		
		//This program shows how to store, manipulate, remove, copy, duplicate, and sort elements in LinkedList collections
		//Note- LinkedList does not allow random access to elements
		
		LinkedList<String> linkedMovies = new LinkedList<>();
		//add elements at a specified index
		linkedMovies.add(0, "Star Wars");
		linkedMovies.add(1, "Avengers");		
		linkedMovies.add(2, "Hunger Games");
		linkedMovies.add(3, "Star Trek: Into Darkness");
		//replace a specific index element
		linkedMovies.set(0, "Star Wars: The Force Awakens");
		linkedMovies.set(1, "Avengers: Endgame");
		//remove element
		linkedMovies.remove("Hunger Games");
		//LinkedList can contain Duplicate elements
		linkedMovies.add("Star Wars: The Force Awakens");
		//print elements
		System.out.println("Movies: " + linkedMovies + "\n");
		
		LinkedList<String> linkedStarWars = new LinkedList<>();
		//add elements
		linkedStarWars.add("Adam Driver");
		linkedStarWars.add("Daisy Ridley");
		//print elements
		System.out.println("Star Wars Actors: " + linkedStarWars);
		
		LinkedList<String> linkedAvengers = new LinkedList<>();
		//add elements
		linkedAvengers.add("Robert Downey Jr.");
		linkedAvengers.add("Christ Evans");
		//print elements
		System.out.println("Avengers Actors: " + linkedAvengers);
		
		LinkedList<String> linkedStarTrek = new LinkedList<>();
		//add elements
		linkedStarTrek.add("Chris Pine");
		linkedStarTrek.add("Benedict Cumberbatch");
		//print elements
		System.out.println("Avengers Actors: " + linkedStarTrek);
		
		//Copy elements of existing collections to the end of a new collection
		LinkedList<String> linkedActors = new LinkedList<>();
		linkedActors.addAll(linkedStarWars);
		linkedActors.addAll(linkedAvengers);
		linkedActors.addAll(linkedStarTrek);
		System.out.println("\nALL ACTORS (unsorted): " + linkedActors);
		
		//LinkedLists collections can do sorting
		Collections.sort(linkedActors);
		System.out.println("\nALL ACTORS (sorted): " + linkedActors);
		
	}

}
