package assignments;

public class MethodOverloading {
	public int add(int a, int b) {
		return a + b;
	}
	
	public double add(double a, double b) {
		return a + b;
	}
	public static void main(String[] args) {
		MethodOverloading mo = new MethodOverloading();
		
		System.out.println(mo.add(3, 4));
		System.out.println(mo.add(3.0, 4.0));
	}
}
