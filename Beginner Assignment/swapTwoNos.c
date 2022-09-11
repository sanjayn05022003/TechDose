#include <stdio.h>
#include<stdlib.h>

int main()
{
    int a,b;
    scanf("%d %d",&a,&b);
    
    a=(a+b)-(b=a);
    printf("%d %d",a,b);

    return 0;
}
