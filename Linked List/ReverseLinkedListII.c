/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */


struct ListNode* reverseBetween(struct ListNode* head, int left, int right){
    if(head->next==NULL){
        return head;
    }
    if(head->next->next==NULL){
        
    }
    if(left==right){
        return head;
    }
    int index=1;
    struct ListNode* hh=NULL;
    struct ListNode* ptr=head;
    struct ListNode* tail;
    
    struct ListNode* temp1=head;
    
    while(temp1!=NULL && index<=left-1){
        temp1=temp1->next;
        index++;
    }
    
    struct ListNode* end;
    
    while(temp1!=NULL && index<=right){
        struct ListNode* nn=(struct ListNode*)malloc(sizeof(struct ListNode));
        if(hh==NULL){
            nn->val=temp1->val;
            nn->next=NULL;
            hh=nn;
            tail=hh;
            ptr=hh;
        }
        else{
         struct ListNode* nn=(struct ListNode*)malloc(sizeof(struct ListNode));
             nn->val=temp1->val;
             nn->next=hh;
            hh=nn;
        }
        end=temp1->next;
        temp1=temp1->next;
        index++;
    }
    
    if(left==1){
        tail->next=end;
        return hh;
    }
    index=1;
    temp1=head;
    
    while(temp1!=NULL && index<left-1){
        index++;
        temp1=temp1->next;
    }
    temp1->next=hh;
    tail->next=end;
    
    
    return head;
}
