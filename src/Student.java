
public abstract class Student {
	public int idNumber;
	public String name;
	public double cGpa;
	public double tuitionFee;
	
	public Student(int id, String n, double gpa) throws InvalidNameException
	{
		idNumber = id;
		name = n;
		cGpa = gpa;
		
	// throw invalid name exception
		for(int i=0; i<name.length();i++)
		{
			if(Character.isDigit(name.charAt(i))) 
			{
				throw new InvalidNameException();
			}
			
		}
		
	}
	public void setId(int id)
	{
		idNumber = id;
	}
	public void setName(String n)
	{
		name = n;
	}
	public void setGpa(double gpa) {
		cGpa = gpa;
	}
	public int getId()
	{
		return idNumber;
	}
	public String getName()
	{
		return name;
	}
	public double getGpa()
	{
		return cGpa;
	}
	public abstract void setTuition();
	public double getTuition() {
		return tuitionFee;
	}

}
