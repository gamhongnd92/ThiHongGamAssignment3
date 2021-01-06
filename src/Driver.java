
public class Driver {

	public static void main(String[] args) throws InvalidCGPAException, InvalidNameException {
		
		//call undergraduate student class and throw exception
		try {
			UndergradStudent unGrad = new UndergradStudent(111,"Gam1",3.2);
							
			System.out.println("Undergraduate Student has id: "+ unGrad.getId()+", name: "+
					unGrad.getName()+", CGPA: "+ unGrad.getGpa()+ ", tuition: "+ unGrad.getTuition());
		
		}
		
		catch(InvalidNameException exp)
		{
			System.out.println("Undergraduate "+ exp.getMessage());
		}
		
		catch(InvalidCGPAException exp)
		{
			System.out.println("Undergraduate "+exp.getMessage());
		}
		
		
		
		//call graduate student class and throw exception
		try {
			GradeStudent grad = new GradeStudent(222,"Hoa",2.8);
						
			System.out.println("Graduate Student has id: "+ grad.getId()+", name: "+
					grad.getName()+", CGPA: "+ grad.getGpa()+ ", tuition: "+ grad.getTuition());
		}
		catch(InvalidNameException exp)
		{
			System.out.println("Graduate "+exp.getMessage());
		}
		
		catch(InvalidCGPAException exp)
		{
			System.out.println("Graduate "+exp.getMessage());
		}
		
		//call student at large class and throw exception
		try {
			
			StudentAtLarge atLarg = new StudentAtLarge(333,"Nhi",-4.0);
			System.out.println("Student at large has id: "+ atLarg.getId()+", name: "+
					atLarg.getName()+", CGPA: "+ atLarg.getGpa()+ ", tuition: "+ atLarg.getTuition());
		}
		catch(InvalidNameException exp)
		{
			System.out.println("StudentAtLarge: "+exp.getMessage());
		}
		
		catch(InvalidCGPAException exp)
		{
			System.out.println("StudentAtLarge: "+exp.getMessage());
		}
		
		
//		
//		Student[] newStu = new Student[3];
//		
//		try {
//			
//			newStu[0] = new UndergradStudent(111,"Gam1",3.2); 
//			newStu[1] = new GradeStudent(222,"Hoa",2.8);
//			newStu[2] = new StudentAtLarge(333,"Nhi",-4.0);
//			
//		}
//		catch(InvalidNameException exp)
//		{
//			System.out.println(exp.getMessage());	
//		}
//		
//		catch(InvalidCGPAException exp)
//		{
//			System.out.println(exp.getMessage());
//		}
//		
//		
//		for(int i = 0; i<newStu.length;i++)
//		{
//			if(newStu[i]!=null)
//			{
//				System.out.println("Student has id: "+ newStu[i].getId()+", name: "+
//						newStu[i].getName()+", CGPA: "+ newStu[i].getGpa());
//			}					
//		}		
	}

}
