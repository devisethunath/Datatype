
public class Multidimensionalarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[][]=new int [3][2];
		a[0][0]=10;
		a[0][1]=23;
		a[1][0]=63;
		a[1][1]=34;
		a[2][0]=87;
		a[2][1]=65;
		
		
		//CLASSIC FOR LOOP
		
		//for(int i=0;i<=2;i++)
		//{for(int j=0;j<=1;j++)
		//{System.out.print(a[i][j]+" ");
		//}
		//	System.out.println();
		
	//}

		
		//FOR EACH LOOP
		for (int i[]:a)
			
		{for(int j:i)
		{System.out.print(j+" ");
		}
		System.out.println();
		
}}}
