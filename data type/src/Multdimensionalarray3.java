
public class Multdimensionalarray3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Object a[][]= {{89,"devi"},{5.6,'g'},{true,87}};
		
		for (Object i[]:a)
		{for(Object j:i)
		{System.out.print(j+" ");
		}
			
System.out.println();
	}

Object array[][]= {{1," Harry Potter and the Philosopher's Stone      ",2001},
				  {2," Harry Potter and the Chamber of Secrets       ",2002},
				  {3," Harry Potter and the Prisoner of Azkaban      ",2004},
				  {4," Harry Potter and the Goblet of Fire           ",2005},
			      {5," Harry Potter and the Order of the Phoenix     ",2007},
				  {6," Harry Potter and the Half-Blood Prince        ",2009},
				  {7," Harry Potter and the Deathly Hallows – Part 1 ",2010},
				  {8," Harry Potter and the Deathly Hallows – Part 2 ",2011}};


           for(int i=0;i<=7;i++)
           { for(int j=0;j<=2;j++)
        	   
        	   System.out.print(array[i][j]+"");
                System.out.println();
           }
		  
		
}}



