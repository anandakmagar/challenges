package assignments.problems4;

import java.util.Scanner;

public class ArrayElementSearch {
	public static void searchElement(int[] array, int num) {
		for(int i = 0; i < array.length; i++) {
			if(num == array[i]) {
				System.out.println(num + " is at index " + i);
				break;
			}
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter an array size");
		int n = scanner.nextInt();
		
		int[] array2 = new int[n];
		
		System.out.println("Enter the array elements");
		
		for(int j = 0; j < n; j++) {
			array2[j] = scanner.nextInt();
		}
		
		System.out.println("Enter the number to be searched");
		int num = scanner.nextInt();
		
		searchElement(array2, num);
	}
}
