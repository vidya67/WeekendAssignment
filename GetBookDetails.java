/**
 * 
 */
package weekendassigment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author vramaprasad
 *
 */
@SuppressWarnings("rawtypes")
class Author implements Comparable{
	private String name, email, gender;
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	public Author(){
		
	}
	public Author(String name, String email, String gender){
		setName(name);
		setEmail(email);
		setGender(gender);
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getGender() {
		return gender;
	}
}
class Book {
	private String name;
	private List<Author> authorList;
	private double price;
	private int qtyInStock = 0;
	/**
	 * @param args
	 */
	public Book(){
		
	}
	public Book(String name, List<Author> authorList, double price){
		setName(name);
		setAuthorList(authorList);
		setPrice(price);
	}
	public Book(String name, List<Author> authorList, double price, int qtyStock){
		this(name, authorList, price);
		setQtyInStock(qtyStock);
		
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAuthorList(List<Author> authorList) {
		this.authorList = authorList;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}
	public String getName() {
		return name;
	}
	public List<Author> getAuthorList() {
		return authorList;
	}
	public double getPrice() {
		return price;
	}
	public int getQtyInStock() {
		return qtyInStock;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String output = "";
		output += getName() + " authored by ";
		for(Author au : authorList){
			output += au.getName() + " ";
		output += "costs Rs."+getPrice()+": ";
		if(getQtyInStock() == 0)
			output += "Not Available\n";
		else
			output += "Available\n";
		
		}		
		return output;
		
	}
}
public class GetBookDetails{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Book yourBook;
		
		System.out.println("Enter book name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter number of authors: ");
		int numAuthors = sc.nextInt();
		
		ArrayList<Author> authorList = new ArrayList<Author>();
		for(int i = 0; i < numAuthors; i ++){
			System.out.println("Author "+(i+1));
			sc.nextLine();
			System.out.println("\tEnter name of Author: ");
			String aname = sc.nextLine();
			
			System.out.println("\tEnter email ID: ");
			String aemailID = sc.next();
			
			System.out.println("\tEnter Gender: (Male/Female)");
			String agender = sc.next();
			authorList.add(new Author(aname, aemailID, agender));			
		}
		
		System.out.println("Enter book price: ");
		double price = sc.nextDouble();
		
		System.out.println("Is the book available now? (Yes/No): ");
		String answer = sc.next();
		answer = answer.toLowerCase();
		System.out.println("Answer is: "+answer);
		if(answer.equals("yes")){
			System.out.println("Enter number of copies: ");
			int qtyStock = sc.nextInt();
			yourBook = new Book(name, authorList, price, qtyStock);
		}
		else{
			yourBook = new Book(name, authorList, price);
		}
		
		System.out.println(yourBook.toString());
		
	}
}

