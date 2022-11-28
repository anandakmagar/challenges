package assignments.problems4;

public class ArraySorting {
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 9, 6, 0, 7, 6};
		
		for(int i = 0; i < array.length; i++) {
			for(int j = i+1; j < array.length; j++) {
				int temp = 0;
				if(array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		
		for(int i: array) {
			System.out.println(i + " ");
		}
	}
}
