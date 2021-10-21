/******************************************************************************
Queue and its operations using array 

*******************************************************************************/
#include <stdio.h>
#include<stdlib.h>

//struct to use a dynamic 
struct queue{
    int size;
    int f;
    int r;
    int* arr;
};
//full function 
int isFull(struct queue *q){
    if(q->r==q->size-1){
        return 1;
    }
    return 0;
}
//Empty function 
int isEmpty(struct queue *q){
    if(q->r==q->f){
        return 1;
    }
    return 0;
}
//insert in queue
void enqueue(struct queue *q, int val){
    if(isFull(q)){
        printf("This queue is full");
        
    }
    else{
        q->r++;
        q->arr[q->r]=val;
    }
}

//Delete in queue
int dequeue(struct queue *q){
    int a=-1;
    if(isEmpty(q)){
        printf("This queue is Empty");
        
    }
    else{
        q->f++;
        a=q->arr[q->f];
    }
   return a;
}

int main()
{
    struct queue q;
    q.size=100;
    q.f=q.r=-1;
    q.arr = (int*) malloc(q.size*sizeof(int));
    
    //Enqueue few elements
    enqueue(&q, 12);//taking address and value
    enqueue(&q, 15);
    
    //Dequeuing element
    printf("Dequeuing element %d", dequeue(&q));
    
    if(isEmpty(&q)){
        printf("Queue is Empty");
    }
    if(isFull(&q)){
        printf("Queue is Full");
    }
    return 0;
    
    
}

