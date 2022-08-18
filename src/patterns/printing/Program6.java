package com.patterns.printing;

public class Program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*
	
	1
  	**
  	4*6
  	*8910
prime 2 3 5 7

1 2 3 4 5 6 7 8 9 10
	
*/// i    j    q   k
	

		int i,j,k=1,count;
		
		for(i=1;i<5;i++)
		{
			for(j=1;j<=i;j++)
			{
				count=0;
				for(int q=1;q<=k;q++)
				{
					if(k%q==0)
			{
						count++;
					}
				}
				if(count==2)
				{
					System.out.print("* ");
					k++;
				}
				else
				{
					System.out.print(k+++" ");
				}
			}
			System.out.println();
		}
	
	
	
	
	
	}

}
