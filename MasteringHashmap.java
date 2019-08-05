/**
 * 
 */
package weekendassigment;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author vramaprasad
 *
 */
public class MasteringHashmap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for(int i = 0; i < n; i ++){
			hm.put(sc.nextInt(), sc.nextInt());
		}
		System.out.println(UserMainCode.getAverageOfOdd(hm));
		
	}

}
