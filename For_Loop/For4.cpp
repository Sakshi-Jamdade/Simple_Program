#include<stdio.h>

main()
{
	int n,i,flg,j,x;			
	printf("\n\t Enter the Range = ");
	scanf("%d",&x);	
	
	for(j=1;j<=x;j++)
	{
		for(n=j,i=2,flg=0;i< n/2;i++)	
		{
			if(n%i == 0)
			{
				flg=1;	
				break;	// go to if(flg==0)	
			}
		}
			
		if(flg==0)	
			printf("\n\t %d is Prime Number",n);	
	}
}
