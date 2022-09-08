#include <stdio.h>
#include<stdlib.h>

int rightMostSetBitN(int n){
    return (n&(~n)+1);
}
int rightMostSetBitPos(int n){
    int pos=0;
    while(n&1==0){
        n>>=1;
        pos++;
    }
    return pos+1;
}
int main()
{
    int n;
    scanf("%d",&n);
    
    printf("%d ",rightMostSetBitN(n));
    printf("%d ",rightMostSetBitPos(n));
  
    return 0;
}
