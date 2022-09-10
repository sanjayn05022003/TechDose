#include <stdio.h>
#include<stdlib.h>

int main()
{
    int n;
    scanf("%d",&n);
    
    int factors[1001],f=0;
    for(int i=1;i<=n;i++){
        if(n%i==0){
            factors[f++]=i;
        }
    }
    
    for(int i=0;i<f;i++){
        printf("%d ",factors[i]);
    }

    return 0;
}
