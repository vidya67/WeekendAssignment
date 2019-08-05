/**
 * 
 */
package weekendassigment;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @author vramaprasad
 *
 */
public class UniqueEvenSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];
		for(int i = 0; i < size; i ++)
			arr[i] = sc.nextInt();
		
		int sum = UserMainCode.addUniqueEven(arr);
		if(sum != 0)
			System.out.println(sum);
		else
			System.out.println("No even numbers");
	}

}
