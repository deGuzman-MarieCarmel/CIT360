package collectionTypes;

import java.util.TreeSet;

public class treeSet {

	public static void main(String[] args) {

		//This program shows how to store, manipulate, remove, copy, and display pre-sorted elements in TreeSet collections
		//Note- TreeSet cannot contain duplicates and does not allow random access to elements
		
		TreeSet<String> treeSetMovies = new TreeSet<>();
		//add elements, note that treeSet does not support the (index, string) argument
		treeSetMovies.add("Star Wars");
		treeSetMovies.add("Avengers");		
		treeSetMovies.add("Hunger Games");
		treeSetMovies.add("Star Trek: Into Darkness");
		//replace a specific element
		treeSetMovies.subSet("Star Wars", "Star Wars: The Force Awakens");
		treeSetMovies.subSet("Avengers", "Avengers: Endgame");
		//remove element
		treeSetMovies.remove("Hunger Games");
		
		//print elements
		System.out.println("Movies: " + treeSetMovies + "\n");
		
		TreeSet<String> treeSetStarWars = new TreeSet<>();
		//add elements
		treeSetStarWars.add("Adam Driver");
		treeSetStarWars.add("Daisy Ridley");
		//print elements
		System.out.println("Star Wars Actors: " + treeSetStarWars);
		
		TreeSet<String> treeSetAvengers = new TreeSet<>();
		//add elements
		treeSetAvengers.add("Robert Downey Jr.");
		treeSetAvengers.add("Christ Evans");
		//print elements
		System.out.println("Avengers Actors: " + treeSetAvengers);
		
		TreeSet<String> treeSetStarTrek = new TreeSet<>();
		//add elements
		treeSetStarTrek.add("Chris Pine");
		treeSetStarTrek.add("Benedict Cumberbatch");
		//print elements
		System.out.println("Avengers Actors: " + treeSetStarTrek);
		
		//Copy elements of existing collections to the end of a new collection
		TreeSet<String> treeSetActors = new TreeSet<>();
		treeSetActors.addAll(treeSetStarWars);
		treeSetActors.addAll(treeSetAvengers);
		treeSetActors.addAll(treeSetStarTrek);
		//prints all elements, note that TreeSet collection data are pre-sorted in ascending order
		System.out.println("\nALL ACTORS (pre-sorted): " + treeSetActors);
		
	}

}
