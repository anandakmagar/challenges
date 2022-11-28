package assignments.problems4;

import java.util.HashSet;
import java.util.Set;

public class ArrayDuplicatesRemove {
	public static void removeDuplicates(int[] array) {
		Set<Integer> finalElements = new HashSet<Integer>();
		for(int i = 0; i < array.length; i++) {
			finalElements.add(array[i]);
		}
		
		for(int k: finalElements) {
			System.out.print(k + " ");
		}
	}
	public static void main(String[] args) {
		int[] array = {1, 3, 2, 9, 9, 2, 3};
		removeDuplicates(array);
	}
}
