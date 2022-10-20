/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */


struct ListNode* swapNodes(struct ListNode* head, int k){
    struct ListNode* ptr=head;
    int arr[100000],a=0;
    
    while(ptr!=NULL){
        arr[a++]=ptr->val;
        ptr=ptr->next;
    }
    int t=arr[k-1];
    arr[k-1]=arr[a-k];
    arr[a-k]=t;
    
    struct ListNode* newHead=NULL;
    struct ListNode* tail=NULL;
    
    int ind=0;
    while(ind<a){
        struct ListNode* nn=(struct ListNode*)malloc(sizeof(struct ListNode));
        nn->val=arr[ind];
        nn->next=NULL;
        if(newHead==NULL){
            newHead=nn;
            tail=nn;
        }
        else{
            tail->next=nn;
            tail=nn;
        }
        ind++;
    }
    return newHead;
    
    
    
}
