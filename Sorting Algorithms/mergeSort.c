#include <stdio.h>
#include<stdlib.h>

void merge(int n,int arr[n],int low,int mid,int high){
    int l=low,m=mid+1;
    
    int tempArr[n],t=0;
    
    while(l<=mid && m<=high){
        if(arr[l]<=arr[m]){
            tempArr[t++]=arr[l++];
        }
        else{
            tempArr[t++]=arr[m++];
        }
    }
    
    while(l<=mid){
        tempArr[t++]=arr[l++];
    }
    while(m<=high){
        tempArr[t++]=arr[m++];
    }
    
    for(int i=low;i<=high;i++){
        arr[i]=tempArr[i-low];
    }
}
void mergeSort(int n,int arr[n],int low,int high){
    if(low==high){
        return;
    }
    int mid=low+(high-low)/2;
    
    mergeSort(n,arr,low,mid);
    mergeSort(n,arr,mid+1,high);
    merge(n,arr,low,mid,high);
}
int main()
{
    int n;
    scanf("%d",&n);
    
    int arr[n];
    
    for(int i=0;i<n;i++){
        scanf("%d ",&arr[i]);
    }
    
    mergeSort(n,arr,0,n-1);
    
    for(int i=0;i<n;i++){
        printf("%d ",arr[i]);
    }

    return 0;
}
