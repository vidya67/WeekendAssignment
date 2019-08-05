/**
 * 
 */
package weekendassigment;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author vramaprasad
 *
 */
class Box{
	private double length, width, height;
	private double volume;
	public Box(){
		
	}
	public Box(double length, double width, double height){
		setLength(length);
		setWidth(width);
		setHeight(height);
		setVolume();
	}
	public void setLength(double length) {
		this.length = length;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getLength() {
		return length;
	}
	public double getWidth() {
		return width;
	}
	public double getHeight() {
		return height;
	}
	public void setVolume() {
		this.volume = getLength() * getWidth() * getHeight();
	}
	public double getVolume() {
		return volume;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(volume);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Box other = (Box) obj;
		if (Double.doubleToLongBits(volume) != Double.doubleToLongBits(other.volume))
			return false;
		return true;
	}	
}
public class BoxSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Set<Box> boxSet = new HashSet<Box>(); 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of boxes: ");
		int n = sc.nextInt();
		for(int i = 0; i < n; i++){
			System.out.println("Box "+(i+1));
			System.out.print("\tLength: ");
			double length = sc.nextDouble();
			System.out.print("\tWidth: ");
			double width = sc.nextDouble();
			System.out.print("\tHeight");
			double height = sc.nextDouble();
			
			//boxSet.
			boxSet.add(new Box(length, width, height));
		}
		System.out.println("Unique boxes in the set are: ");
		for(Box b : boxSet){
			System.out.println("Length = "+b.getLength()+", Width "+b.getWidth()+", Height = "+ b.getHeight()+", Volume = "+b.getVolume());
		}
	}

}
