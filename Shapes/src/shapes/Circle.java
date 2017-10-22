package shapes;
/**
 * @author Jaron Huang 
 * Created 10/18/17
 * Lab 2.1 Shapes 
 */

public class Circle implements Shape
{
	private int radius;
	private static double pi = 3.14;
	
	/**
	 * Constructor method
	 * 
	 * @param radius
	 */
	public Circle(int radius)
	{
		this.radius = radius;
	}
	
	/**
	 * Calculates the area of the circle
	 * 
	 * @param radius
	 */
	public double calculateArea()
	{
		return (pi*radius*radius);
	}
	
	/**
	 * Calculates the perimeter of the circle
	 * 
	 * @param radius
	 */
	public double calculatePerimeter()
	{
		return (2*radius*pi);
	}
	
	/**
	 * Returns a string with the area and circumference 
	 */
	public String toString()
	{
		return "Circle Radius: " + radius + " Area: " + this.calculateArea() + " Circumference " + this.calculatePerimeter();
	}
}
