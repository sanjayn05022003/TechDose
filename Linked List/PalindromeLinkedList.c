/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */


bool isPalindrome(struct ListNode* head){
    struct ListNode* temp=head;
    
    int n=0;
    while(temp!=NULL){
        n++;
        temp=temp->next;
    }
    
    int* arr=(int *)malloc(sizeof(int)*n);
    int a=0;
    
    temp=head;
    
    while(temp!=NULL){
        arr[a++]=temp->val;
        temp=temp->next;
    }
    
    int l=0,r=a-1;
    
    while(l<r){
        if(arr[l]!=arr[r]){
            return false;
        }
        l++;
        r--;
    }
    return true;
    
        
}
