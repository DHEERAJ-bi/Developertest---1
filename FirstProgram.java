package in.neuron.main;

public class FirstProgram {

	public static void main(String[] args) {
		int n=10;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<(n*3)/2;j++)
			{
				if((i==0 && j>=0 && j<=n-1) ||
						(j==(n-1)/2 && i>=0 && i<=n-1) ||
						(i==n-1 && j>=0 && j<=n-1)) 
				{
				System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			
			
			for(int j=0; j<(n*3)/2; j++)
			{
				if((j==0 && i>=0 && i<=n-1) ||
						(i==j) ||
						(j==n-1 && i>=0 && i<=n-1)  )
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			
			
			for(int j=0; j<(n*3)/2; j++)
			{
				if( j==0 && i>=0 && i<=n-1    ||
						(i==0 && j>0 && j<=n-1) ||
						(i==(n-1)/2 && j>0 && j<=n-1) ||
						(i==n-1 && j>0 && j<n-1)  ) 
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			
			
			
			for(int j=0; j<(n*3)/2; j++)
			{
				if( (j==0 && i>=0 && i<=n-2) || 
						(j==n-1 && i>=0 && i<=n-2) ||
				        (i==n-1 && j>=1 && j<=(n-1)/2 + 4 ))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			
			

			for(int j=0; j<(n*3)/2; j++)
			{
				if( (j==0 && i>=0 && i<=n-1) ||
						(i==0 && j>=0 && j<=n-3)  ||
						(i==(n-1)/2 && j>0 && j<=n-3)   ||
						i==1 && j==n-2  ||
						i==2 && j==n-1  ||
						i==3 && j==n-1  ||
						i==4 && j==n-2  ||
						i==j && i>(n/2)-1 && j>(n/2)-1 )
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			
			
			
			for(int j=0;j<(n*3)/2;j++)
			{
				if((i==0 && j>0 && j<=n-2)||
						
						(j==0 && i>0 && i<n-1)|| 
						(i==n-1 && j>=1 && j<n-1) || 
						(j==n-1 && i>0 && i<n-1)  )
				{
				System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			
			
			for(int j=0; j<(n*3)/2; j++)
			{
				if((j==0 && i>=0 && i<=n-1) ||
						(i==j) ||
						(j==n-1 && i>=0 && i<=n-1)  )
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