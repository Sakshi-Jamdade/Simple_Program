#include<stdio.h>

main()
{
	int i,j,n;
	
	printf("\n\t Enter the Number = ");
	scanf("%d",&n);
	
	for(i=n;i>0;i--)
	{
		printf("\n\t");
		for(j=1;j<=i;j++)
		{
			printf("%3d",i);
		}
	}
	
}

