package assignments.problems7;

import java.util.LinkedList;

public class LinkedListElementCheck {
	public static void isElementExists(LinkedList<Integer> numbers, int num) {
		if(numbers.contains(num)) {
			System.out.println(num + " is at index " + numbers.indexOf(num));
		}
	}
	public static void main(String[] args) {
		LinkedList<Integer> numbers = new LinkedList<>();
		
		// Adding elements to the linked list
		numbers.add(1);
		numbers.add(4);
		numbers.add(9);
		numbers.add(0);
		
		isElementExists(numbers, 0);
	}
}
