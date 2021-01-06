
public class StudentAtLarge extends Student {

	
	public StudentAtLarge(int id, String n, double gpa)
			throws InvalidNameException, InvalidCGPAException{
		super(id, n, gpa);
		
		// throw invalid CGPA exception
		if(cGpa<0 || cGpa>4)
		{
			throw new InvalidCGPAException();
		}
		setTuition();
	}
	@Override
	public void setTuition() {
		tuitionFee = 2000;
		
	}
	

}
