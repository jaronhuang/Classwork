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
	private int height;
	
	/**
	 * Constructor method
	 * 
	 * @param base1
	 * @param base2
	 * @param side1
	 * @param side2
	 * @param height
	 */
	public Trapezoid (int base1, int base2, int side1, int side2, int height)
	{
		this.base1 = base1;
		this.base2 = base2;
		this.side1 = side1;
		this.side2 = side2;
		this.height = height;
	}
	
	public double calculateArea()
	{
		return (((base1 + base2) / 2) * height);
	}
	
	public double calculatePerimeter()
	{
		return base1 + base2 + side1 + side2;
	}
	
	public String toString()
	{
		return "Trapezoid Side Length: " + side + " Area: " + this.calculateArea() + " Perimeter: " + this.calculatePerimeter();
	}
}
