#include<stdio.h>
void main()
{
	double f,c;
	printf("Enter the farheinheight temperature :");
	scanf("%f",&f);
	c = (((f-32)+5)/9);
	printf("The temperature in centrigrade is %f",c);
	return 0;
}
