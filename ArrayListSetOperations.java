/**
 * 
 */
package weekendassigment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @author vramaprasad
 *
 */
public class ArrayListSetOperations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		ArrayList <Integer> l1 = new ArrayList<Integer>();
		ArrayList <Integer> l2 = new ArrayList<Integer>();
		
		for(int i = 0; i < size; i ++){
			l1.add(sc.nextInt());
		}
		for(int i = 0; i < size; i ++){
			l2.add(sc.nextInt());
		}
		
		char setoperation = sc.next().charAt(0);
		ArrayList <Integer> output = UserMainCode.performSetOperations(l1, l2, setoperation);
		Iterator iter = output.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
	}

}
