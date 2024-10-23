#include<stdio.h>

main()
{
	int i,j,n,k;
	
	printf("\n\t Enter the Number = ");
	scanf("%d",&n);
	
	for(i=n,k=1;i>0;i--)
	{
		printf("\n\t");
		for(j=1;j<=i;j++,k++)
		{
			printf("%3d",k);
		}
	}
	
}

