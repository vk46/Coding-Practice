package com.vk.strings;

public class DuplicateCharacter {

	public static void main(String[] args) {
		String stringWord = "Vinay Kumar Palla";
		char[] charList = stringWord.replaceAll("\\s", "").toCharArray();  
		for(int i=0; i<charList.length;i++) {
			int count = 1;
			for (int j = i+1; j < charList.length; j++) {
				if(charList[i]==charList[j]) {
					count++;
					charList[j]='$';
				}
			}
			if(count>1 && charList[i]!='$') {
				System.out.print(charList[i]);
			}
		}
	}
}
