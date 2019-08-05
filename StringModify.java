/**
 * 
 */
package weekendassigment;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author vramaprasad
 * PROBLEM 1
 */

public class StringModify {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String inputone = "", inputtwo = "";
		
		inputone = sc.next();
		inputtwo = sc.next();
		
		System.out.println("\n"+UserMainCode.replacePlus(inputone, inputtwo.toLowerCase()));
	}	
}
/*
Input and Output Format:
Input consists of two strings with a maximum size of 100 characters.
Output consists of a single string.
Refer the sample output for formatting specifications.
Sample Input 1:
abcxyz
axdef
Sample Output 1:
a++ x++

Sample Input 2:
ABCDEF
feCBAd
Sample Output 2:
ABCDEF

 */
