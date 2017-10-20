
public abstract class Person 
{
	private String firstName;
	private String familyName;
	private int age;
	
	public Person(String firstName, String familyName, int age)
	{
		this.firstName = firstName;
		this.familyName = familyName;
		this.age = age;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public String getFamilyName()
	{
		return familyName;
	}
	
	public int getAge()
	{
		return age;
	}
	
	
	
}
