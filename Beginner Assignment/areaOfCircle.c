#include <stdio.h>
#include<stdlib.h>
#define PI 3.1415

int main()
{
    int radius;
    scanf("%d",&radius);
    
    double area=PI*radius*radius;
    
    printf("%lf",area);
    return 0;
}
