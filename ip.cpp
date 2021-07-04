#include<conio.h>
#include<stdio.h>
#include<math.h>
long dectobin(long n);
int main()
{
long int i,bin[100],binmask[100],firstaddr[100],a[4],defmaska[4]={255,0,0,0},defmaskb[4]={255,255,0,0},defmaskc[4]={255,255,255,0};
clrscr();
printf("Enter the IP Address :\n");
	for(i=0;i<4;i++)
	{
	scanf("%d",&a[i]);
	}
printf("\nYour IP Address is :\n");
	for(i=0;i<4;i++)
	{
	printf("%d.",a[i]);
	}
	i=0;
	if(i==0)
	{
		if(a[i]>0 && a[i]<=127)
		{
			printf("\nClass A\n");
			printf("Default mask is :\n");
			for(i=0;i<4;i++)
			{
				printf("%d.",defmaska[i]);
			}
			printf("\n1st address is :\n");
			for(i=0;i<4;i++)
			{
				bin[i]=dectobin(a[i]);
				binmask[i]=dectobin(defmaska[i]);
				firstaddr[i]=bin[i] && binmask[i];
				printf("%ld",firstaddr[i]);
			}
		}
		else if(a[i]>127 && a[i]<=191)
		{
			printf("\nClass B\n");
			printf("Default mask is :\n");
			for(i=0;i<4;i++)
			{
				printf("%d.",defmaskb[i]);
			}
			printf("\n1st address is :\n");
			for(i=0;i<4;i++)
			{
				bin[i]=dectobin(a[i]);
				binmask[i]=dectobin(defmaska[i]);
				firstaddr[i]=bin[i] && binmask[i];
				printf("%ld",firstaddr[i]);
			}
		}
			else if(a[i]>191 && a[i]<=223)
		{
			printf("\nClass C\n");
			printf("Default mask is :\n");
			for(i=0;i<4;i++)
			{
				printf("%d.",defmaskc[i]);
			}
			printf("\n1st address is :\n");
			for(i=0;i<4;i++)
			{
				bin[i]=dectobin(a[i]);
				binmask[i]=dectobin(defmaska[i]);
				firstaddr[i]=bin[i] && binmask[i];
				printf("%ld",firstaddr[i]);
			}
		}
	}
getch();
return 0;
}
long dectobin(long n)
{
	int rem;
	long decimal=0,j=1;
	while(n!=0)
	{
		rem=n%2;
		n=n/2;
		decimal=decimal + (rem*j);
		j=j*10;
	}
	return decimal;
}
