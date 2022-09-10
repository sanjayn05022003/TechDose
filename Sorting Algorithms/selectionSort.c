#include <stdio.h>
#include<stdlib.h>

int main()
{
    int n;
    scanf("%d",&n);
    
    int arr[n];
    for(int i=0;i<n;i++){
        scanf("%d ",&arr[i]);
    }

    for(int i=0;i<n;i++){
        int minind=i;
        for(int j=i+1;j<n;j++){
            if(arr[j]<arr[minind]){
                minind=j;
            }
        }
         int t=arr[i];
         arr[i]=arr[minind];
         arr[minind]=t;
        
        printf("%d ",arr[i]);
    }

    return 0;
}
