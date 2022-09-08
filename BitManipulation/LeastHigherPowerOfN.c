#include <stdio.h>
#include<stdlib.h>

int main()
{
    int n;
    scanf("%d",&n);
    
    while(n>0 && n&(n-1)){
        n=(n&(n-1));
    }
    printf("%d",n);
    return 0;
}
