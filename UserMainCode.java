/**
 * 
 */
package weekendassigment;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author vramaprasad
 *
 */
public class UserMainCode {

	/**
	 * @param args
	 */
	//StringModify
	static HashMap <Character, Boolean> countsort = new HashMap <Character, Boolean> ();
	
	static private void countSortInput(String input){
		int index = 0;
		int stringlength = input.length();
		
		for(index = 0; index < stringlength; index ++){
			//Key is character from input string two, value is true to denote it is present
			countsort.put(input.charAt(index), true);
		}
	}
	static public String replacePlus(String inputone, String inputtwo){
		//Passing input string two to a private function countSortInput()
		countSortInput(inputtwo);
		
		String modifiedstring = "";
		int index = 0, inputonelength = inputone.length();
		char ch = ' ';
		
		//Iterating through input string one
		for(index = 0; index < inputonelength; index ++){
			ch = inputone.charAt(index);
			
			//Checking if hashmap contains the given character (not case-sensitive)
			if(!countsort.containsKey(Character.toLowerCase(ch))){
				//If not, append a plus to output string
				modifiedstring += "+";
			}
			else{
				//If present, append the character itself
				modifiedstring += ch;
			}
		}
		
		return modifiedstring;
	}
	
	
	//UniqueEvenSum
	static HashMap <Integer, Integer> map = new HashMap<Integer, Integer>();
	public static int addUniqueEven(int arr[]){
		int sum = 0;
		for(int element : arr){			
			if(!map.containsKey(element)){
				if(element % 2 == 0){
					sum += element;
					map.put(element, 0);	
				}
			}
		}
		return sum;
	}
	
	
	//StringOccurrences
	static String keyword = "";
	private static void findKeywordFromStringTwo(String input){
		int index = input.indexOf(' ');
		int keylength = 0;
		char ch = ' ';
		int inputlength = input.length();
		
		do{
			index ++;
			if(index < inputlength && (ch = input.charAt(index)) != ' '){
				keyword += ch;
			}
		}while(ch != ' ' && index < inputlength);
	}
	public static int countNoOfWords(String inputone, String inputtwo){
		findKeywordFromStringTwo(inputtwo);
		int fromIndex = -1, count = 0;
		do{
			fromIndex = inputone.indexOf(keyword, fromIndex+1);
			if(fromIndex != -1)
				count ++;
		}while(fromIndex != -1);
		return count;
	}
	
	//ArrayListManipulation
	public static ArrayList<Integer> generateOddEvenList (ArrayList<Integer> l1, ArrayList<Integer> l2){
		ArrayList<Integer> output = new ArrayList<Integer>();
		Iterator iter1 = l1.iterator();
		Iterator iter2 = l2.iterator();
		int size = l1.size();
		//1 2 3 4 5
		//6 7 8 9 10
		iter1.next();
		while(iter2.hasNext()){
				output.add((int)iter2.next());
			if(iter2.hasNext()){
				iter2.next();	
			}
			if(iter1.hasNext()){
				output.add((int)iter1.next());
			}
			if(iter1.hasNext()){
				iter1.next();	
			}	
		}
		for(int i : output)
			System.out.print(i+ " ");
		return output;
	}
	
	//MasteringHashmap
	public static int getAverageOfOdd(HashMap<Integer, Integer> hm){
		int count = 0, sum = 0;
		int temp = 0, val = 0;
		for(Map.Entry<Integer, Integer> entry : hm.entrySet()){
			temp = entry.getKey();
			System.out.println("temp is: "+temp);
			if(temp % 2 != 0){
				val = entry.getValue();
				System.out.println("val = "+val);
				sum += val;
				System.out.println("sum = "+sum);
				count ++;
			}
			sum /= count;
		}
		return sum;
	}
	
	//Anagrams
	public static int getAnagram(String inputone, String inputtwo){
		char arrayone[] = inputone.toCharArray();
		char arraytwo[] = inputtwo.toCharArray();
		
		Arrays.sort(arrayone);
		Arrays.sort(arraytwo);
//		
//		for(char i : arrayone){
//			
//		}
//		inputone = arrayone.toString();
//		inputtwo = arraytwo.toString();
//		
		//System.out.println(inputone + " "+inputtwo);
		if(Arrays.equals(arrayone, arraytwo))
			return 1;
		return 0;
	}
	
	//Retirement
	public static ArrayList<String> retirementEmploymentList(HashMap<String, String> hm){
		ArrayList<String> eligibleemployees = new ArrayList<String>();
		for(Map.Entry<String, String> entry : hm.entrySet()){
			String dob = entry.getValue();
			String[] dobsplit = dob.split("/");
			int dobint = Integer.valueOf(dobsplit[2]);
			if(dobint <= 1953)
				eligibleemployees.add(entry.getKey());
		}
		
		Collections.sort(eligibleemployees);
		return eligibleemployees;
	}
	
	//KaprekarNumber
	public static int getKaprekarNumber(int inputnum){
		String inputstring = String.valueOf(inputnum);
		int numlength = inputstring.length();
		int square = inputnum * inputnum;
		int divnum = (int) Math.pow(10, numlength);
		
		int right = square % divnum;
		int left = square / divnum;
		
		if(left + right == inputnum)
			return 1;
		return -1;
		
	}
	
	//Vowels
	public static String storeMaxVowelWord(String input){
		String[] wordArray = input.split(" ");
		int wordlength = 0;
		char ch = ' ';
		int count = 0, max = 0;
		String maxword = "No vowels";
		for(String word : wordArray){
			wordlength = word.length();
			count = 0;
			for(int i = 0; i < wordlength; i ++){
				ch = word.charAt(i);
				if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
					count ++;
				}
			}
			if(count > max){
				max = count;
				maxword = word;
			}
		}
		return maxword;
	}
	
	//ArrayListSetOperations
	private static ArrayList <Integer> output = new ArrayList<Integer>();
	private static TreeSet<Integer> ts = new TreeSet<Integer>();
	
	private static ArrayList<Integer> setUnion(ArrayList <Integer> l1, ArrayList <Integer> l2){
		System.out.println("+");
		Iterator iter1 = l1.iterator();
		Iterator iter2 = l2.iterator();
		int val = 0;
		
		while(iter1.hasNext()){
			ts.add((int)iter1.next());
			ts.add((int)iter2.next());
		}
		ArrayList<Integer> output = new ArrayList <Integer>();
		Iterator iterts = ts.iterator();
		while(iterts.hasNext()){
			val = (int)iterts.next();
			System.out.println(val);
			output.add(val);
		}
		return output;
	}
	private static ArrayList<Integer> setIntersection(ArrayList <Integer> l1, ArrayList <Integer> l2){
		HashMap <Integer, Integer> hm = new HashMap <Integer, Integer>();
		Iterator iter1 = l1.iterator();
		Iterator iter2 = l2.iterator();
		int val;
		while(iter1.hasNext()){
			val = (int)iter1.next();
			if(!hm.containsKey(val))
				hm.put(val, 0);
			else
				hm.put(val, hm.get(val)+1);
		}
		while(iter2.hasNext()){
			val = (int)iter2.next();
			if(hm.containsKey(val)){
				output.add(val);
				hm.put(val, hm.get(val) - 1);
			}
		}
		return output;
	}
	private static ArrayList<Integer> setDifference(ArrayList <Integer> l1, ArrayList <Integer> l2){
		HashMap <Integer, Integer> hm = new HashMap <Integer, Integer>();
		Iterator iter1 = l1.iterator();
		Iterator iter2 = l2.iterator();
		int val;
		while(iter1.hasNext()){
			val = (int)iter1.next();
			if(!hm.containsKey(val))
				hm.put(val, 1);
			else
				hm.put(val, hm.get(val)+1);
		}
		while(iter2.hasNext()){
			val = (int)iter2.next();
			if(hm.containsKey(val)){
				hm.put(val, hm.get(val) - 1);
			}
		}
		
		int entrykey = 0, entryval = 0;
		for(Map.Entry<Integer, Integer> entry : hm.entrySet()){
			entrykey = entry.getKey();
			entryval = entry.getValue();
			while(entryval != 0){
				output.add(entrykey);
				entryval --;
			}
		}
		return output;
	}
	public static ArrayList<Integer> performSetOperations (ArrayList <Integer> l1, ArrayList <Integer> l2, char operation){
		
		if(operation == '+')
			return setUnion(l1, l2);
		else if(operation == '*')
			return setIntersection(l1, l2);
		else
			return setDifference(l1, l2);
	}
	
	//MaxScorer
	public static String highestScorer(ArrayList<String> studentinfo){
		String maxname = "";
		int maxmarks = 0;
		
		Iterator iter = studentinfo.iterator();
		while(iter.hasNext()){
			String[] details = ((String)iter.next()).split("-");
			int avg = Integer.valueOf(details[1]) + Integer.valueOf(details[2]) + Integer.valueOf(details[3]);
			avg /= 3;
			if(avg > maxmarks){
				maxmarks = avg;
				maxname = details[0];
			}			
		}
		return maxname;		
	}
	
	//MaxVowels
	public static String getWordWithMaxVowels(String input){
		String[] wordArray = input.split(" ");
		int wordlength = 0;
		char ch = ' ';
		int count = 0, max = 0;
		String maxword = "No vowels";
		for(String word : wordArray){
			wordlength = word.length();
			count = 0;
			for(int i = 0; i < wordlength; i ++){
				ch = word.charAt(i);
				if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
					count ++;
				}
			}
			if(count > max){
				max = count;
				maxword = word;
			}
		}
		return maxword;
	}
	
	//AdjacentSwaps
	public static String swapPairs(String input){
		String output = "";
		int length = input.length();
		int i = 0;
		for(i = 1; i < length; i += 2){
			output = output + input.charAt(i) + input.charAt(i - 1);
		}
		if(i == length)
			output = output + input.charAt(i - 1);
		return output;
	}
	
	//Password
	public static boolean validatePassword(String input){
		String PASSWORD_PATTERN = "((?=.*\\d)(?=.*[a-zA-Z])(?=.*[@#$%]).{8,})";
		
		Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
		Matcher matcher = pattern.matcher(input);
		return matcher.matches();
	}
	
	//EmployeeBonus
	public static TreeMap<Integer, Integer> calculateRevisedSalary(HashMap<Integer, String> dobhm, HashMap<Integer, Integer> salaryhm){
		TreeMap<Integer, Integer> tm = new TreeMap<Integer, Integer>();
		int eid = 0, sal = 0;
		int date = 0, month = 0, year = 0;
		String dob = "";
		for(Map.Entry<Integer, Integer> entry : salaryhm.entrySet()){
			eid = entry.getKey();
			sal = entry.getValue();
			if(sal < 5000)
				tm.put(eid, -100);
			else{
				dob = dobhm.get(eid);
				String dobarray[] = dob.split("-");
				date = Integer.valueOf(dobarray[0]);
				month = Integer.valueOf(dobarray[1]);
				year = Integer.valueOf(dobarray[2]);
				
				/* Employee younger than 25 or older than 60 => bonus = -200*/
				if(year > 1989 || (year == 1989 && month >= 9) || year < 1954 || (year == 1954 && month < 9)){
					tm.put(eid, -200);
				}
				
				else if ((year < 1989 || (year == 1989 && month < 9)) && (year > 1984 || (year == 1984 && month >= 9)))
					tm.put(eid, (int)(sal + 0.20 * sal));
				else if((year < 1984 || (year == 1984 && month < 9)) && (year >1954 || (year == 1954 && month >= 9)))
					tm.put(eid, (int)(sal + 0.30 * sal));			
			}			
		}
		return tm;
	}
	
	//DateFormat
	public static String findOldDate(String dob1, String dob2){
		String newdob = "";
		String dob1array[] = dob1.split("-");
		String dob2array[] = dob2.split("-");
		String maxdobarray[] = new String[3];
		
		int year1 = Integer.valueOf(dob1array[2]);
		int year2 = Integer.valueOf(dob2array[2]);		

		int month1 = Integer.valueOf(dob1array[1]);
		int month2 = Integer.valueOf(dob2array[1]);

		int date1 = Integer.valueOf(dob1array[0]);
		int date2 = Integer.valueOf(dob2array[0]);
		
		if(year1 < year2)
			maxdobarray = dob1array;
		else if(year1 == year2)
			maxdobarray = dob2array;
		else{
			if(month1 < month2)
				maxdobarray = dob1array;
			else if(month1 > month2)
				maxdobarray = dob2array;
			else{
				if(date1 < date2)
					maxdobarray = dob1array;
				else
					maxdobarray = dob2array;
			}
		}
		newdob = maxdobarray[1] + "/" + maxdobarray[0] + "/"+ maxdobarray[2];
		return newdob;
	}
	
	//MaximumDifference
	public static int findMaxDistance(int[] array){
		int maxdiff = Integer.MIN_VALUE, maxindex = -1, diff = 0;
		int size = array.length, num1 = 0, num2 = 0;
		for(int i = 1; i < size; i ++){
			num1 = array[i-1];
			num2 = array[i];
			diff = Math.abs(num1 - num2);
			if(diff > maxdiff){
				maxdiff = diff;
				if(num1 > num2)
					maxindex = i-1;
				else
					maxindex = i;
			}
		}
		return maxindex;
	}
	
	//PANCard
	public static int validatePAN(String input){
		String regex = "[A-Z]{3}\\d{4}[A-Z]";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);
		System.out.println(matcher.matches());
		return 2;
	}
	
	//LastLetters
	public static String getLastLetter(String input){
		String output = "", temp = "";
		input = input.toUpperCase();
		String inputarray[] = input.split(" ");
		int i = 0, inputarraylength = inputarray.length;
		for(i = 0; i < inputarraylength - 1; i ++){
			temp = inputarray[i];
			output += temp.charAt(temp.length() - 1) + "$";
		}
		temp = inputarray[i];
		output += temp.charAt(temp.length() - 1);
		return output;
	}
	
	//LargestKeyInHashmap
	public static String getMaxKeyValue(HashMap<Integer, String> hm){
		int max = Integer.MIN_VALUE;
		int entrykey = 0;
		String output = "";
		for(Map.Entry<Integer, String> entry : hm.entrySet()){
			entrykey = entry.getKey();
			if(entrykey>max){
				max=entrykey;
				output = entry.getValue();
			}
		}
		return output;
	}
	
	//DayOfTheWeek
	public static String getDay(String inputdate){		
		String daysOfTheWeek[] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		int dayNum = 0;
		try {			
			Date date = new SimpleDateFormat("M-dd-yyyy").parse(inputdate);			
			Calendar c = Calendar.getInstance();
			c.setTime(date);
			dayNum = c.get(Calendar.DAY_OF_WEEK);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(".. "+dayNum);
		return daysOfTheWeek[dayNum-1];
	}
	
	//HashmapToArraylist
	public static ArrayList<String> getName(HashMap<Integer, String> hm){
		ArrayList<String> output = new ArrayList<String>();
		String name;
		for(Map.Entry<Integer, String> entry: hm.entrySet()){
			name = entry.getValue();
			if(Pattern.matches("[a-z]\\w{0,}\\d\\w{0,}[A-Z]", name))
				output.add(name);			
		}
		return output;
	}
	
	//DateFormatConversion	
	public static String convertDateFormat(String inputdate){
		String outputdate = "";
		String datearray[] = inputdate.split("/");
		outputdate = datearray[0] + "-" + datearray[1] + "-";
		String year = datearray[2];
		int yearlength = year.length();
		outputdate += "" + year.charAt(yearlength-2) + year.charAt(yearlength - 1);
		return outputdate;
	}
	
	//StringProcessingZigZag
	static int numDaysInMonth[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	private static boolean isLeapYear(int year){
		if(year % 400 == 0)
			return true;
		if(year % 100 == 0)
			return false;
		if(year % 4 == 0)
			return true;
		return false;
	}
	public static int getNumDays(String dateinput){
		String datearray[] = dateinput.split("-");
		int month = Integer.valueOf(datearray[1]);
		int year = Integer.valueOf(datearray[2]);
		if(month == 2){
			if(isLeapYear(year))
				return 29;
			else
				return 28;
		}
		else
			return numDaysInMonth[month - 1];
	}
	
	//AgeForVoting
	public static String getAge(String inputdate){
		String datearray[] = inputdate.split("/");
		int year = Integer.valueOf(datearray[2]);
		if(year <= 1996)
			return "eligible";
		else
			return "ineligible";
	}
}

