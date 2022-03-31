package com.vk.strings;

public class ReverseStringWords {

	public static void main(String[] args) {
		String inputString = "Vinay Kumar Palla";
		String[] listWords = inputString.split("\\s");
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < listWords.length; i++) {
			sb = sb.append(new StringBuilder(listWords[i]).reverse()+ " ");
		}
		
		System.out.println(sb);
		
		for (int i = listWords.length-1; i >=0; i--) {
			System.out.print(listWords[i]+" ");
		}
		
		System.out.println("\n"+listWords[0]);
		System.out.println(listWords[listWords.length%2]);
		System.out.println(listWords[listWords.length-1]);
	}

}
