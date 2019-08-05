/**
 * 
 */
package weekendassigment;

import java.util.Scanner;

/**
 * @author vramaprasad
 *
 */
public class KaprekarNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();	
		int result = UserMainCode.getKaprekarNumber(input);
		
		if(result == 1)
			System.out.println("Kaprekar number");
		else
			System.out.println("Not a Kaprekar Number");
	}

}
