/**
 * 
 */
package com.vk.strings;

/**
 * @author vk
 *
 */
public class StringPrint {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = null;
		
		try {
			System.out.println(s);
		} catch (Exception e) {
			System.err.println(e.getLocalizedMessage());
			return;
		}
		
		finally {			
			System.out.println("Finally block printing");
		}

	}

}
