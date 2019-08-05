/**
 * 
 */
package weekendassigment;

import java.util.Scanner;

/**
 * @author vramaprasad
 *
 */
public class MaxVowels {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		System.out.println(UserMainCode.getWordWithMaxVowels(input));
	}

}
