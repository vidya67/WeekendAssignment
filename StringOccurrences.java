/**
 * 
 */
package weekendassigment;

import java.util.Scanner;

/**
 * @author vramaprasad
 *
 */
public class StringOccurrences {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputone = "", inputtwo = "";
		Scanner sc = new Scanner(System.in);
		inputone = sc.nextLine();
		inputtwo = sc.nextLine();
		
		System.out.println(UserMainCode.countNoOfWords(inputone, inputtwo));
		
		
	}

}
