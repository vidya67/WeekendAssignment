/**
 * 
 */
package weekendassigment;

import java.util.Scanner;

/**
 * @author vramaprasad
 *
 */
public class MathClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer num1, num2;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter num1: ");
		num1 = sc.nextInt();
		System.out.print("Enter num2: ");
		num2 = sc.nextInt();
		
		System.out.println("Absolute value of "+num1+" is "+Math.abs(num1));
		System.out.println("Absolute value of "+num2+" is "+Math.abs(num2));
		
		if(num1.equals(num2))
			System.out.println(num1 + " = " + num2);
		else
			System.out.println(num1 + " != " + num2);

	}

}
