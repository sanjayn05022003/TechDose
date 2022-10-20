/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */


struct ListNode* reverseList(struct ListNode* head){
    
    struct ListNode* h=NULL;
    struct ListNode* ptr=NULL;
    
    struct ListNode* temp=head;
    
    while(temp!=NULL){
        struct ListNode* nn=(struct Node*)malloc(sizeof(struct ListNode));
        if(h==NULL){
            nn->val=temp->val;
            nn->next=NULL;
            
            h=nn;
            ptr=h;
        }
        else{
            nn->val=temp->val;
            nn->next=ptr;
            
            h=nn;
            ptr=h;
        }
        temp=temp->next;
    }
    return h;
}
