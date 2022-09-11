#include <stdio.h>
#include<stdlib.h>

int main()
{
    int n;
    scanf("%d",&n);
    
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i+1;j++){
            printf("%d ",n-i-j+2);
        }
        printf("\n");
    }
    return 0;
}
