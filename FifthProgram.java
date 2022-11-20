package in.neuron.main;

public class FifthProgram {

	public static void main(String args []) {
		int n=15;
		for(int i=0; i<n; i++)
		{
			if(i==n-1)
			{
				break;
			}

			for(int j=0; j<n; j++)
			{
				if( i==0 && j>=0 && j<=n-2 || i==n-2 && j>=0 && j<=n-2 ||
						(i+j<=((n-1)/2)-1 && i<=(n-1)/2 && j<=(n-1)/2) ||
				
						(i-j>=((n-1)/2)-1 && i>=(n-1)/2 && j<=(n-1)/2 
						)   
						)
						
				
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}

			}			
			System.out.println();
		}
			

	}
}


