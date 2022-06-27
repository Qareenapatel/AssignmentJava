package reversestring1;

public class ReverseString3 {

	public static void main(String[] args) {
		
String[] arr = new String [] {"I am learning Java. This is very important to learn for developing the code"};
		
		for (int i = arr.length-1; i >= 0; i--)
		{
			System.out.println(arr[i]);
		}
	}

}
