/**
 * 
 */
package weekendassigment;

import java.util.Scanner;

/**
 * @author vramaprasad
 *
 */
public class Anagrams {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String inputone = sc.next();
		String inputtwo = sc.next();
		
		int val = UserMainCode.getAnagram(inputone, inputtwo);
		if(val == 1)
			System.out.println("Anagrams");
		else
			System.out.println("Not Anagrams");
	}

}
