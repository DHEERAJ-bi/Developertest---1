package in.neuron.main;

public class FourthProgram {
	public static void main (String args[]) {
		int n =14;
		for(int i=1; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				if(   (i-j>=(n-1)/2 && i>=((n-1)/2) && j<=(n-1)/2)  ||
						((i+j)>= n-1 + (n-1)/2 && i>=(n-1)/2 && j>=(n-1)/2)  ) 
				{
					System.out.print("*");
				}else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}

}
