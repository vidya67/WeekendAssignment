/**
 * 
 */
package weekendassigment;

import java.util.Scanner;

/**
 * @author vramaprasad
 *
 */
class Product{
	private long id;
	private String productName;
	private String supplierName;
	
	public void setId(long id) {
		this.id = id;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	public long getId() {
		return id;
	}
	public String getProductName() {
		return productName;
	}
	public String getSupplierName() {
		return supplierName;
	}
	public Product(){
		
	}
	public Product(long id, String productName){
		setId(id);
		setProductName(productName);
		setSupplierName("Nivas");
	}
	public Product(long id, String productName, String supplierName){
		setId(id);
		setProductName(productName);
		setSupplierName(supplierName);
	}
	public void displayDetails(){
		System.out.println("ID: "+getId());
		System.out.println("Product Name: "+getProductName());
		System.out.println("Supplier Name: "+getSupplierName());
	}
}
public class ConstructorOverloading {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ID: ");
		int id = sc.nextInt();
		
		System.out.println("Enter Product Name: ");
		String productName = sc.next();
		
		System.out.println("Is the product supplied by Nivas Suppliers? Type Yes or No");
		String answer = sc.next();
		answer = answer.toLowerCase();
		
		Product newobj;
		if(answer.equals("yes"))
			newobj = new Product(id, productName);
		else{
			System.out.println("Enter Supplier Name: ");
			String supplierName = sc.next();
			newobj = new Product(id, productName, supplierName);			
		}
		newobj.displayDetails();
	}

}
