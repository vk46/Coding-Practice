/**
 * 
 */
package com.vk.strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class DuplicateWords {

	public static void main(String[] args) {
		String stringWord = "Welcome to HCL to World";
		List<String> listStr = Arrays.asList(stringWord.split(" "));
		Map<String, Integer> word_map = new HashMap<>();

		for (String string : listStr) {
			if(word_map.get(string)!=null) {
				word_map.put(string, word_map.get(string) + 1);
			}else {
				word_map.put(string, 1);
			}
		}
		Set<String> word_set = word_map.keySet();
		for (String word : word_set) {
			if (word_map.get(word) > 1) {
				System.out.println(word);
			}
		}
		
		Set<String> modified = new TreeSet<>(listStr);
		System.out.println(modified);
	}

}
