package unit;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class MiscTest 
{

	@Test
	public void systemGetPropertiesTest() 
	{
		String os = System.getProperty("os.name");
		System.out.println(os);
	}
	
	@Test
	public void entrySetTest() 
	{
		String input = "how are you how are you are you a winner you";
		System.out.println(getRep(4, input));
	}
	
	
	public static String getRep(int n, String input)
	{
		String ret = "";

		Map<String, Integer> wordMap = new HashMap<>();
		String[] inputArr = input.split(" ");

		for(String s: inputArr)
		{
			if (wordMap.containsKey(s))
			{
				int count = wordMap.get(s) + 1;
				wordMap.put(s, count);
			}
			else
			{
				wordMap.put(s, 1);
			}
		}

		for(Map.Entry<String, Integer> map : wordMap.entrySet())
		{
			if(map.getValue() == n)
			{
				ret = map.getKey();
			}
		}

		return ret;
	}
}
