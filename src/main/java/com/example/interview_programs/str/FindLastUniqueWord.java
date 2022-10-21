package com.example.interview_programs.str;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindLastUniqueWord {
	
	public static void main (String[]args)
	{
		String sentence =  "The high The mortality of medical practitioners in the medical region's two most populous countries shows the challenge they face combating the pandemic with testing and health-care systems lagging neighbors such as Singapore neighbors";

		String lastUniqueWord = lastUniqueWord(sentence);

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
		
		System.out.println(map);
		
		List<String> uniqueWords = new LinkedList<String>();
		List<String> repeatedWords = new LinkedList<String>();
		Set<Entry<String, Integer>> entries = map.entrySet();
		for(Entry<String, Integer> entry : entries)
		{
			if(entry.getValue() == 1)
			{
				uniqueWords.add(entry.getKey());
			}
			else
			{
				repeatedWords.add(entry.getKey());
			}
		}
		
		System.out.println("Unique Words: "+ uniqueWords);
		System.out.println("Repeated Words: "+ repeatedWords);
		System.out.print("Last Unique word: ");
		System.out.println(uniqueWords.get(uniqueWords.size()-1));
		System.out.print("Last Duplicate word: ");
		System.out.println(repeatedWords.get(repeatedWords.size()-1));
		
		return uniqueWords.get(uniqueWords.size()-1);
	}
	
	
}
