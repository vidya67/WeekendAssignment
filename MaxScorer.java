/**
 * 
 */
package weekendassigment;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author vramaprasad
 *
 */
public class MaxScorer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		ArrayList<String> studentinfo = new ArrayList<String>();
		for(int i = 0; i < n ; i ++){
			studentinfo.add(sc.next());
		}
		System.out.println(UserMainCode.highestScorer(studentinfo));
	}

}
