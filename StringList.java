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
public class StringList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<String> stringList = new ArrayList<String>();
		int choice = 0;
		while(choice != 5){
			System.out.println("1.Insert\n2.Search\n3.Delete\n4.Display\n5.Exit\nEnter choice: ");
			choice = sc.nextInt();
			switch(choice){
				case 1:
					System.out.print("\tEnter item to insert: ");
					stringList.add(sc.next());
					System.out.println("\tInsert success!");
					break;
					
				case 2:
					System.out.print("\tEnter item to search: ");
					String key = sc.next();
					boolean flag = false;
					for(String s : stringList){
						if(s.equals(key)){
							flag = true;
							System.out.println("Item found in list");
							break;
						}
					}
					if(!flag)
						System.out.println("Item not found in list");
					break;
					
				case 3:
					System.out.print("Enter item to delete: ");
					if(stringList.remove(sc.next()))
						System.out.println("Delete success!");
					else
						System.out.println("Item does not exist");
					break;
					
				case 4:
					System.out.println("The items in the list are: ");
					for(String s : stringList){
						System.out.println(s);
					}
					break;
					
				case 5:
				default:
					System.out.println("Goodbye!");
					break;
			}
		}
	}

}
