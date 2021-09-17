package com.example.interview_programs.str;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class FindLastUniqueWord {
	
	public static void main (String[]args)
	{
		String sentence =  "The high mortality of medical practitioners in the region's two most populous countries shows the challenge they face combating the pandemic with testing and health-care systems lagging neighbors such as Singapore neighbors";

		String lastUniqueWord =lastUniqueWord(sentence);

		System.out.println (lastUniqueWord);
	}

	public static String lastUniqueWord(String sentence)
	{
		String str[] = sentence.split(" ");
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		for(int i=0; i<str.length; i++)
		{
			if(map.get(str[i]) == null)
			{
				map.put(str[i], 1);
			}
			else
			{
				map.put(str[i], map.get(str[i])+1);
			}
		}
		List<String> list = new LinkedList<String>();
		for(Map.Entry<String, Integer> entry : map.entrySet())
		{
			if(entry.getValue() == 1)
			{
				list.add(entry.getKey());
			}
		}
		
		return list.get(list.size()-1);
	}
}
