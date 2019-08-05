/**
 * 
 */
package weekendassigment;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author vramaprasad
 *
 */
public class CollectCards {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		TreeMap<Character, Integer> cards = new TreeMap<Character, Integer>();
		char key = ' ';
		int value = 0;
		while(!cards.containsKey('a') || !cards.containsKey('b') || !cards.containsKey('c') || !cards.containsKey('d')){
			key = sc.next().charAt(0);
			value = sc.nextInt();
			if(!cards.containsKey(key))
				cards.put(key, value);			
		}
		
		for(Map.Entry<Character, Integer> entry : cards.entrySet()){
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

}
