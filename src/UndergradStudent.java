
public class UndergradStudent extends Student {

	
	public UndergradStudent(int id, String n, double gpa) 
	throws InvalidCGPAException, InvalidNameException {
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
		tuitionFee = 4000;
		
	}
	

}
