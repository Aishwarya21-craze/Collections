package Array_List;

import java.util.HashMap;

public class string_hashmap {
	public static void main(String[] args) {
		//Java program to test if a map contains a mapping for the specified key.
		
	HashMap<Integer,String> rainbow = new HashMap<Integer,String>();
	rainbow.put(1, "RED");
	rainbow.put(2, "Blue");
	rainbow.put(3, "Orange");
	rainbow.put(4, "Purple");
	
     //System.out.println(rainbow);
	//System.out.println("Do we have the key which contains 9 " +  rainbow.get(1) );
	
	if(rainbow.get(1)=="RED" ) {
		System.out.println("yes, we have RED in the list");
		
	}
	else
	System.out.println("No, we didn't have RED in the list");
	
	System.out.println("Is key White exists");
	
	}

}
