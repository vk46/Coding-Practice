/**
 * 
 */
package com.vk.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author vk
 *
 */
public class StringInterview {

	public static void main(String[] args) {
		String[] values = { "CAT", "TAC", "ACT", "MARY", "ARMY", "VINAY" };

		Map<Integer, List<String>> resultMap = new HashMap<Integer, List<String>>();
		for (String value : values) {
			char[] caharacters = value.toLowerCase().toCharArray();
			int asciSum = 0;
			for (char character : caharacters) {
				asciSum = asciSum + (int) character;
			}
			if (resultMap.containsKey(asciSum)) {
				resultMap.get(asciSum).add(value);
			} else {
				List<String> list = new ArrayList<String>();
				list.add(value);
				resultMap.put(asciSum, list);
			}
		}
		for (Map.Entry<Integer, List<String>> entry : resultMap.entrySet()) {
			if(entry.getValue().size()>1) {				
				System.out.println(entry.getKey() + "/" + entry.getValue());
			}
		}

	}

}
