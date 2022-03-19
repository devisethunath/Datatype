
public class Stringmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Welcome";
		
//String lenght
		
		System.out.println(s.length());
		
//concatenation
		
		String S1= "Hello";
				
        String S2 = "World";
        
        System.out.println(S1. concat (" "+S2));
        
        
  //EQUALS
        String s3="welcome";
        String s4="WELCOME";
        

        System.out.println(s3. equals (s4));
        System.out.println(s3. equalsIgnoreCase (s4));
        
  //contains
        System.out.println(s3.contains("yhggf"));
        
   //SUBSTRING     
        System.out.println(s4.substring(3,5)); //STARTING INDEX 0,12345 ENDING INDEX 1,2,3,4
        
    //REPLACE
        System.out.println(s4.replace('L', 'Z'));
        System.out.println(s4.replace("WEL", "SAT"));
        
	}

}
