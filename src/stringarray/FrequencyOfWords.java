package stringarray;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfWords {

	public static void main(String[] args) {

		String sentence = "Hello Hello Beautiful world. How are you all. We have have sunny days. Enjoy your summertime with "
				+ "family and friends friends. But I am busy with crash course which I have to complete within within a month.";

		String[] words = sentence.split(" ");

		for (String word : words) {

			System.out.println(word + " : " + word.length());

		}
		System.out.println("-----------------------");

		/*String[] subString = sentence.split("days");

		System.out.println(Arrays.toString(subString));*/
		
		/*String[] subString = sentence.split("\\.");

		System.out.println(Arrays.toString(subString));*/
		
		
		Map<String,Integer> map= new HashMap<String,Integer>();
		Integer count = 1;
		
		String[] arr= sentence.split(" ");
		
		for(int i=0; i<arr.length;i++)
			if(!map.containsKey(arr[i]))
			{
				map.put(arr[i], count);
			}
			else {
				map.put(arr[i], map.get(arr[i])+1);
			}
		
		for(String x: map.keySet())
		{
			System.out.println(x + map.get(x));
		}
		

	}

}
