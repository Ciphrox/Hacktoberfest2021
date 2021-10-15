#include<stdio.h>
#include<stdlib.h>
struct node {
    int data;
    struct node *next;
};

void traverse(struct node *temp)
{
     printf("printing values . . . . .\n"); 
    while(temp!=NULL)
    {
        printf("%d-->",temp->data);
        temp=temp->next;
    }
}

int main()
{
    struct node *head=NULL;
    struct node *first=NULL;
    struct node *second=NULL;
    struct node *third=NULL;

    head=(struct node*)malloc(sizeof(struct node));
    first=(struct node*)malloc(sizeof(struct node));
    second=(struct node*)malloc(sizeof(struct node));
    third=(struct node*)malloc(sizeof(struct node));

    struct node *temp=head;
    head->next=first;

    first->data=2;
    first->next=second;

    second->data=4;
    second->next=third;

    third->data=6;
    third->next=NULL;

    traverse(temp->next);

    return 0;

}
