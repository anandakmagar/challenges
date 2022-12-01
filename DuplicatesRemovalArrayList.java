package assignments.problems7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DuplicatesRemovalArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		
		numbers.add(1);
		numbers.add(3);
		numbers.add(9);
		numbers.add(6);
		numbers.add(1);
		numbers.add(3);
		
		Set<Integer> withoutDuplicates = new HashSet<>();
		
		for(int i = 0; i < numbers.size(); i++) {
			for(int j = i+1; j < numbers.size(); j++) {
				withoutDuplicates.add(numbers.get(i));

			}
		}

		
		Iterator<Integer> iterator = withoutDuplicates.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		
		
	}
}
