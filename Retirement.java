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
public class Retirement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashMap<String, String> hm = new HashMap<String, String>();
		for(int i = 0; i < n; i ++){
			hm.put(sc.next(), sc.next());
		}
		System.out.println(UserMainCode.retirementEmploymentList(hm));
	}

}
