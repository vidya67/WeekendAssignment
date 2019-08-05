/**
 * 
 */
package weekendassigment;

import java.util.Scanner;

/**
 * @author vramaprasad
 *
 */
public class MaximumDifference {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int array[] = new int[size];
		
		for(int i = 0; i < size; i ++)
			array[i] = sc.nextInt();
		
		System.out.println(UserMainCode.findMaxDistance(array));
	}

}
