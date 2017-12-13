import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class removeDuplicates 
{
	public static void main(String[] args)
	{
		List<Integer> numList = new List<Integer>
	}
	
	public static List<Integer> removeDupes(List<Integer> nums)
	{
		for (int i = 0; i < nums.size() - 1; i++)
		{
			for (int j = i + 1; j < nums.size(); j++)
			{
				if (nums.get(i) == nums.get(j))
				{
					nums.remove(j);
				}
			}
		}
		return nums;
	}
}
