package Array_List;

//import java.util.ArrayList;
import java.util.HashMap;

public class Searchelement {
	public static void main(String[] args) {
		HashMap<Integer, String> search = new HashMap<Integer, String>();
		search.put(1,"one");
		search.put(2,"two");
		search.put(3,"three");
		search.put(4,"four");
		System.out.println("The actual hashmap is " + search);
		
		System.out.println("I/P: Do we have key 1 ?");
		
		// searching element which is there in the hashmap
	
		if(search.containsKey(1)) {
			System.out.println("O/P : Yes the element exists - One ");
		}

		else
			System.out.println("O/P: No there is no such element found");
		
		
		//searching element which is not there in the hashmap
		
		System.out.println("I/P: Do we have key 6 ?");
		
		if(search.containsKey(6)) {
			System.out.println("O/P : Yes the element exists - Six ");
		}

		else
			System.out.println("O/P: No there is no such element found");
		
	}
}