#include<stdio.h>

main()
{
	int i,j,n,k;
	
	printf("\n\t Enter the Number = ");
	scanf("%d",&n);
	
	for(i=65,k=65;i<n+65;i++)
	{
		printf("\n\t");
		for(j=65;j<=i;j++,k++)
		{
			printf("%3c",k);
		}
	}
	
}

