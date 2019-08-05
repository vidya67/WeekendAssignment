/**
 * 
 */
package weekendassigment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author vramaprasad
 *
 */
class Employee implements Comparable<Employee>{
	String firstName, LastName, phone, email;
	public Employee(){
		
	}
	public Employee(String firstName, String lastName, String phone, String email){
		setFirstName(firstName);
		setLastName(lastName);
		setPhone(phone);
		setEmail(email);
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public String getEmail() {
		return email;
	}
	public String getPhone() {
		return phone;
	}
	@Override
	public int compareTo(Employee e) {
		// TODO Auto-generated method stub
		return getFirstName().compareTo(e.getFirstName());
	}	
	
	public void display(){
		System.out.format("%-15s %-15s %-15s %-30s\n",getFirstName(),getLastName(),getPhone(),getEmail());
	}
}
public class EmployeeRegister {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of employees: ");
		int n = sc.nextInt();
		ArrayList<Employee> emplist = new ArrayList<Employee>();
		//Employee emp;
		for(int i = 0; i < n; i ++){
			System.out.println("Employee "+(i+1)+": ");
			sc.nextLine();
			System.out.print("\tFirst Name: ");
			String firstName = sc.nextLine();
			System.out.print("\tLast Name: ");
			String lastName = sc.nextLine();
			System.out.print("\tMobile Number: ");
			String phone = sc.next();
			System.out.print("\tEmail ID");
			String email = sc.next();
			
			emplist.add(new Employee(firstName, lastName, phone, email));
		}

		Collections.sort(emplist);
		
		System.out.format("%-15s %-15s %-15s %-30s\n","FirstName","LastName","Phone","Email");
		for(Employee emp : emplist)
			emp.display();
	}

}
