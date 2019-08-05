/**
 * 
 */
package weekendassigment;

import java.util.Scanner;

/**
 * @author vramaprasad
 *
 */
public class WrapperClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String bin, octal, hexa;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter binary number: ");
		bin = sc.next();
		
		System.out.print("Enter octal number: ");
		octal = sc.next();
		
		System.out.print("Enter hexadecimal number: ");
		hexa = sc.next();
		
		System.out.println("The integer value of the binary number "+bin+" is "+Integer.parseInt(bin, 2));
		System.out.println("The integer value of the octal number "+octal+" is "+Integer.parseInt(octal, 8));
		System.out.println("The integer value of the hexadecimal number "+hexa+" is "+Integer.parseInt(hexa, 16));
	}

}
