
package Array_List;

import java.util.ArrayList;

public class string_array_list {
	public static void main(String[] args) {
		
	//Java program to create a new array list, add some colors (string) and print out the collection.
	ArrayList<String> color = new ArrayList<String>();
	//adding colors to the array list
	color.add("Red");
	color.add("Blue");
	color.add("Yellow");
	color.add("Orange");
	//size of the list
	int arraynum = color.size();
	int i;
	//print the size
      System.out.println("The size of the array is "+ arraynum);
      
    //print all the elements in the list
	for(i=0;i<arraynum;i++)
	{
		System.out.println("The arraylist contains " + color.get(i));
	}
	
	System.out.println("The available colors in the list are " +  color);
	
	}
}
	
	
	
	
	
	
	
	