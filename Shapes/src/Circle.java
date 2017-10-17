
public class Circle implements Shapes
{
	private static double pi = 3.14;
	private double radius;
	public Circle (double radius)
	{
		this.radius = radius;
	}
	public double perimeter()
	{
		return (2*radius*pi);
	}
	public double area()
	{
		return (pi*radius*radius);
	}
}
