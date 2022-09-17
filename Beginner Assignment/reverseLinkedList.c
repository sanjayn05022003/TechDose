#include<stdio.h>
#include<stdlib.h>
#include<string.h>
/*create a structure named as Node */
struct Node{
    int data;
    struct Node* next;
};

void append ( struct Node **head, int data );
void display ( struct Node *head );

struct Node* reverse(struct Node* head){
    struct Node* prev=NULL;
    struct Node* temp;
    
    while(head!=NULL){
        temp=head->next;
        head->next=prev;
        prev=head;
        head=temp;
    }
    head=prev;
    return head;
}
int main() {
    printf("Enter the number of nodes:\n");
    int n;
    scanf("%d ",&n);
    
    struct Node* head=NULL;
    
    for(int i=1;i<=n;i++){
        int val;
        scanf("%d\n",&val);
        append(&head,val);
    }
    
    display(head);
    head=reverse(head);
	
	display(head);
	return 0;
}

/* adds a node at the end of a linked list */
void append ( struct Node **head, int data ){
	struct Node* nn=(struct Node* )malloc(sizeof(struct Node*));
	nn->data=data;
	nn->next=NULL;
	
	struct Node* tail;
	
	if(*head==NULL){
	    *head=nn;
	    tail=*head;
	}
	else{
	    tail->next=nn;
	    tail=nn;
	}
}

void display ( struct Node *head ){
	printf("The elements in the linked list are ");
	
	struct Node* temp=head;
	while(temp->next!=NULL){
	    printf("%d->",temp->data);
	    temp=temp->next;
	}
	printf("%d->NULL",temp->data);
}

