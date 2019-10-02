package collectionTypes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class arrayList {

	public static void main(String[] args) {

		//This program shows how to store, manipulate, remove, copy, duplicate, sort, and show random element in ArrayList collections
		
		List<String> listMovies = new ArrayList<>();
		//add elements at a specified index
		listMovies.add(0, "Star Wars");
		listMovies.add(1, "Avengers");		
		listMovies.add(2, "Hunger Games");
		listMovies.add(3, "Star Trek: Into Darkness");
		//replace a specific index element
		listMovies.set(0, "Star Wars: The Force Awakens");
		listMovies.set(1, "Avengers: Endgame");
		//remove element
		listMovies.remove("Hunger Games");
		//ArrayList can contain Duplicate elements
		listMovies.add("Star Wars: The Force Awakens");
		//print elements
		System.out.println("Movies: " + listMovies + "\n");
		
		List<String> listStarWars = new ArrayList<>();
		//add elements
		listStarWars.add("Adam Driver");
		listStarWars.add("Daisy Ridley");
		//print elements
		System.out.println("Star Wars Actors: " + listStarWars);
		
		List<String> listAvengers = new ArrayList<>();
		//add elements
		listAvengers.add("Robert Downey Jr.");
		listAvengers.add("Christ Evans");
		//print elements
		System.out.println("Avengers Actors: " + listAvengers);
		
		List<String> listStarTrek = new ArrayList<>();
		//add elements
		listStarTrek.add("Chris Pine");
		listStarTrek.add("Benedict Cumberbatch");
		//print elements
		System.out.println("Avengers Actors: " + listStarTrek);
		
		//Copy elements of existing collections to the end of a new collection
		List<String> listActors = new ArrayList<>();
		listActors.addAll(listStarWars);
		listActors.addAll(listAvengers);
		listActors.addAll(listStarTrek);
		System.out.println("\nALL ACTORS (unsorted): " + listActors);
		
		//ArrayList collections can do sorting
		Collections.sort(listActors);
		System.out.println("\nALL ACTORS (sorted): " + listActors);
		
		//ArrayList allows random access to elements
			arrayList obj = new arrayList(); 
	        
	        // take a random element from list and print them 
	        System.out.println(obj.getRandomElement(listActors)); 
		    } 
		  
		    // Function to select an element base on index and return an element 
		    public String getRandomElement(List<String> list) 
		    { 
		        Random rand = new Random(); 
		        System.out.printf("\nRandom Actor selected is ");
		        return list.get(rand.nextInt(list.size())); 
		    } 

}
