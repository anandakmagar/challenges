package assignments;

public class StringReplace {
	public static void main(String[] args) {
		String whoAmI = "I am Ananda";
		
		String replacedString = whoAmI.replaceAll(whoAmI, "I am not Ananda");
		
		System.out.println(replacedString);
	}
}
