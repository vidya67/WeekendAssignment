/**
 * 
 */
package weekendassigment;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * @author vramaprasad
 *
 */
public class CollectAllCards {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Character, ArrayList<Integer>> tm = new TreeMap<Character, ArrayList<Integer>>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of cards: ");
		int n = sc.nextInt();
		
		char symbol = ' ';
		int value = 0;
		for(int i = 0; i < n; i ++){
			System.out.println("Card "+(i+1));
			symbol = sc.next().charAt(0);
			value = sc.nextInt();
			ArrayList<Integer> temp = new ArrayList<Integer>();
			if(tm.containsKey(symbol)){
				 temp = tm.get(symbol);
			}
			else
				temp = new ArrayList<Integer>();
			temp.add(value);
			tm.put(symbol, temp);
		}
		
		System.out.println("Distinct Elements are: ");
		for(Map.Entry<Character, ArrayList<Integer>> entry : tm.entrySet()){			
			System.out.print(entry.getKey() + " ");
		}		
		System.out.println(" ");
		ArrayList<Integer> valueList = new ArrayList<Integer>();
		int sum = 0;
		for(Map.Entry<Character, ArrayList<Integer>> entry : tm.entrySet()){
			symbol = entry.getKey();
			System.out.println("\nCards in "+ symbol + " symbol ");
			valueList = entry.getValue();
			sum = 0;
			for(int val : valueList){
				System.out.println(symbol + " " + val);
				sum += val;
				
			}
			System.out.println("Number of cards: "+valueList.size());
			System.out.println("Sum of numbers: "+sum);
		}
	}
}
