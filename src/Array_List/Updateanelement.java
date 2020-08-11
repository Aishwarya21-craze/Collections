package Array_List;

import java.util.ArrayList;

public class Updateanelement {
	public static void main(String[] args) {
		//declaration
		ArrayList<String> updateelement = new ArrayList<String>();
		
		//adding elements
		
		updateelement.add("user1");
		updateelement.add("user2");
		updateelement.add("user3");
		updateelement.add("user4");
		System.out.println(updateelement);
		
		//add an element in first position
		updateelement.add(0, "user0");
		System.out.println(updateelement);
		
     // remove an element from 2nd position
		updateelement.remove(1);
		System.out.println(updateelement); 
	// get an element
		System.out.println(updateelement.get(1));
		
		
	}

}
