/*
 3 :Remove Duplicate Characters from a String

Input:  programming

Expected output: progamin

 */

package p1;

import java.util.LinkedHashSet;

public class Example03 {

	public static String removeDuplicate(String str) {

		LinkedHashSet<Character> list = new LinkedHashSet<Character>();
		String newStr = "";

		for (int i = 0; i < str.length(); i++) {
			if (list.add(str.charAt(i))) {
				newStr += str.charAt(i);
			}

		}

		return newStr;
	}

	public static void main(String[] args) {
		String str = "programming";

		System.out.println(removeDuplicate(str));

	}
}
