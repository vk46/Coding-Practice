package com.vk.strings;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateChars {

	public static void main(String[] args) {
		
		String input = "aabbccdddd";
		Map<Character, Integer> map = new HashMap<>();
		for(int i =0; i<input.length(); i++) {
			if(map.containsKey(input.charAt(i))){
				map.put(input.charAt(i), map.get(input.charAt(i))+1);
			}else {
				map.put(input.charAt(i), 1);
			}
		}
		
		for (Character charecter : map.keySet()) {
			System.out.print(map.get(charecter)+""+charecter);
		}
	}

}
