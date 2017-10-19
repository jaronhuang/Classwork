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
	
	public double calculateArea()
	{
		return ((3 * Math.sqrt(3) / 2) * side);
	}
	
	public double calculatePerimeter()
	{
		return 6 * side;
	}
}
