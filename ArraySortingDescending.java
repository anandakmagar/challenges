package assignments.problems4;

public class ArraySortingDescending {
	public static void sortArrayInDescending(int[] array) {
		for(int i = 0; i < array.length; i++) {
			for(int j = i+1; j < array.length; j++) {
				int temp = 0;
				if(array[i] < array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		for(int k: array) {
			System.out.print(k + " ");
		}
	}
	public static void main(String[] args) {
		int[] array = {1, 4, 2, 3, 9, 8};
		sortArrayInDescending(array);
	}
}
