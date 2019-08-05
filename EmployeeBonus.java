/**
 * 
 */
package weekendassigment;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * @author vramaprasad
 *
 */
public class EmployeeBonus {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();		
		HashMap<Integer, String> dobhm = new HashMap<Integer, String>();
		HashMap<Integer, Integer> salaryhm = new HashMap<Integer, Integer>();
		int i = 0, id = 0;
		for(i = 0; i < n; i ++){
			id = sc.nextInt();
			dobhm.put(id,  sc.next());
			salaryhm.put(id, sc.nextInt());
		}			
		TreeMap<Integer, Integer> tm = new TreeMap<Integer, Integer>();
		tm = UserMainCode.calculateRevisedSalary(dobhm, salaryhm);
		for(Map.Entry<Integer, Integer> entry : tm.entrySet()){
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
	}

}
