#include <stdio.h>
#include<stdlib.h>

int main()
{
    int a;
    scanf("%d",&a);
    
    for(int i=1;i*i<=a;i++){
        if(i*i ==a){
            printf("Perfect Square number is %d",i);
            return 0;
        }
    }
    printf("Not a Perfect Square");

    return 0;
}
