class Solution {

    public void merge(int[] nums,int[] temp, int low, int mid, int high){
        
        int len=nums.length;

        int l=low, m=mid+1, ind=l;

        while(l<=mid && m<=high){

            if(nums[l]<=nums[m]){
                temp[ind++]=nums[l++];
            }
            else{
                temp[ind++]=nums[m++];
            }
        }

        while(l<=mid){
            temp[ind++]=nums[l++];
        }
        while(m<=high){
            temp[ind++]=nums[m++];
        }

        while(low<=high){  //copy temp to nums
            nums[low]=temp[low++];
        }
    }
    public void mergeSort(int[] nums,int[] temp, int low, int high){

        if(low==high){
            return;
        }

        int mid=low+(high-low)/2;

        mergeSort(nums, temp, low, mid);
        mergeSort(nums, temp, mid+1, high);

        merge(nums, temp, low, mid, high);
    }
    public int[] sortArray(int[] nums) {
        
        int len=nums.length;
        mergeSort(nums,new int[len], 0, len-1);

        return nums;
    }
}
