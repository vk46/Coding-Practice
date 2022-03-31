package com.vk.strings;

public class RepeatedString {

	public static void main(String[] args) {
		try {
			String input = "helloabchellopqrhelloxyzhellordbmshellohellohel";
			String inuputWord = "hello";
			
			System.out.println(input);
			
			if(input.contains(inuputWord)) {
				input.split(inuputWord);
				String[] strList = input.split(inuputWord);
				System.out.println(strList.length-1);
				
				String finalString = input.replaceAll("hello", "\\$");
				System.out.println(finalString);
				
				int countChar = finalString.replaceAll("[^$]", "").length();
				System.out.println(countChar);
			}
			
		} catch (Exception e) {
			System.err.println(e.getLocalizedMessage());
		}
	}
	
}
