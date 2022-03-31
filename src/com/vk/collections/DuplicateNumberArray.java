/**
 * 
 */
package com.vk.collections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

/**
 * @author vk
 *
 */
public class DuplicateNumberArray {

	public static void main(String[] args) {
		
		int a[] = {1,2,1,3,2,3,4,5,6,5};
		
		/* solution 1 */
		Map<Integer, Integer> countMap = new HashMap<>();
		for (int i : a) {
			if(countMap.containsKey(i)) {
				countMap.put(i, countMap.get(i)+1);
			}else {
				 countMap.put(i, 1);
			}
		}
		List<Entry<Integer, Integer>> optionalEntry = countMap.entrySet().stream()
			    .filter(e -> e.getValue() == 1).collect(Collectors.toList());
		for (Entry<Integer, Integer> entry : optionalEntry) {
			System.out.println(entry.getKey());
		}
	}
}
