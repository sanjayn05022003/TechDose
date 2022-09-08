#include <stdio.h>
#include<stdlib.h>

int main()
{
    int n,pos;
    scanf("%d %d",&n,&pos);
    
    if((n&(1<<pos-1))!=0){
        printf("YES");
    }
    else{
        printf("NO");
    }
    

    return 0;
}
