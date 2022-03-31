package com.vk.strings;

public class ReverseString {

	public static void main(String[] args) {
		String name = "VinayKumarPalla";
		String reverseName = new String();
		
		for(int i=name.length()-1; i>=0; i--) {
			reverseName = reverseName+ name.charAt(i);
		}
		System.out.println(reverseName.toLowerCase());
		
		for (int i = name.length()-1; i >= 0; i--) {
			System.out.print(name.charAt(i));
		}
	}
}
