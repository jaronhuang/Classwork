import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class removeDuplicates 
{
	public static void main(String[] args)
	{
		ArrayList<Integer> numList = new ArrayList<Integer>();
		numList.add(1);
		numList.add(3);
		numList.add(1);
		numList.add(2);
		numList.add(2);
		
		removeDupes(numList);
		System.out.println(numList);
	}
	
	public static void removeDupes(List<Integer> nums)
	{
		Collections.sort(nums);
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
	}
}
