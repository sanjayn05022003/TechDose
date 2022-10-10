void rotate(int* nums, int numsSize, int k){
    int n=numsSize;
    
    int arr[n];
    for(int i=0;i<n;i++){
        arr[(i+k)%numsSize]=nums[i];
    }
    for(int i=0;i<n;i++){
        nums[i]=arr[i];
    }
}
