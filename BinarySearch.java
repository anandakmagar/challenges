package assignments;

import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int length = scanner.nextInt();
		System.out.println("Enter the element to be searched");
		int value = scanner.nextInt();
		System.out.println("Enter the elements for the array");
		
		int array[] = new int[length];
		for(int i = 0; i < length; i++) {
			array[i] = scanner.nextInt();
		}
		
		int low = 0;
		int high = array.length - 1;
		int mid = 0;
		
		while(low <= high) {
			mid = (low + high)/2;
			if(array[mid] == value) {
				System.out.println("Value " + value + " found at index " + mid);
				break;
			}
			else if(array[mid] > value) {
				high = mid - 1;
			}
			else if(array[mid] < value) {
				low = mid + 1;
			}
		}
//		if(low > high) {
//			System.out.println("Element not found");
//		}
	}
}
