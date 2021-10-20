import java.util.ArrayList;
public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> my_list = new ArrayList<>();
		my_list.add(6);
		my_list.add(4);
		my_list.add(11);
        my_list.add(16);
		System.out.println("\nList is :"+my_list); // Prints  : [6, 4, 11,16]
		my_list.remove(2); // It will remove 11 (element at index 2) because remove() has two overloaded variants
				// remove(int index) -> Removes from index
				// remove(Object o) -> Removes an element that is equal to the given object
		// Since, 2 is an int and not an Integer. . . And there is an EXACT MATCH for the invocation
		// Thus, remove(int index) will be used and 11(at index 2) will be removed

		// If you want to remove 4. . . You have to use the second variant
		// For that you must pass an Integer object with value 2, which is NOT an exact match for remove(int index)
		my_list.remove(new Integer(4));
		//my_list.add("2"); error String cannot be converted into Integer
		System.out.println("\nList is :"+my_list);//Prints  : [6,16]
	}
}