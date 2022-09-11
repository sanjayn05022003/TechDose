#include <stdio.h>
#include<stdlib.h>

int findGCD(int a,int b){
    if(a==0){
        return b;
    }
    else{
        return findGCD(b%a,a);
    }
}
int main()
{
    int a,b;
    scanf("%d %d",&a,&b);
    
    int gcd=findGCD(a,b);
    printf("%d",gcd);
    
    return 0;
}
