package shapes;
import java.lang.Math;
/**
 * @author Jaron Huang 
 * Created 10/18/17
 * Lab 2.1 Shapes 
 */

public class Hexagon implements Shape
{
	private int side;
	
	/**
	 * Constructor method
	 * 
	 * @param side
	 */
	public Hexagon (int side)
	{
		this.side = side;
	}
	
	/**
	 * Calculates the area of the Hexagon
	 */
	public double calculateArea()
	{
		return ((3 * Math.sqrt(3) / 2) * side);
	}
	
	/**
	 * Calculates the perimeter of the Hexagon
	 */
	public double calculatePerimeter()
	{
		return 6 * side;
	}
	
	/**
	 * Returns a string with the area and perimeter
	 */
	public String toString()
	{
		return "Hexagon Side Length: " + side + " Area: " + this.calculateArea() + " Perimeter: " + this.calculatePerimeter();
	}
}
