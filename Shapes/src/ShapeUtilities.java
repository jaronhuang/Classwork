import java.util.Random;
public class ShapeUtilities implements Shapes
{
	public static Shapes getRandomShape()
	{
		Random r = new Random();
		int x = r.nextInt(3);
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
}
