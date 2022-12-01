package assignments.problems7;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTraverseReverse {
	public static void main(String[] args) {
		LinkedList<Integer> numbers = new LinkedList<>();
		numbers.add(1);
		numbers.add(8);
		numbers.add(0);
		numbers.add(7);
		
		// Printing the elements in the linked list
		System.out.println("Elements in the original form");
		Iterator<Integer> iterator = numbers.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		
		System.out.println();
		
		// Reversing the elements in the linkedlist
		System.out.println("Elements in the reversed form");
		for(int i = numbers.size() - 1; i >= 0; i--) {
			System.out.print(numbers.get(i) + " ");
		}
		
	}
}
