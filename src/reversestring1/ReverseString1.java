package reversestring1;

public class ReverseString1 {

	public static void main(String[] args) {
		

		String s = "I am learning Java. This is very important to learn for developing the code";
		String r = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			r = r + s.charAt(i);
		}
		System.out.println(r);
	}

}
