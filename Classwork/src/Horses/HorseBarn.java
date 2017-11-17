package Horses;

public class HorseBarn 
{
	private Horse[] spaces;
	public HorseBarn(Horse[] horses2)
	{
		this.spaces = horses2;
	}

	public int findHorseSpace(String name) 
	{
		for (int i = 0; i < this.spaces.length; i++) 
		{
			if (this.spaces[i]!=null && name.equals(this.spaces[i].getName())) 
			{
				return i;
			}
		}
		return -1;
	}
	
	public void consolidate()
	{
		Horse[] newSpaces = new Horse[this.spaces.length];
		int nextSpot = 0;
		for (Horse nextHorse : this.spaces) 
		{
			if (nextHorse != null) 
			{
				newSpaces[nextSpot] = nextHorse;
				nextSpot++;
			}
		}
		this.spaces = newSpaces;
	}
	
	public String toString()
	{
		String printout = "";
		for(int i = 0; i < this.spaces.length; i++)
		{
			if (this.spaces[i] != null)
			{
				printout += "[" + this.spaces[i].getName() + "] ";
			}
			else
			{
				printout += "[null] ";
			}
		}
		return printout;
	}
}
