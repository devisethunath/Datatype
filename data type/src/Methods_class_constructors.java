
public class Methods_class_constructors {

	int student_id;
	String student_name;
	char grade;
	
	
	void display()
	{
		System.out.println(student_id);
		System.out.println(student_name);
		System.out.println(grade);
		
	}
	   //2nd way-Through methods 
	    void getvalues(int id,String name,char stgrade)
	    {
	    	student_id=id;
	    	student_name=name;
	    	grade=stgrade;
	    	
	    }
	    //3RD method using Constructors
	    
	    Methods_class_constructors(int id,String name,char stgrade)
	
	    {
	    	student_id=id;
	    	student_name=name;
	    	grade=stgrade;
	    	
	    }
	
	
	
	
	public static void main(String[] args) {
		
		
		//First method through referenced variable
		
		// Methods_class_constructors obj= new  Methods_class_constructors ();
		/* obj.student_id=100;
		 obj.student_name="Tom";
		 obj.grade='A';
		 
		 obj.display();*/
		 
		 
		 
		 
		 //second way through methods
		 
		// obj.getvalues(100, "Aditya", 'B');
		// obj.display();
		 
		
		//3rd way thru constructors
		Methods_class_constructors obj=new Methods_class_constructors(100,"Tom",'C');
		obj.display();
		 
		
		

	}

}
