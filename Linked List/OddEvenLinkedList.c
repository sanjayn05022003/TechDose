/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */


struct ListNode* oddEvenList(struct ListNode* head){
    struct ListNode* temp=head;
    int *arr=(int *)malloc(sizeof(int)*1000000);
    int a=0;
    
    while(temp!=NULL){
        arr[a++]=temp->val;
        temp=temp->next;
    }
    int *upp=(int *)malloc(sizeof(int)*1000000);
    int u=0;
    
    for(int i=0;i<a;i+=2){
        upp[u++]=arr[i];
    }
    for(int i=1;i<a;i+=2){
        upp[u++]=arr[i];
    }
    
    struct ListNode* newHead=NULL;
    struct ListNode* tail=NULL;
    int ind=0;
    
    while(ind<u){
        struct ListNode* nn=(struct ListNode*)malloc(sizeof(struct ListNode));
        nn->val=upp[ind];
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
