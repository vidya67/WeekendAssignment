/**
 * 
 */
package weekendassigment;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author vramaprasad
 *
 */
public class ArrayListManipulation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer> arr1 = new ArrayList<Integer>();
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int index = 0; index < n; index ++){
			arr1.add(sc.nextInt());
		}
		for(int index = 0; index < n; index ++){
			arr2.add(sc.nextInt());
		}
		UserMainCode.generateOddEvenList(arr1, arr2);
	}

}
