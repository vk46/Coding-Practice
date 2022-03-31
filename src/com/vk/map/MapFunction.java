package com.vk.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapFunction {

	public static void main(String[] args) {

		String[] list = {"eat", "tea", "tan", "ate", "nat", "bat"};
		Map<Integer, List<String>> map = new HashMap<>();
		
		for (String value : list) {
			char[] caharacters = value.toLowerCase().toCharArray();
			Integer asciSum = 0;
            for (char character : caharacters) {
                asciSum = asciSum + (int)character;
            }
            if(map.containsKey(asciSum)) {
            	map.get(asciSum).add(value);
            }else {
                List<String> listCreate = new ArrayList<String>();
                listCreate.add(value);
                map.put(asciSum, listCreate);
            }
		}
		System.out.println(map);
	}

}
