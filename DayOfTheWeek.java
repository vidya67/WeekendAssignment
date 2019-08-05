/**
 * 
 */
package weekendassigment;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * @author vramaprasad
 *
 */
public class DayOfTheWeek {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);	
		String inputdate = sc.next();
		
		System.out.println(UserMainCode.getDay(inputdate));
		

	}

}
