/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */


struct ListNode* removeElements(struct ListNode* head, int val){
    
  if(head==NULL){
        return head;
    }
    
    int p=0;
    struct ListNode* pp=head;
   // pp=pp->next;
    
    while(pp!=NULL){
        if(pp->val!=val){
            p=1;
        }
        pp=pp->next;
    }
    if(p==0){
        return NULL;
    }
 
    struct ListNode* ptr=head;
    struct ListNode* prev=NULL;
    
    while(ptr!=NULL){
        
        if(ptr->val==val){
            if(prev==NULL){ 
                while(ptr->next!=NULL && ptr->next->val==val){
                    ptr=ptr->next;
                }
                head=ptr->next;
            }
            else{
                while(ptr->next!=NULL && ptr->next->val==val){
                    ptr=ptr->next;
                }
                prev->next=ptr->next;
            }
                
        }
        
        prev=ptr;
        ptr=ptr->next;
    }
    return head;
}
