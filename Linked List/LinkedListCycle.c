/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
bool hasCycle(struct ListNode *head) {
    for(;head!=NULL;head=head->next){
        if(head->val==1000001){
            return true;
        }
        head->val=1000001;
    }
    return false;
}
