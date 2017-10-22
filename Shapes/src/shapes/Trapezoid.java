package shapes;
/**
 * @author Jaron Huang 
 * Created 10/18/17
 * Lab 2.1 Shapes 
 */

public class Trapezoid implements Shape
{
	private int base1;
	private int base2;
	private int side1;
	private int side2;
	
	/**
	 * Constructor method
	 * 
	 * @param base1
	 * @param base2
	 * @param side1
	 * @param side2
	 */
	public Trapezoid (int base1, int base2, int side1, int side2)
	{
		this.base1 = base1;
		this.base2 = base2;
		this.side1 = side1;
		this.side2 = side2;
	}
	
	/**
	 * Calculates the area of the Trapezoid
	 */
	public double calculateArea()
	{
		double height = Math.sqrt((side1 * side1) - (Math.abs(base1 - base2)/2) * (Math.abs(base1 - base2)/2));
		return (((base1 + base2) / 2) * height);
	}
	
	/**
	 * Calculates the perimeter of the Trapezoid
	 */
	public double calculatePerimeter()
	{
		return base1 + base2 + side1 + side2;
	}
	
	/**
	 * Returns a string with the area and perimeter
	 */
	public String toString()
	{
		return "Trapezoid Side Length: " + side1 + ", " + side2 + "Base Length: " + base1 + ", " + base2  + " Area: " + this.calculateArea() + " Perimeter: " + this.calculatePerimeter();
	}
}
