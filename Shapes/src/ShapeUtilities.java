import java.awt.Shape;
import java.util.Random;
public class ShapeUtilities implements Shapes
{
	public static Shapes getRandomShape()
	{
		Random r = new Random();
		int x = r.nextInt(100);
		switch(x)
		{
			case 0 : 
				return new Circle(r.nextInt(100)+1);
			case 1 : 
				return new Rectangle(r.nextInt(100)+1, r.nextInt(100)+1);
			default:
				return new Circle(10);
		}
	}
	
	public static double sumPeri(Shape[] shapeArr)
	{
		double sum = 0;
		for (int i = 0; i < shapeArr.length; i++)
		{
			sum += shapeArr[i].perimeter();
 		}
		return sum;
	}
	
	public static double sumArea(Shape[] shapeArr)
	{
		double sum = 0;
		for (int i = 0; i < shapeArr.length; i++)
		{
			sum += shapeArr[i].area();
		}
		return sum;
	}
}
