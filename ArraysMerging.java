package assignments.problems4;

public class ArraysMerging {
	public static void mergeArrays(int[] array1, int[] array2) {
		int length1 = array1.length;
		int length2 = array2.length;
		
		int[] mergedArray = new int[length1 + length2];
		
		for(int i = 0; i < length1; i++) {
			mergedArray[i] = array1[i];
		}
		
		for(int j = 0; j < length2; j++) {
			mergedArray[length1 + j] = array2[j];
		}
		
		for(int k: mergedArray) {
			System.out.print(k + " ");
		}
		
		
	}
	public static void main(String[] args) {
		int[] array1 = {1, 4, 2, 5};
		int[] array2 = {0, 3, 6, 7};
		mergeArrays(array1, array2);
		
	}
}
