	/**
 * 
 */
package weekendassigment;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

/**
 * @author vramaprasad
 *
 */
public class ProfitLoss {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double numproducts = 0, costperdozen = 0, sellingpriceofone = 0;
		System.out.print("Enter the number of dozens of toys purchased: ");
		numproducts = sc.nextDouble();
		System.out.print("Enter price per dozen: ");
		costperdozen = sc.nextDouble();
		System.out.print("Enter selling price of one toy: ");
		sellingpriceofone = sc.nextDouble();
		
		double costofone = costperdozen / 12;
		double gain = sellingpriceofone - costofone;
		double profit = (gain * 100) / costofone;
		System.out.println("Sam's profit percentage is: "+profit+"%");
	}

}
