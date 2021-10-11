
#include <stdio.h>
#include <stdlib.h>
struct Node
{
    int data;
    struct Node *prev;
    struct Node *next;
};

struct Node* AdtoEmpty(struct Node* head,int data)
{
    struct Node* temp=malloc(sizeof(struct Node));
    temp->prev=NULL;
    temp->data=data;
    temp->next=NULL;
    head=temp;
    return head;

}
struct Node* AdtoBeg(struct Node* head,int data)
{
    struct Node *temp=malloc(sizeof(struct Node));
    temp->prev=NULL;
    temp->data=data;
    temp->next=NULL;
    temp->next=head;
    head->prev=temp;
    head= temp;
    return head;
}
struct Node* addAtEnd(struct Node* head,int data)
{
    struct Node* temp, *tp;
    temp=malloc(sizeof(struct Node));
    temp->prev= NULL;
    temp->data=data;
    temp->next=NULL;
    tp=head;
    while(tp->next!=NULL)
        tp=tp->next;
    tp->next=temp;
    temp->prev= tp;
    return head;
    printf("hk");
};

int main()
{
    struct Node* head=NULL;
    struct Node* ptr;
    head=AdtoBeg(head,44);
    head=AdtoEmpty(head,40);
    head=addAtEnd(head,55);
    ptr=head;

    while(ptr!=NULL)
    {
        printf("%d ",ptr->data);
        ptr=ptr->next;

    }
    return 0;
}
