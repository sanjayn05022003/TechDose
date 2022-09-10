#include <stdio.h>
#include<stdlib.h>

int fact(int n){
    if(n==0) return 1;
    return n*fact(n-1);
}
int main()
{
    int n,r;
    scanf("%d %d",&n,&r);
    
    int ncr=fact(n)/(fact(r)*fact(n-r));
    printf("%d",ncr);

    return 0;
}
