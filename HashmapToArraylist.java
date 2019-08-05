/**
 * 
 */
package weekendassigment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * @author vramaprasad
 *
 */
public class HashmapToArraylist {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i ++){
			hm.put(sc.nextInt(), sc.next());
		}
		ArrayList<String> output = UserMainCode.getName(hm);
		Iterator iter = output.iterator();
		while(iter.hasNext())
			System.out.println(iter.next());		
	}

}
