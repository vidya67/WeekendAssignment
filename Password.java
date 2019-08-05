/**
 * 
 */
package weekendassigment;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * @author vramaprasad
 *
 */
public class Password {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		if(UserMainCode.validatePassword(input))
			System.out.println("Valid");
		else
			System.out.println("Invalid");
		
	}

}
