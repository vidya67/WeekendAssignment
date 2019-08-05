/**
 * 
 */
package weekendassigment;

import java.util.Scanner;

/**
 * @author vramaprasad
 *
 */
public class DateFormat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String dob1 = sc.next();
		String dob2 = sc.next();
		
		System.out.println(UserMainCode.findOldDate(dob1, dob2));
	}

}
