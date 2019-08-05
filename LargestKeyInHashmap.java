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
public class LargestKeyInHashmap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i= 0;
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		for(i = 0; i < n; i ++){
			hm.put(sc.nextInt(), sc.next());
		}
		System.out.println(UserMainCode.getMaxKeyValue(hm));
	}

}
