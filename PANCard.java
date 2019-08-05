/**
 * 
 */
package weekendassigment;

import java.util.Scanner;

/**
 * @author vramaprasad
 *
 */
public class PANCard {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		
		int result = UserMainCode.validatePAN(input);
		if(result == 1)
			System.out.println("Valid");
		else
			System.out.println("Invalid");
	}

}
