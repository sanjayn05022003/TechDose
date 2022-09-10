#include <stdio.h>
#include<stdlib.h>

int isprime(int n){
    for(int i=3;i<n;i++){
        if(n%i==0){
            return 0;
        }
    }
    return 1;
    
}
int main()
{
    int n;
    scanf("%d",&n);
    
    for(int i=1;i<n;i++){
        if(isprime(i)){
            printf("%d ",i);
        }
    }

    return 0;
}
