package in.neuron.main;

public class ThirdProgram {
	public static void main(String args []) {
		int n=15;
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				if( i==0 && j!=0 ||   
						i+j<=((n-1)/2)-1  && i<=(n-1)/2 && j<=(n-1)/2  ||
					
						(j-i>=((n-1)/2) && i<=(n-1)/2 && j>(n-1)/2)   ||
						(j==0 && i>=(n-1)/2  &&  i<n-1)  ||
						(i==n-2&& j>=0 && j<=n-1)    ||
						(j==n-1 && i>(n-2)/2) && (i<n-1)) 
						  
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}

				if(i==n && j>=0 && j<=n-1)
				{
					break;
				}
				
			}
			System.out.println();


		}
	}

}
