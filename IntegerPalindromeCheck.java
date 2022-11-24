package assignments;

public class IntegerPalindromeCheck{
	public static void main(String args[]) {
		int number = 989;
		int reverse = 0;
		int originalNumber = number;
		
		while(number > 0) {
			reverse = (reverse * 10) + (number % 10);
			number = number / 10;
		}
		
		System.out.println("Original number is " + originalNumber);
		System.out.println("Reversed number is " + reverse);
		
		if(originalNumber == reverse) {
			System.out.println("It is a palindrome");
		}
		else {
			System.out.println("It is not a palindrome");
		}
	}
}