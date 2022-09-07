#include <stdio.h>
#include<stdlib.h>

int main()
{
    char c;
    scanf("%c",&c);
    
    //toggle character case
    printf("%c",c^(1<<5));
    
    //convert to lowercase
    printf("%c",c|(1<<5));
    
    //convert to uppercase
    printf("%c",c&(~(1<<5)));
}
