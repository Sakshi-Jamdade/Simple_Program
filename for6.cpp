#include<stdio.h>

main()
{
	int i,j,n;
	
	printf("\n\t Enter the Number = ");
	scanf("%d",&n);
	
	for(i=0;i<n;i++)
	{
		printf("\n\t");
		for(j=0;j<=i;j++)
		{
			printf("*");
		}
	}
	
}

