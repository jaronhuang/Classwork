package shapes;
/**
 * @author Jaron Huang 
 * Created 10/18/17
 * Lab 2.1 Shapes 
 */

public class Square extends Rectangle
{
	int side;
	
	/**
	 * Constructor method
	 * 
	 * @param side
	 */
	public Square(int side)
	{
		super(side,side);
		this.side = side;
	}
	
	public String toString()
	{
		return "Square Side Length: " + side + " Area: " + this.calculateArea() + " Perimeter: " + this.calculatePerimeter();
	}
}
