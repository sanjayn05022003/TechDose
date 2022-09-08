#include <stdio.h>
#include<stdlib.h>

int main()
{
    int n,pos;
    scanf("%d %d",&n,&pos);
    printf("%d",n ^ (1<<(pos-1)));

    return 0;
}
