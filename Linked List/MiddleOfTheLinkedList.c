/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */


struct ListNode* middleNode(struct ListNode* head){
    struct ListNode* ptr1=head;
    int count=0;
    
    while(ptr1!=NULL){
        count++;
        ptr1=ptr1->next;
    }
    
    count=count/2;
    
    struct ListNode* ptr2=head;
    int c=0;
    
    while(c!=count && ptr2!=NULL){
        ptr2=ptr2->next;
        c++;
    }
    head=ptr2;
    return head;
}
