#include<stdio.h>

main()
{
	int i,j,n;
	
	printf("\n\t Enter the Number = ");
	scanf("%d",&n);
	
	for(i=1;i<=n;i++)
	{
		printf("\n");
		
		for(j=n-i;j>=0;j--)
			printf("*");
			
		for(j=1;j<=2*i-2;j++)
			printf(" ");
			
		for(j=n-i;j>=0;j--)
			printf("*");
	}
	
}

