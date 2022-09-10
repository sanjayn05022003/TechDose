#include <stdio.h>
#include<stdlib.h>

int catalan(int n){
    if(n<=1) return 1;
    
    int sum=0;
    for(int i=0;i<n;i++){
        sum+=(catalan(i)+catalan(n-i-1));
    }
    return sum;
}
int main()
{
    int n;
    scanf("%d",&n);
    
    for(int i=0;i<n;i++){
        printf("%d ",catalan(i));
    }

    return 0;
}
